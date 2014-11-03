JMLC = jmlc -O -Q -G
JAVA = java
JAVAC = javac
JUNIT4 = /usr/share/java/junit4.jar
JMLRUNTIME = /usr/share/jml/bin/jmlruntime.jar
JMLCLASSPATH = .:$(JMLRUNTIME)
JMLJUNITCLASSPATH = $(JMLCLASSPATH):$(JUNIT4)

run : ExplosivesMain.class
	$(JAVA) -cp $(JMLCLASSPATH) ExplosivesMain

Explosives.class : Explosives.java
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

