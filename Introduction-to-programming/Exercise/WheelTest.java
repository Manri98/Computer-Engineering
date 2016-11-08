

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WheelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WheelTest
{
    /**
     * Default constructor for test class WheelTest
     */
    public WheelTest()
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
    public void testSize(){
        Wheel a = new Wheel(100, 50);
        assertEquals(100, a.getSize(), 0.01);
        
        Wheel b = new Wheel(0, 50);
        assertEquals(0, b.getSize(), 0.01);
        
        Wheel c = new Wheel(-0.1, 50);
        assertEquals(0, c.getSize(), 0.01);
    }
    
    @Test
    public void testInflate(){
        Wheel dummy = new Wheel(100, 50);
        assertEquals(50, dummy.getPressure(), 0.01);
        
        //Positive
        dummy.setPressure(0);
        assertEquals(0, dummy.getPressure(), 0.01);
        dummy.setPressure(dummy.getSize());
        assertEquals(dummy.getSize(), dummy.getPressure(), 0.01);
        dummy.setPressure(dummy.getSize()/2);
        assertEquals(dummy.getSize()/2, dummy.getPressure(), 0.01);
        
        //Negative
        dummy.setPressure(0);
        dummy.setPressure(-0.1);
        assertEquals(0, dummy.getPressure(), 0.01);
        dummy.setPressure(-dummy.getSize());
        assertEquals(0, dummy.getPressure(), 0.01);
        dummy.setPressure(dummy.getSize()*2);
        assertEquals(0, dummy.getPressure(), 0.01);
        dummy.setPressure(dummy.getSize()+0.1);
        assertEquals(0, dummy.getPressure(), 0.01);
    }
    
    @Test
    public void testIsOperational(){
        Wheel dummy = new Wheel(100, 50);
        dummy.setPressure(dummy.SAFETY_THRESHOLD*dummy.getSize());
        assertEquals(true, dummy.isOperational());
        dummy.setPressure(dummy.SAFETY_THRESHOLD*dummy.getSize()+0.1);
        assertEquals(true, dummy.isOperational()); 
        dummy.setPressure(dummy.SAFETY_THRESHOLD*dummy.getSize()-0.1);
        assertEquals(false, dummy.isOperational());         
    }
    
    @Test
    public void testToString(){
        Wheel dummy = new Wheel(100, 80);
        assertEquals("Size: 100,00 bars - Pressure: 80,00 bars - Ratio: 0,80 - Op: true", dummy.toString());
        
        dummy.setPressure(0);
        assertEquals("Size: 100,00 bars - Pressure: 0,00 bars - Ratio: 0,00 - Op: false", dummy.toString());
    }
}
