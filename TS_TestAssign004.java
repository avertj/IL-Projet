
import org.junit.*; // JUnit4



public class TS_TestAssign004 
 {

    static int nb_inc = 0;
    static int nb_fail = 0;
    static int nb_err = 0;
 	
    public static void main(String args[]) {

         org.junit.runner.JUnitCore.main("TS_TestAssign004");
 
        System.out.println("inconclusive tests: "+TS_TestAssign004.nb_inc+" -- failures : "+TS_TestAssign004.nb_fail+" -- errors : "+TS_TestAssign004.nb_err );
     }
		
    @Test
 	public void testSequence_1() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign004.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign004.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign004.nb_err++;
	
		throw e;
	   }   

			
  	}

}
