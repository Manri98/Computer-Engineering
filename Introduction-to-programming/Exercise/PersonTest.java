

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  Carlos Manrique Enguita
 * @version 081116
 */
public class PersonTest
{
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAge()
    {
        Person dummy = new Person();
        dummy.setAge(dummy.MIN_AGE_VALUE);
        assertEquals(dummy.MIN_AGE_VALUE, dummy.getAge());
        dummy.setAge(dummy.MAX_AGE_VALUE+1);
        assertEquals(dummy.MIN_AGE_VALUE, dummy.getAge());
        dummy.setAge(dummy.MIN_AGE_VALUE-1);
        assertEquals(dummy.MIN_AGE_VALUE, dummy.getAge());
        dummy.setAge(dummy.MIN_AGE_VALUE-50);
        assertEquals(dummy.MIN_AGE_VALUE, dummy.getAge());
        dummy.setAge(dummy.MAX_AGE_VALUE*2);
        assertEquals(dummy.MIN_AGE_VALUE, dummy.getAge());
        
        dummy.setAge(dummy.MAX_AGE_VALUE-1);
        assertEquals(dummy.MAX_AGE_VALUE-1, dummy.getAge());
        dummy.setAge(dummy.MAX_AGE_VALUE/2);
        assertEquals(dummy.MAX_AGE_VALUE/2, dummy.getAge());
        dummy.setAge(dummy.MAX_AGE_VALUE);
        assertEquals(dummy.MAX_AGE_VALUE, dummy.getAge());
        dummy.setAge(dummy.MIN_AGE_VALUE+1);
        assertEquals(dummy.MIN_AGE_VALUE+1, dummy.getAge());
    }

    @Test
    public void testName()
    {
        Person dummy = new Person();
        dummy.setName("prueba");
        assertEquals("prueba", dummy.getName());
    }
    
    @Test
    public void testSurname()
    {
        Person dummy = new Person();
        dummy.setSurname("prueba");
        assertEquals("prueba", dummy.getSurname());
    }
    
    @Test
    public void testCriticalAge()
    {
        Person dummy = new Person();
        dummy.setAge(dummy.MIN_AGE_VALUE);
        assertEquals(dummy.ADULTHOOD_AGE-dummy.MIN_AGE_VALUE, dummy.getCriticalAge());
        dummy.setAge(dummy.ADULTHOOD_AGE);
        assertEquals(dummy.RETIREMENT_AGE-dummy.ADULTHOOD_AGE, dummy.getCriticalAge());
        dummy.setAge(dummy.RETIREMENT_AGE/2);
        assertEquals(dummy.RETIREMENT_AGE-(dummy.RETIREMENT_AGE/2), dummy.getCriticalAge());
        dummy.setAge(dummy.RETIREMENT_AGE);
        assertEquals(0, dummy.getCriticalAge());
        dummy.setAge(dummy.RETIREMENT_AGE+10);
        assertEquals(10, dummy.getCriticalAge());
    }
    
    @Test
    public void testGender()
    {
        Person dummy = new Person();
        dummy.setGender(dummy.MALE_VALUE);
        assertEquals(dummy.MALE_VALUE, dummy.getGender());
        dummy.setGender(dummy.FEMALE_VALUE);
        assertEquals(dummy.FEMALE_VALUE, dummy.getGender());
    }
    
    @Test
    public void testIsAGirl()
    {
        Person dummy = new Person();
        dummy.setGender(dummy.FEMALE_VALUE);
        assertEquals(true, dummy.isAGirl());
        dummy.setGender(dummy.MALE_VALUE);
        assertEquals(false, dummy.isAGirl());
    }
    
    @Test
    public void testGenderToString()
    {
        Person dummy = new Person();
        dummy.setGender(dummy.FEMALE_VALUE);
        assertEquals("Female", dummy.genderToString());
        dummy.setGender(dummy.MALE_VALUE);
        assertEquals("Male", dummy.genderToString());
    }
    
    @Test
    public void testToString()
    {
        Person dummy = new Person();
        dummy.setName("prueba");
        dummy.setSurname("prueba");
        dummy.setAge(dummy.MIN_AGE_VALUE);
        dummy.setGender(dummy.FEMALE_VALUE);
        assertEquals("[Name: prueba - Surname: prueba - Age: " + dummy.MIN_AGE_VALUE + " - Gender: Female]", dummy.toString());
    }
    
    @Test
    public void testGetHashCode()
    {
        Person dummy = new Person();
        dummy.setName("prueba");
        dummy.setSurname("prueba");
        dummy.setAge(dummy.MIN_AGE_VALUE);
        dummy.setGender(dummy.FEMALE_VALUE);
        assertEquals("PRU-PRU-"+dummy.MIN_AGE_VALUE+"-" + dummy.FEMALE_VALUE, dummy.getHashCode());
    }
    
    @Test
    public void testIsYourAge()
    {
        Person dummy = new Person();
        dummy.setAge(dummy.MIN_AGE_VALUE);
        assertEquals(true, dummy.isYourAge(dummy.MIN_AGE_VALUE));
        dummy.setAge(dummy.MIN_AGE_VALUE-1);
        assertEquals(false, dummy.isYourAge(dummy.MIN_AGE_VALUE-1));
        dummy.setAge(dummy.MAX_AGE_VALUE+1);
        assertEquals(false, dummy.isYourAge(dummy.MAX_AGE_VALUE+1));
    }
    
    @Test
    public void testIsYou()
    {
        Person dummy = new Person();
        dummy.setName("prueba");
        assertEquals(true, dummy.isYou("PRUEBA"));
        dummy.setName("prueba");
        assertEquals(false, dummy.isYou("prueb"));
        dummy.setName("prueba");
        assertEquals(true, dummy.isYou("prueba"));
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
        assertEquals(false, b.isYou(a));
        assertEquals(true, a.isYou(a));
        
        
        a.setName("Valentina");
        a.setSurname("Tereshkova");
        a.setAge(37);
        a.setGender(Person.FEMALE_VALUE);
        
        b.setName("Valentina");
        b.setSurname("Tereshkova");
        b.setAge(37);
        b.setGender(Person.FEMALE_VALUE);
        
        assertEquals(true, a.isYou(b));
        assertEquals(true, b.isYou(a));
        assertEquals(true, a.isYou(a));
    }
       
      @Test
    public void testCompareTo()
    {
        Person a = new Person();
        Person b = new Person();
        
        a.setAge(Person.MIN_AGE_VALUE);
        b.setAge(Person.MIN_AGE_VALUE);
        
        assertEquals(0, a.compareTo(b));
        assertEquals(0, b.compareTo(a));
        assertEquals(0, a.compareTo(a));
        assertEquals(0, b.compareTo(b));
               
        b.setAge(Person.MAX_AGE_VALUE);
        
        assertEquals(-1, a.compareTo(b));
        assertEquals(+1, b.compareTo(a));
        assertEquals(0, a.compareTo(a));
        assertEquals(0, b.compareTo(b));
    }
}


