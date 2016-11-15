/**
 * Model of a triangle.
 * 
 * @author Carlos Manrique Enguita
 * @version 141116
 */
public class Triangle
{
    public double base;
    public double height;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(){
        
    }
     
    /** 
     * Computes the area of a triangle from its base and height.
     * 
     * @param double that contains the base of this triangle measured in cm. Its minimum value is 0.
     * @param double that contains the height of this triangle measured in cm. Range of accepted values starts at 0.
     * 
     * @return double Area of the triangle measured in squared cm.
     */   
    public double computeArea(double height, double base){ 
        if(base >= 0 && height >=0){ 
            return (base*height)/2;
        }
        else{
            return 0;
        }
    }
}