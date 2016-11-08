
/**
 * This is a triangle
 * 
 * @author Jose Manuel Estrada-Nora Muñoz
 * @version 1.0
 */
public class Triangle
{
    // instance variables - replace the example below with your own
     /**
     * Constructor for objects of class Triangle
     */
    public Triangle()
    {     
    }

    /**
     * A method which calculates de area of our triangle
     * 
     * @param  height   (meters) Contains the height of the triangle.
     * @param  base   (meters) Measure of it's base.
     * @return area    (square meters) The resulting area of the triangle.
     */
    public double computeArea(double height, double base)
    {
        double area;
        double abase = Math.abs(base);
        double aheight = Math.abs(height);
        area = (abase*aheight)/2;
        return area;
    }
}
