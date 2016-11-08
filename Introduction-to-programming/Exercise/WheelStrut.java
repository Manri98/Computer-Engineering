
/**
 * Write a description of class WheelStrut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WheelStrut
{
    Wheel leftWheel;
    Wheel rightWheel;
    char ID;

    /**
     * Constructor for objects of class WheelStrut
     */
    public WheelStrut(char ID, double wheelSize)
    {
        leftWheel = new Wheel(wheelSize, wheelSize);
        rightWheel = new Wheel(wheelSize, wheelSize);
        this.ID = ID;
    }

    public void setID()
    {
        this.ID = ID;
    }

    public char getID()
    {
        return this.ID;
    }
    
    public boolean isOperational(){
        return leftWheel.isOperational() && leftWheel.isOperational();
    }
}
