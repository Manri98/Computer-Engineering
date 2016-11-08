

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AirplaneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AirplaneTest
{
    /**
     * Default constructor for test class AirplaneTest
     */
    public AirplaneTest()
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
    public void testSpeed()
    {
        Airplane dummy = new Airplane('a');
        assertEquals(0, dummy.getXSpeed());
        assertEquals(0, dummy.getYSpeed());
        dummy.setXSpeed(-1);
        dummy.setYSpeed(-1);
        assertEquals(-1, dummy.getXSpeed());
        assertEquals(-1, dummy.getYSpeed());
        dummy.setXSpeed(1);
        dummy.setYSpeed(1);
        assertEquals(1, dummy.getXSpeed());
        assertEquals(1, dummy.getYSpeed());
        dummy.setXSpeed(2);
        dummy.setYSpeed(2);
        assertEquals(1, dummy.getXSpeed());
        assertEquals(1, dummy.getYSpeed());
        dummy.setXSpeed(-2);
        dummy.setYSpeed(-2);
        assertEquals(1, dummy.getXSpeed());
        assertEquals(1, dummy.getYSpeed());
    }
    
    @Test
    public void testPos()
    {
        Airplane dummy = new Airplane('a');
        
        
        dummy.setXPos(Airplane.MIN_X-1);
        dummy.setYPos(Airplane.MIN_Y-1);
        assertEquals(Airplane.MIN_X, dummy.getXPos());
        assertEquals(Airplane.MIN_Y, dummy.getYPos());
        dummy.setXPos(Airplane.MAX_X+1);
        dummy.setYPos(Airplane.MAX_Y+1);
        assertEquals(Airplane.MIN_X, dummy.getXPos());
        assertEquals(Airplane.MIN_Y, dummy.getYPos());
        dummy.setXPos(Airplane.MAX_X*2);
        dummy.setYPos(Airplane.MAX_Y*2);
        assertEquals(Airplane.MIN_X, dummy.getXPos());
        assertEquals(Airplane.MIN_Y, dummy.getYPos());
        dummy.setXPos(Airplane.MIN_X-10);
        dummy.setYPos(Airplane.MIN_Y-10);
        assertEquals(Airplane.MIN_X, dummy.getXPos());
        assertEquals(Airplane.MIN_Y, dummy.getYPos());
        dummy.setXPos(Airplane.MAX_X);
        dummy.setYPos(Airplane.MAX_Y);
        
        
        assertEquals(Airplane.MAX_X, dummy.getXPos());
        assertEquals(Airplane.MAX_Y, dummy.getYPos());
        dummy.setXPos(Airplane.MIN_X);
        dummy.setYPos(Airplane.MIN_Y);
        assertEquals(Airplane.MIN_X, dummy.getXPos());
        assertEquals(Airplane.MIN_Y, dummy.getYPos());
        dummy.setXPos(Airplane.MAX_X/2);
        dummy.setYPos(Airplane.MAX_Y/2);
        assertEquals(Airplane.MAX_X/2, dummy.getXPos());
        assertEquals(Airplane.MAX_Y/2, dummy.getYPos());
    }
    
    @Test
    public void testFuel()
    {
        Airplane dummy = new Airplane('a');
        dummy.setFuel(-1.0);
        assertEquals(0.0, dummy.getFuel(), 0.1);
        dummy.setFuel(0.0);
        assertEquals(0.0, dummy.getFuel(), 0.1);
        dummy.setFuel(10.0);
        assertEquals(10.0, dummy.getFuel(), 0.1);
    }
    
    @Test
    public void testAltitude()
    {
        Airplane dummy = new Airplane('a');
        dummy.setAltitude(-5.0);
        assertEquals(0.0, dummy.getAltitude(), 0.1);
        dummy.setAltitude(0.0);
        assertEquals(0.0, dummy.getAltitude(), 0.1);
        
        dummy.setAltitude(10.0);
        assertEquals(10.0, dummy.getAltitude(), 0.1);
    }
    
    @Test
    public void testID()
    {
        Airplane dummy = new Airplane('a');
        assertEquals('a', dummy.getID());
        dummy.setID('b');
        assertEquals('b', dummy.getID());
    }
    
    @Test
    public void testToString()
    {
        Airplane dummy = new Airplane('a');
        assertEquals("[ID: a - Fuel: 0.0 - Altitude: 0.0 - Pos[0,0] - Speed[0,0]", dummy.toString());
        dummy.setID('b');
        assertEquals("[ID: b - Fuel: 0.0 - Altitude: 0.0 - Pos[0,0] - Speed[0,0]", dummy.toString());
    }
    
    @Test
    public void testGetMaxDistance()
    {
        Airplane dummy = new Airplane('a');
        dummy.setFuel(50);
        //Positive
        assertEquals(2500, dummy.getMaxDistance(20), 0.1);
        assertEquals(50000, dummy.getMaxDistance(1), 0.1);
        //Negative
        assertEquals(0, dummy.getMaxDistance(0), 0.1);
        assertEquals(0, dummy.getMaxDistance(-1), 0.1);
        assertEquals(0, dummy.getMaxDistance(-20), 0.1);
        //dummy.setFuel(0.5); // 0.5 tons.
        //assertEquals(0.75, dummy.getMaxDistance(1.5), 0.1);
    }
}

