import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class TriangleTest.
 *
 * @author  Carlos Manrique Enguita
 * @version 141116
 */
public class TriangleTest{
    /**
     * Default constructor for test class TriangleTest
     */
    public TriangleTest(){
        
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
    public void testComputeArea(){
        Triangle dummy = new Triangle();
        assertEquals(3.0, dummy.computeArea(2.0, 3.0), 0.1);
        assertEquals(5.0, dummy.computeArea(5.0, 2.0), 0.1);
        assertEquals(0, dummy.computeArea(-2.0, 2.0), 0.1);
        assertEquals(0, dummy.computeArea(-5.0, 4.0), 0.1);
    }
}