/**
 * Model of a wheel.
 * 
 * @author Carlos Manrique Enguita
 * @version 141116
 */
public class Wheel{
    
    private final static double SAFETY_TRESHOLD = 0.8;
    
    private double size;
    private double pressure;
    
    /**
     * Constructor for objects of class Wheel.
     * 
     * @param double size of the wheel in bars.
     */    
    public Wheel(double size, double pressure){
        this.size = 0;
        setSize(size);
        setPressure(pressure);
    }
    
    
    
    
    /**
     * Sets the maximum size of the wheel.
     * 
     * @param double Size of the wheel in bars.
     */    
    public void setSize(double size){
        if(size >= 0)
         this.size = size;
        else
         throw new RuntimeException("The value for the size must be positive or zero!");
    }    
    /** 
     * Returns the value of the size field.
     * 
     * @return double Size of the wheel in bars.
     */    
    public double getSize(){
        return size;
    }

    
    /**
     * Sets the current air pressure inside the wheel.
     * 
     * @param double Current air pressure of the wheel in the range [0,size]
     */    
    public void setPressure(double pressure){
        if(pressure >= 0 && pressure <= size)
         this.pressure = pressure;
        else
         ;//throw new RuntimeException("The value for the pressure must be positive or zero and lower than the size!");
    }    
    /** 
     * Returns the value of the air pressure field.
     * 
     * @return double Air pressure value.
     */    
    public double getPressure(){
        return pressure;
    }
    
    /**
     * Returns true if the wheel is operational for safe take offs and landings.
     * 
     * @return boolean true if the ratio between pressure and size is at 80% or greater, otherwise, false.
     */    
    public boolean isOperational(){
        if(getPressure()/getSize() >= SAFETY_TRESHOLD)
         return true;
        else
         return false;
    }
    
    /** 
     * Returns a String that contains the values of the size, pressure, ratio between pressure and size and if it's operational.
     * 
     * @return String Code that represents this object, information about the fields in this class.
     */    
    public String toString(){
        return String.format("Size: %.2f " , getSize()) + String.format(" - Pressure: %.2f " , getPressure()) + String.format(" - Ratio: %.2f " , getPressure()/getSize())+ " - Op: " + isOperational();
    }
    
    /**
     * Print the return value of the toString() method in the computer's display.
     * 
     */    
    public void print(){
        System.out.println(toString());
    }
}