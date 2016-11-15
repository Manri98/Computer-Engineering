import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class LandingGearTest.
 *
 * @author  Carlos Manrique Enguita
 * @version 141116
 */
public class LandingGearTest{
    /**
     * Default constructor for test class LandingGearTest
     */
    public LandingGearTest(){
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
    public void testToString(){
        LandingGear dummy = new LandingGear();
       
        dummy.setLever(LandingGear.LEVER_UP);
        assertEquals("Lever: UP Status: ON Nose: OFF Left: OFF Right: OFF", dummy.toString());
        
        //hacking the system
        
        dummy.left.rightWheel.setPressure(0.0); //damage!
        assertEquals("Lever: UP Status: FAILURE Nose: OFF Left: PRESS Right: OFF", dummy.toString());
        
        dummy.right.setDeployed(true); 
        assertEquals("Lever: UP Status: FAILURE Nose: OFF Left: PRESS Right: ON", dummy.toString());
        
        //new
        
        LandingGear dummy1 = new LandingGear();
        
        dummy1.setLever(LandingGear.LEVER_UP);
        
        //hacking the system
        
        dummy1.nose.leftWheel.setPressure(0.0);
        dummy1.nose.setDeployed(true);
        dummy1.left.setDeployed(true);
        assertEquals("Lever: UP Status: FAILURE Nose: PRESS Left: ON Right: OFF", dummy1.toString());
        
        //new
        
        LandingGear dummy2 = new LandingGear();
        
        dummy2.nose.leftWheel.setPressure(0.0); //damage!
        dummy2.right.rightWheel.setPressure(0.0); //damage!
        
        assertEquals("Lever: DOWN Status: FAILURE Nose: PRESS Left: ON Right: PRESS", dummy2.toString());
    }
}