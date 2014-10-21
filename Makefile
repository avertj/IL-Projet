JMLC = C:\Dev\M2PGI\IL-sem1\JML\bin\jmlc -O -Q -G
JAVA = "C:\Program Files\Java\jdk1.6.0_45\bin\java"
JAVAC = "C:\Program Files\Java\jdk1.6.0_45\bin\javac"
JUNIT4 = "C:\Dev\eclipse\plugins\org.junit_4.11.0.v201303080030\junit.jar"
JMLRUNTIME = "C:\Dev\M2PGI\IL-sem1\JML\bin\jmlruntime.jar"
JMLCLASSPATH = .;$(JMLRUNTIME)
JMLJUNITCLASSPATH = $(JMLCLASSPATH);$(JUNIT4);C:\Dev\eclipse\plugins\org.infinitest.eclipse_5.1.110\lib\hamcrest-core-1.3.jar;

run : ExplosivesMain.class
	$(JAVA) -cp $(JMLCLASSPATH) ExplosivesMain

Explosives.class : Explosives.java
	C:\Dev\M2PGI\IL-sem1\JML\bin\jmlenv.bat
	$(JMLC) Explosives.java

ExplosivesMain.class : Explosives.class ExplosivesMain.java
	$(JAVAC) ExplosivesMain.java

TestExplosivesJUnit4.class : Explosives.class TestExplosivesJUnit4.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TestExplosivesJUnit4.java

TestExplosivesJUnit4.run : TestExplosivesJUnit4.class
	 java -cp $(JMLJUNITCLASSPATH) TestExplosivesJUnit4

TestExplosivesJUnit4Public.class : Explosives.class TestExplosivesJUnit4Public.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TestExplosivesJUnit4Public.java
	
TestExplosivesJUnit4Public.run : TestExplosivesJUnit4Public.class
	 java -cp $(JMLJUNITCLASSPATH) TestExplosivesJUnit4Public

eclipseBin :
	cp *.class ../bin
	
clean : 
	rm -f *.class

