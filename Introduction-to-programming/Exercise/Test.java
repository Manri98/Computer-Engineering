
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    /**
    * Constructor for objects of class Test
    */
    public Test()
    {
       
    }

    /**
     * Test the gender-related methods in the Person class
     * 
     * @return boolean True if everything is ok and False if it's not
     */
    private boolean testGender(){
        Person dummy = new Person();
        //Test 1 - getGender MaleisAGirl 
        dummy.setGender(Person.MALE_VALUE);
        if (dummy.getGender() != Person.MALE_VALUE){
            System.err.println ("T1: Male Value");
            return false;
        }
        
        //Test 2 - isAGirl Male
        dummy.setGender(Person.MALE_VALUE);
        if (dummy.isAGirl()){
            System.err.println ("T2: Male Value isAGirl");
            return false;
        }
        
        //Test 3 - getGender Female
        dummy.setGender(Person.FEMALE_VALUE);
        if (dummy.getGender() != Person.FEMALE_VALUE){
            System.err.println ("T3: Female Value");
            return false;
        }
        
        //Test 4 - isAGirl Female
        dummy.setGender(Person.FEMALE_VALUE);
        if (!dummy.isAGirl()){
            System.err.println ("T4: Male Value isAGirl");
            return false;
            
        }
        return true;
    }

    /**
     * Test the age-related methods in the Person class
     * 
     * @return boolean True if everything is ok and False if it's not
     */
    private boolean testAge(){   
        Person dummy = new Person();
        
        // POSITIVE TESTING
        // TEST 1
        dummy.setAge(0);
        if (dummy.getAge() != 0){
            System.err.println ("T1: 0");
            return false;
        }
                
        // TEST 2
        dummy.setAge(Person.MAX_AGE_VALUE);
        if (dummy.getAge() != Person.MAX_AGE_VALUE){
            System.err.println ("T2: " + Person.MAX_AGE_VALUE);
            return false;
        }
                
        // TEST 3
        dummy.setAge(Person.MAX_AGE_VALUE/2);
        if (dummy.getAge() != 0){
            System.err.println ("T3: " + Person.MAX_AGE_VALUE/2);
            return false;
        }
                
        // TEST 4
        dummy.setAge(-5);
        if (dummy.getAge() != -5){
            System.err.println ("T4: -5");
            return false;
        }
                
        // TEST 5
        dummy.setAge(-1);
        if (dummy.getAge() == -1){
            System.err.println ("T5: -1");
            return false;
        }
                
        // TEST 6
        dummy.setAge(Person.MAX_AGE_VALUE+1);
        if (dummy.getAge() == Person.MAX_AGE_VALUE+1){
            System.err.println ("T6: " + Person.MAX_AGE_VALUE+1);
            return false;
        }
                        
        // TEST 7
        dummy.setAge(Person.MAX_AGE_VALUE+200);
        if (dummy.getAge() == Person.MAX_AGE_VALUE+200){
            System.err.println ("T7: " + Person.MAX_AGE_VALUE+200);
            return false;
        }
        return true;
    }
    
    /**
     * Call all the testers
     * 
     * @return boolean True if everything is ok and False if it's not
     */
    public boolean test(){
        return testAge() && testGender();
    }
}
