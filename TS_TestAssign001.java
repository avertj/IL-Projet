
import org.junit.*; // JUnit4



public class TS_TestAssign001 
 {

    static int nb_inc = 0;
    static int nb_fail = 0;
    static int nb_err = 0;
 	
    public static void main(String args[]) {

         org.junit.runner.JUnitCore.main("TS_TestAssign001");
 
        System.out.println("inconclusive tests: "+TS_TestAssign001.nb_inc+" -- failures : "+TS_TestAssign001.nb_fail+" -- errors : "+TS_TestAssign001.nb_err );
     }
		
    @Test
 	public void testSequence_1() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_2() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_3() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_4() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_5() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_6() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_7() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_8() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_9() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_10() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_11() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_12() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod1") ;
    e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_13() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_14() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
    e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_15() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
    e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_16() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
    e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_17() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
    e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_18() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod2") ;
    e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_19() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_20() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
    e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_21() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
    e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_22() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
    e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_23() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
    e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_24() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat1","Prod3") ;
    e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_25() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_26() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
    e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_27() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
    e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_28() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
    e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_29() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
    e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_30() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod1") ;
    e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_31() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_32() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
    e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_33() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
    e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_34() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
    e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_35() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
    e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_36() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod2") ;
    e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_37() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
    e.add_assign("Bat1","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_38() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
    e.add_assign("Bat1","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_39() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
    e.add_assign("Bat1","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_40() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
    e.add_assign("Bat2","Prod1") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_41() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
    e.add_assign("Bat2","Prod2") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

    @Test
 	public void testSequence_42() 
 throws Exception{ try{  Explosives e = new Explosives()  ;
    e.add_incomp("Prod1","Prod2") ;
     e.add_assign("Bat2","Prod3") ;
    e.add_assign("Bat2","Prod3") ;
      } 
		catch(org.jmlspecs.jmlrac.runtime.JMLEntryPreconditionError e$){System.out.println("\n INCONCLUSIVE "+(new Exception().getStackTrace()[0].getMethodName())+ "\n\t "+ e$.getMessage());
                               TS_TestAssign001.nb_inc++;}
	catch(org.jmlspecs.jmlrac.runtime.JMLAssertionError e$){
// test failure	
			TS_TestAssign001.nb_fail++;

			junit.framework.Assert.fail("\n\t " +e$.getClass()+"\n\t " + e$.getMessage());
	}
	 catch (Exception e) {TS_TestAssign001.nb_err++;
	
		throw e;
	   }   

			
  	}

}
