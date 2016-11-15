import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  Carlos Manrique Enguita
 * @version 141116
 */
//@RunWith(JUnit4.class)
public class PersonTest{
    
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown(){
    }

    @Test
    public void testGender(){
        Person dummy = new Person();
        
        dummy.setGender(Person.MALE_VALUE);
        assertEquals(false, dummy.getGender());
        //assertEquals(false, dummy.isAGirl());
        
        dummy.setGender(Person.FEMALE_VALUE);
        assertEquals(true, dummy.getGender());
        //assertEquals(true, dummy.isAGirl());
    }

    @Test
    public void testCriticalAge(){
        Person dummy = new Person();
        
        dummy.setAge(0);
        assertEquals(Person.ADULTHOOD_AGE, dummy.getCriticalAge());
        
        dummy.setAge(Person.ADULTHOOD_AGE);
        assertEquals(0, dummy.getCriticalAge());
        
        dummy.setAge(Person.ADULTHOOD_AGE+1);
        assertEquals(Person.RETIREMENT_AGE - (Person.ADULTHOOD_AGE+1), dummy.getCriticalAge());
        
        dummy.setAge(Person.RETIREMENT_AGE);
        assertEquals(0, dummy.getCriticalAge());
        
        dummy.setAge(Person.RETIREMENT_AGE+1);
        assertEquals(Person.RETIREMENT_AGE+1 - (Person.RETIREMENT_AGE), dummy.getCriticalAge());
    }

    @Test
    public void testIsAGirl(){
        Person dummy = new Person();
        
        dummy.setGender(Person.FEMALE_VALUE);
        assertEquals(true, dummy.isAGirl());
        
        dummy.setGender(Person.MALE_VALUE);
        assertEquals(false, dummy.isAGirl());
    }

    @Test
    public void testName(){
        Person dummy = new Person();
        
        dummy.setName("Carlos");
        assertEquals("Carlos", dummy.getName());
        
        dummy.setName(" ");
        assertEquals(" ", dummy.getName());
    }

    @Test
    public void testSurname()
    {
        Person dummy = new Person();
        
        dummy.setSurname("Manrique");
        assertEquals("Manrique", dummy.getSurname());
        
        dummy.setSurname(" ");
        assertEquals(" ", dummy.getSurname());
    }

    @Test
    public void testToString()
    {
        Person dummy = new Person();
        
        dummy.setGender(Person.FEMALE_VALUE);
        dummy.setName("Carlos");
        dummy.setSurname("Manrique");
        dummy.setAge(18);
        assertEquals("[Name: Carlos - Surname: Manrique - Age: 18 - Gender: Female]", dummy.toString());
        
        dummy.setGender(Person.MALE_VALUE);
        dummy.setName("Yuri");
        dummy.setSurname("Gagarin");
        dummy.setAge(20);
        assertEquals("[Name: Yuri - Surname: Gagarin - Age: 20 - Gender: Male]", dummy.toString());
    }

    @Test
    public void testHashCode(){
        Person dummy = new Person();
        
        dummy.setGender(Person.FEMALE_VALUE);
        dummy.setName("Carlos");
        dummy.setSurname("Manrique");
        dummy.setAge(18);
        assertEquals("CAR - MAN - 18 - Female", dummy.getHashCode());
       
        dummy.setGender(Person.MALE_VALUE);
        dummy.setName("Yuri");
        dummy.setSurname("Gagarin");
        dummy.setAge(20);
        assertEquals("YUR - GAG - 20 - Male", dummy.getHashCode());
    }
    
    @Test
    public void testIsYourAge()
    {
        Person dummy = new Person();
        
        dummy.setAge(0);
        assertEquals(true, dummy.isYourAge(0));
        
        dummy.setAge(Person.MAX_AGE_VALUE);
        assertEquals(true, dummy.isYourAge(Person.MAX_AGE_VALUE));
        assertEquals(false, dummy.isYourAge(Person.MAX_AGE_VALUE-1));       
        assertEquals(false, dummy.isYourAge(Person.MAX_AGE_VALUE+1));
        assertEquals(false, dummy.isYourAge(Person.MAX_AGE_VALUE*2));
    }
    
    @Test
    public void testIsYou()
    {
        Person dummy = new Person();
        
        dummy.setName("Nacho");
        assertEquals(true, dummy.isYou("Nacho"));
        assertEquals(false, dummy.isYou("Carmen"));
        
        dummy.setName("Carmen");
        assertEquals(true, dummy.isYou("Carmen"));
        assertEquals(false, dummy.isYou("Nacho"));
        
        dummy.setName("CARMEN");
        assertEquals(true, dummy.isYou("CARMEN"));
        assertEquals(false, dummy.isYou("NACHO"));
    }

    @Test
    public void testIsYouPerson()
    {
        Person a = new Person();
        Person b = new Person();
        
        a.setName("Yuri");
        a.setSurname("Gagarin");
        a.setAge(37);
        a.setGender(Person.MALE_VALUE);
        
        b.setName("Valentina");
        b.setSurname("Tereshkova");
        b.setAge(37);
        b.setGender(Person.FEMALE_VALUE);
        
        assertEquals(false, a.isYou(b));
        assertEquals(true, a.isYou(a));
        assertEquals(true, b.isYou(b));
        
        a.setName("Valentina");
        a.setSurname("Tereshkova");
        a.setGender(Person.FEMALE_VALUE);
        
        assertEquals(true, a.isYou(b));
        assertEquals(true, a.isYou(a));
        assertEquals(true, b.isYou(b));
    }
    
    @Test
    public void testCompareTo()
    {
        Person a = new Person();
        Person b = new Person();
        
        a.setAge(Person.ADULTHOOD_AGE); //ADULTHOOD_AGE
        b.setAge(Person.ADULTHOOD_AGE+1); //ADULTHOOD_AGE+1
        
        assertEquals(0, a.compareTo(a));
        assertEquals(0, b.compareTo(b));
        assertEquals(-1, a.compareTo(b));
        assertEquals(+1, b.compareTo(a));
    }
    
    @Test
    public void testAge() 
    {
        Person dummy = new Person();
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());
        dummy.setAge(Person.ADULTHOOD_AGE);
        assertEquals(Person.ADULTHOOD_AGE, dummy.getAge());
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());
        dummy.setAge(-1);
        //exception.expectMessage("Wrong: Value must be between 0 and 118!");
        assertEquals(0, dummy.getAge()); //here should be a throw exception,(ask in class)
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());     
        dummy.setAge(-25);
        assertEquals(0, dummy.getAge());
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());        
        dummy.setAge(Person.MAX_AGE_VALUE/2);
        assertEquals(Person.MAX_AGE_VALUE/2, dummy.getAge());
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());        
        dummy.setAge(Person.MAX_AGE_VALUE);
        assertEquals(Person.MAX_AGE_VALUE, dummy.getAge());
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());        
        dummy.setAge(Person.MAX_AGE_VALUE+1);
        assertEquals(0, dummy.getAge());
        
        dummy.setAge(0);
        assertEquals(0, dummy.getAge());        
        dummy.setAge(Person.MAX_AGE_VALUE*2);
        assertEquals(0, dummy.getAge());
    }
}