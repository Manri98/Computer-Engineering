import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AirplaneTest.
 *
 * @author  Carlos Manrique Enguita
 * @version 141116
 */
public class AirplaneTest{
    /**
     * Default constructor for test class AirplaneTest
     */
    public AirplaneTest(){
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
    public void testID(){
        Airplane dummy = new Airplane();
        
        dummy.setID('a');
        assertEquals('a', dummy.getID());
        
        dummy.setID('b');
        assertEquals('b', dummy.getID());
        
        dummy.setID('1');
        assertEquals('1', dummy.getID());
    }

    @Test
    public void testFuel(){
        Airplane dummy = new Airplane();
        
        dummy.setFuel(0);
        assertEquals(0.0, dummy.getFuel(), 0.1);
        
        dummy.setFuel(10);
        assertEquals(10.0, dummy.getFuel(), 0.1);
        
        dummy.setFuel(0);
        
        dummy.setFuel(-1);
        assertEquals(0.0, dummy.getFuel(), 0.1);
        
        dummy.setFuel(0);
        assertEquals(0.0, dummy.getFuel(), 0.1);
        
        dummy.setFuel(-10);
        assertEquals(0.0, dummy.getFuel(), 0.1);
    }

    @Test
    public void testAltitude(){
        Airplane dummy = new Airplane();
        
        dummy.setAltitude(0);
        assertEquals(0.0, dummy.getAltitude(), 0.1);
        
        dummy.setAltitude(1000);
        assertEquals(1000.0, dummy.getAltitude(), 0.1);
        
        dummy.setAltitude(0);
        
        dummy.setAltitude(-1);
        assertEquals(0.0, dummy.getAltitude(), 0.1);
        
        dummy.setAltitude(0);
        assertEquals(0.0, dummy.getAltitude(), 0.1);
        
        dummy.setAltitude(-1000);
        assertEquals(0.0, dummy.getAltitude(), 0.1);
    }

    @Test
    public void testXPos(){
        Airplane dummy = new Airplane();
        
        dummy.setXPos(0);
        assertEquals(0, dummy.getXPos());
        
        dummy.setXPos(-1);
        assertEquals(0, dummy.getXPos());
        
        dummy.setXPos(-100);
        assertEquals(0, dummy.getXPos());
        
        dummy.setXPos(Airplane.MAX_X/2);
        assertEquals(Airplane.MAX_X/2, dummy.getXPos());
        
        dummy.setXPos(Airplane.MAX_X);
        assertEquals(Airplane.MAX_X, dummy.getXPos());
        
        dummy.setXPos(Airplane.MAX_X+1);
        assertEquals(Airplane.MAX_X, dummy.getXPos());
        
        dummy.setXPos(Airplane.MAX_X*2);
        assertEquals(Airplane.MAX_X, dummy.getXPos());
    }
    
    @Test
    public void testYPos(){
       Airplane dummy = new Airplane();
        
       dummy.setYPos(0);
       assertEquals(0, dummy.getYPos());
        
       dummy.setYPos(-1);
       assertEquals(0, dummy.getYPos());
       
       dummy.setYPos(-100);
       assertEquals(0, dummy.getYPos());
        
       dummy.setYPos(Airplane.MAX_Y/2);
       assertEquals(Airplane.MAX_Y/2, dummy.getYPos());
        
       dummy.setYPos(Airplane.MAX_Y);
       assertEquals(Airplane.MAX_Y, dummy.getYPos());
        
       dummy.setYPos(Airplane.MAX_Y+1);
       assertEquals(Airplane.MAX_Y, dummy.getYPos());
        
       dummy.setYPos(Airplane.MAX_Y*2);
       assertEquals(Airplane.MAX_Y, dummy.getYPos());
    }

    @Test
    public void testXSpeed(){
        Airplane dummy = new Airplane();
        
        dummy.setXSpeed(Airplane.MIN_SPEED);
        assertEquals(Airplane.MIN_SPEED, dummy.getXSpeed());
        
        dummy.setXSpeed(-2);
        assertEquals(Airplane.MIN_SPEED, dummy.getXSpeed());
        
        dummy.setXSpeed(0);
        assertEquals(0, dummy.getXSpeed());
        
        dummy.setXSpeed(Airplane.MAX_SPEED);
        assertEquals(Airplane.MAX_SPEED, dummy.getXSpeed());
        
        dummy.setXSpeed(2);
        assertEquals(Airplane.MAX_SPEED, dummy.getXSpeed());
    }
    
    @Test
    public void testYSpeed(){
        Airplane dummy = new Airplane();
        
        dummy.setYSpeed(Airplane.MIN_SPEED);
        assertEquals(Airplane.MIN_SPEED, dummy.getYSpeed());
        
        dummy.setYSpeed(-2);
        assertEquals(Airplane.MIN_SPEED, dummy.getYSpeed());
        
        dummy.setYSpeed(0);
        assertEquals(0, dummy.getYSpeed());
        
        dummy.setYSpeed(Airplane.MAX_SPEED);
        assertEquals(Airplane.MAX_SPEED, dummy.getYSpeed());
        
        dummy.setYSpeed(2);
        assertEquals(Airplane.MAX_SPEED, dummy.getYSpeed());;
    }

    @Test
    public void testToString(){
        Airplane airplane1 = new Airplane('a', 23.4571, 4565.232, Airplane.MAX_X, Airplane.MAX_Y, -1, 1);
        assertEquals("ID: a -  Fuel: 23,46 -  Altitude: 4565,23 -  Pos[10,10] -  Speed[-1,1]", airplane1.toString());
        
        Airplane dummy1 = new Airplane('b', 12.34, 1670.2424, 2, 0, 0, -1);
        assertEquals("ID: b -  Fuel: 12,34 -  Altitude: 1670,24 -  Pos[2,0] -  Speed[0,-1]", dummy1.toString());
    }
}