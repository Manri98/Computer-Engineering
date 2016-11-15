/**
 * Write a description of class Test here.
 * 
 * @author Carlos Manrique Enguita 
 * @version 141116
 */
public class Test
{
    
    public Test()
    {
    }
    
    //Test Methods
    
    /**
     * Test gender related methods in the Person class. Verifies the right behaviour of the setGender, getGender and isAGirl methods.
     * 
     * @return boolean true if the test runs correctly. False if at least one bugs is detected.
     */
    
    private boolean testGender()
    {
       Person dummy = new Person();
       
       //Test1: setGender and getGender
       dummy.setGender(Person.MALE_VALUE);
       if (dummy.getGender() != Person.MALE_VALUE)
       {
           System.err.println("ERROR DETECTED: getGender/setGender");
           return(false);
       }
       
       //Test 2: isAGirl
       if (dummy.isAGirl() == true)
       {
           System.err.println("ERROR DETECTED: isAGirl");
           return(false);
       }
       //Test...
       
       return(true); //reached the end bug-free, without errors
    }
    
    /** Test age related methods in the Person class. Verifies the right behaviour of the setAge, getAge and getCriticalAge methods.
     * 
     * @return boolean true if the test runs correctly. False if at least one bug is detected.
     */
    
    private boolean testAge()
    {
       Person dummy = new Person();
       
       //POSITIVE TESTING
       
       //Test1: setAge to 0
       dummy.setAge(0);
       if (dummy.getAge() != 0) 
       {
           System.err.println("ERROR DETECTED: age 0");
           return(false);
       }
       
       //Test 2: setAge to MAX_AGE_VALUE
       dummy.setAge(Person.MAX_AGE_VALUE); 
       if (dummy.getAge() != Person.MAX_AGE_VALUE) 
       {
           System.err.println("ERROR DETECTED: age " + Person.MAX_AGE_VALUE);
           return(false);
       }
       
       //Test 3: Random middle value
       dummy.setAge(Person.MAX_AGE_VALUE/2);
       if (dummy.getAge() != Person.MAX_AGE_VALUE/2) 
       {
           System.err.println("ERROR DETECTED: age 55");
           return(false);
       }
       
       //NEGATIVE TESTING
       
       dummy.setAge(0);
       
       //Test 1: setAge to -1
       dummy.setAge(-1);
       if (dummy.getAge() < 0) 
       {
           System.err.println("ERROR DETECTED: age -1");
           return(false);
       }
       
       //Test 2: setAge to -5
       dummy.setAge(-5);
       if (dummy.getAge() < 0) 
       {
           System.err.println("ERROR DETECTED: age -5");
           return(false);
       }
       
       dummy.setAge(Person.MAX_AGE_VALUE);
       
       //Test 3: setAge to MAX_AGE_VALUE+1
       dummy.setAge(Person.MAX_AGE_VALUE+1);
       if (dummy.getAge() > Person.MAX_AGE_VALUE) 
       {
           System.err.println("ERROR DETECTED: age " + Person.MAX_AGE_VALUE+1);
           return(false);
       }
       
       //Test 4: setAge to 2*MAX_AGE_VALUE
       dummy.setAge(2*Person.MAX_AGE_VALUE);
       if (dummy.getAge() > Person.MAX_AGE_VALUE) 
       {
           System.err.println("ERROR DETECTED: age " + 2*Person.MAX_AGE_VALUE);
           return(false);
       }

       return(true); //reached the end bug-free, without errors
    }
    
     /**
     * Invokes to every test method in this class.
     * 
     * @return boolean True if ALL the testing methods return true. False if at least one of the test methods returns false.
     */
    
    public boolean test()
    {
        /** if(testGender() == true && testAge() == true)
        return true;
        else
        return false;
        
        if(testGender() && testAge())
        return true;
        else
        return false; **/
        
        return testGender() && testAge();
    }
}