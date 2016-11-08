

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest
{
    /**
     * Default constructor for test class TriangleTest
     */
    public TriangleTest()
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
    public void testTriangle()
    {
        Triangle dummy = new Triangle();
        assertEquals(25, dummy.computeArea(5, 10), 0.1);
        assertEquals(0, dummy.computeArea(0, 10), 0.1);
        assertEquals(0, dummy.computeArea(5, 0), 0.1);
        assertEquals(0, dummy.computeArea(0, -10), 0.1);
        assertEquals(0, dummy.computeArea(-5, 0), 0.1);
    }
}

