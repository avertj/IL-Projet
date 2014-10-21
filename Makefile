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



TS_TestAssign001.class : Explosives.class TS_TestAssign001.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TS_TestAssign001.java

TS_TestAssign001.run : TS_TestAssign001.class
	 java -cp $(JMLJUNITCLASSPATH) TS_TestAssign001



TS_TestAssign002.class : Explosives.class TS_TestAssign002.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TS_TestAssign002.java

TS_TestAssign002.run : TS_TestAssign002.class
	 java -cp $(JMLJUNITCLASSPATH) TS_TestAssign002


TS_TestAssign003.class : Explosives.class TS_TestAssign003.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TS_TestAssign003.java

TS_TestAssign003.run : TS_TestAssign003.class
	 java -cp $(JMLJUNITCLASSPATH) TS_TestAssign003



TS_TestAssign004.class : Explosives.class TS_TestAssign004.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TS_TestAssign004.java

TS_TestAssign004.run : TS_TestAssign004.class
	 java -cp $(JMLJUNITCLASSPATH) TS_TestAssign004



TS_TestAssign005.class : Explosives.class TS_TestAssign005.java
	$(JAVAC) -classpath $(JMLJUNITCLASSPATH)  TS_TestAssign005.java

TS_TestAssign005.run : TS_TestAssign005.class
	 java -cp $(JMLJUNITCLASSPATH) TS_TestAssign005



eclipseBin :
	cp *.class ../bin
	
clean : 
	rm -f *.class

