import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class WheelTest.
 *
 * @author  Carlos Manrique Enguita
 * @version 141116
 */
public class WheelTest{
    /**
     * Default constructor for test class WheelTest
     */
    public WheelTest(){
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
        Wheel dummy = new Wheel(100, 100);
        assertEquals(100.0, dummy.getSize(), 0.1);
        assertEquals(100.0, dummy.getPressure(), 0.1);
        
        Wheel dummy1 = new Wheel(100, 25.7);
        assertEquals(100.0, dummy1.getSize(), 0.1);
        assertEquals(25.7, dummy1.getPressure(), 0.1);
        
        Wheel dummy2 = new Wheel(50.5, 100);
        assertEquals(50.5, dummy2.getSize(), 0.1);
        assertEquals(0.0, dummy2.getPressure(), 0.1);
        
        Wheel dummy3 = new Wheel(37.5, 100);
        assertEquals(37.5, dummy3.getSize(), 0.1);
        assertEquals(0, dummy3.getPressure(), 0.1);
        
        Wheel dummy4 = new Wheel(0, 100);
        assertEquals(0, dummy4.getSize(), 0.1);
        assertEquals(0, dummy4.getPressure(), 0.1);
    
        Wheel dummy5 = new Wheel(-1, -1);
        assertEquals(0, dummy5.getSize(), 0.1);
        assertEquals(0, dummy5.getPressure(), 0.1);
    }

    @Test
    public void testPressure(){
        Wheel dummy = new Wheel(100,50);
        assertEquals(100.0, dummy.getSize(), 0.1);
        assertEquals(50.0, dummy.getPressure(), 0.1);
        
        dummy.setPressure(-1);
        assertEquals(50.0, dummy.getPressure(), 0.1);
        
        dummy.setPressure(-50);
        assertEquals(50.0, dummy.getPressure(), 0.1);
        
        dummy.setPressure(dummy.getSize()+1);
        assertEquals(50.0, dummy.getPressure(), 0.1);
        
        dummy.setPressure(dummy.getSize()*2);
        assertEquals(50.0, dummy.getPressure(), 0.1);
        
        dummy.setPressure(0);
        assertEquals(0, dummy.getPressure(), 0.1);
        
        dummy.setPressure(dummy.getSize());
        assertEquals(dummy.getSize(), dummy.getPressure(), 0.1);
        
        dummy.setPressure(dummy.getSize()/2);
        assertEquals(dummy.getSize()/2, dummy.getPressure(), 0.1);
    }
    
    @Test
    public void testIsOperational(){
        Wheel dummy = new Wheel(100,50);
        assertEquals(false, dummy.isOperational());
        
        dummy.setPressure(79);
        assertEquals(false, dummy.isOperational());
        
        dummy.setPressure(80);
        assertEquals(true, dummy.isOperational());
        
        dummy.setPressure(81);
        assertEquals(true, dummy.isOperational());
    }

    @Test
    public void testToString(){
        Wheel dummy = new Wheel(25.349, 21.408);
        assertEquals("Size: 25,35  - Pressure: 21,41  - Ratio: 0,84  - Op: true", dummy.toString());
        
        Wheel dummy1 = new Wheel(34.565, 13.565);
        assertEquals("Size: 34,57  - Pressure: 13,57  - Ratio: 0,39  - Op: false", dummy1.toString());
        
        Wheel dummy2 = new Wheel(20, 20);
        assertEquals("Size: 20,00  - Pressure: 20,00  - Ratio: 1,00  - Op: true", dummy2.toString());
        
        Wheel dummy3 = new Wheel(30, 50);
        assertEquals("Size: 30,00  - Pressure: 0,00  - Ratio: 0,00  - Op: false", dummy3.toString());
    }
    
    @Test
    public void testSize(){
        Wheel dummy = new Wheel(0,0);
        dummy.setSize(100);
        assertEquals(100, dummy.getSize(), 0.1);
        
        dummy.setSize(50);
        assertEquals(50, dummy.getSize(), 0.1);
        
        dummy.setSize(100);
        assertEquals(100, dummy.getSize(), 0.1);
        
        dummy.setSize(-50);
        assertEquals(100, dummy.getSize(), 0.1);
        
        dummy.setSize(-100);
        assertEquals(100, dummy.getSize(), 0.1);
    }
}