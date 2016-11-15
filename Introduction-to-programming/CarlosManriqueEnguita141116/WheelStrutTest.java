import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WheelStrutTest.
 *
 * @author  Carlos Manrique
 * @version 141116
 */
public class WheelStrutTest{
    /**
     * Default constructor for test class WheelStrutTest
     */
    public WheelStrutTest(){
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
    public void testConstructor(){
        WheelStrut dummy = new WheelStrut('N', 100);
        assertEquals('N', dummy.getID());
    }
    
    @Test
    public void testIsOperational(){
        WheelStrut dummy = new WheelStrut('N', 100);
        assertEquals(true, dummy.isOperational());

        //dummy.ID = 'R'; //badWay
        //dummy.setID('D'); //goodWay
        
        //hacking the system
        
        dummy.leftWheel.setPressure(0.0);
        assertEquals(false, dummy.isOperational());
        
        //new
        
        WheelStrut dummy1 = new WheelStrut('D', 30);
        assertEquals(true, dummy1.isOperational());
        
        dummy1.rightWheel.setPressure(10.0);
        assertEquals(false, dummy1.isOperational());
    }
    
    @Test
    public void testToString(){
        WheelStrut dummy = new WheelStrut('N', 100);
        assertEquals("ID: N - Deployed: true - Op: true [L: true] [R: true]", dummy.toString());
        
        WheelStrut dummy1 = new WheelStrut('3', 50);
        assertEquals("ID: 3 - Deployed: true - Op: true [L: true] [R: true]", dummy1.toString());
    }
}