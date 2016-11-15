/**
 * Model of a wheelStruct for the airplane
 * 
 * @author Carlos Manrique Enguita
 * @version 141116
 */
public class WheelStrut{
    
    char ID;
    boolean deployed;
    
    Wheel leftWheel;
    Wheel rightWheel;

    /**
     * Constructor for objects of class WheelStrut
     * 
     * @param char IDentifier for this strut.
     * @param double Size of the wheels.
     */    
    public WheelStrut(char ID, double wheelSize){
        leftWheel = new Wheel(wheelSize, wheelSize);
        rightWheel = new Wheel(wheelSize, wheelSize);
        setID(ID);
        setDeployed(true);
    }
    
    
    
    
    /**
     * Changes the value of the ID field.
     * 
     * @param char value for the ID field.
     */    
    public void setID (char ID){
        this.ID = ID;
    } 
    
    
    /**
     * Returns the value of the ID field.
     * 
     * @return Current value for the ID field.
     */    
    public char getID(){
        return ID;
    }
    
    
    /**
     * Returns true if the wheel strut is operational for safe take offs and landings.
     * 
     * @return boolean true if EVERY wheel in the strut is operational, otherwise, false.
     */    
    public boolean isOperational(){
        return leftWheel.isOperational() && rightWheel.isOperational();
    }
    
    
    /**
     * Changes the value of the deployed field.
     * 
     * @param boolean value for the deployed field.
     */    
    public void setDeployed(boolean deployed){
        this.deployed = deployed;
    } 
    
    /**
     * Returns the value of the ID field.
     * 
     * @return Current value for the ID field.
     */    
    public boolean isDeployed(){
        return deployed;
    }
    
    /**
     * Returns a String that contains the values of the fields in this class.
     * 
     * @return String Code that represents this object. Includes the value of the ID, fuel, altitude, [xPos, yPos] and [xSpeed,ySpeed]
     */    
    public String toString(){
        return "ID: " + getID() + " - Deployed: " + isDeployed() + " - Op: " + isOperational() + " [L: " + isOperational() + "] [R: " + isOperational() + "]";
    }
    
    /**
     * Displays information about the values of the fields in the class.
     * 
     */    
    public void print(){
        System.out.println(toString());
        System.out.println("L: Size: " + leftWheel.getSize() + " bars - Pressure: " + leftWheel.getSize() + " bars - Ratio: " + leftWheel.getSize()/leftWheel.getSize() + " - Op: " + isOperational());
        System.out.println("R: Size: " + rightWheel.getSize() + " bars - Pressure: " + rightWheel.getSize() + " bars - Ratio: " + rightWheel.getSize()/rightWheel.getSize() + " - Op: " + isOperational());
    }
}