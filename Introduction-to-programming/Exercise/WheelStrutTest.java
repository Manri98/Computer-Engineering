

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WheelStrutTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WheelStrutTest
{
    /**
     * Default constructor for test class WheelStrutTest
     */
    public WheelStrutTest()
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
    public void testID()
    {
        WheelStrut dummy = new WheelStrut('a', 100);
        assertEquals('a', dummy.getID());
    }
    
    @Test
    public void testIsOperational(){
        WheelStrut dummy = new WheelStrut('a', 100);
        assertEquals(true, dummy.isOperational());
        dummy.leftWheel.setPressure(0);
        assertEquals(false, dummy.isOperational());
    }
}
