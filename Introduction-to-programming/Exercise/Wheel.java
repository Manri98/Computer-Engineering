
/**
 * Write a description of class Wheel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wheel
{
    final static double SAFETY_THRESHOLD = 0.8;
    
    double size;
    double pressure;

    /**
     * Constructor for objects of class Wheel
     */
    public Wheel(double size, double pressure)
    {
        if(size>=0){
            this.size = size;
        }
        else{
            this.size = 0;
        }
        setPressure(pressure);
    }
    
    public double getSize(){
        return this.size;
    }
    
    public void setPressure(double pressure){
        if(pressure>=0 && pressure<=size){
            this.pressure = pressure;
        }
        else{
            this.pressure = 0;
        }
    }
    
    public double getPressure(){
        return this.pressure;
    }
    
    
    public boolean isOperational(){
        return getPressure()/getSize() >= SAFETY_THRESHOLD;
    }
    
    public String toString(){
        return "Size: " + String.format("%.2f", getSize()) + " bars - Pressure: " + String.format("%.2f", getPressure()) + " bars - Ratio: " + String.format("%.2f", getPressure()/getSize()) + " - Op: " + isOperational();
    }
    
    public void print(){
        System.out.println(toString());
    }
}
