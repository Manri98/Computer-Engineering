import java.util.Random;
/**
 * Class wich models an aeroplane.
 * 
 * @author Carlos Manrique Enguita
 * @version 141116
 */
public class Airplane{

    public final static int MAX_X = 10;
    public final static int MAX_Y = 10;
    public final static int MIN_SPEED = -1;
    public final static int MAX_SPEED = 1;
    
    private char ID = 'X'; //identificator for the airplane (FE 'a', 'b', 'c'...).
    private double fuel; //current amount of fuel in tons.
    private double altitude; //current altitude in Km.
    private int xPos; //x-coordinate for the plane or abcissa ([0, MAX_X])
    private int yPos; //y-coordinate for the plane or ordinate ([0, MAX_Y])
    private int xSpeed; //x-speed for the plane or abcissa ([-1, 0, 1])
    private int ySpeed; //y-speed for the plane or ordinate ([-1, 0, 1])
    private double ascentSpeed; //ascension speed in meter per second
    private double seconds; //time of ascension.
    
    private Person commander;
    private Person FO;
    private LandingGear lg;
    
    /**
     * Randomizator constructor of class airplane, generates random values
     * 
     */    
    public Airplane(){
        Random generator = new Random();
        commander = new Person();
        FO = new Person();
        lg = new LandingGear();
       
        setFuel(generator.nextDouble()*10);
        setAltitude(generator.nextDouble()*10);
        setXPos(generator.nextInt(MAX_X+1));
        setYPos(generator.nextInt(MAX_Y+1));
        setXSpeed(generator.nextInt(MAX_X-7)-1);
        setYSpeed(generator.nextInt(MAX_Y-7)-1);
    }    
    /**
     * Constructor for objects of class Airplane.
     * 
     * @param char value for the ID field.
     */    
    public Airplane(char ID){
        commander = new Person();
        FO = new Person();
        setID(ID);
    }    
    /**
     * Constructor for objects of class Airplane.
     * 
     * @param char value for the ID field, double value for the fuel and the altitude fields and int value for the xPos, yPos, xSpeed and ySpeed fields.
     */    
    public Airplane(char ID, double fuel, double altitude, int xPos, int yPos, int xSpeed, int ySpeed){
        this(ID);

        setFuel(fuel);
        setAltitude(altitude);
        setXPos(xPos);
        setYPos(yPos);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
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
     * Changes the value of the ID field.
     * 
     * @param char value for the ID field.
     */    
    public void setID (char ID){
        this.ID = ID;
    } 
     
    
    /**
     * Changes the value of the fuel field if it's greater than 0.
     * 
     * @param double value for the fuel field.
     */    
    public void setFuel (double fuel){
        if(fuel>=0)
         this.fuel = fuel;
        else
         throw new RuntimeException("The ammount of fuel must be positive or zero!");
    }    
     /**
     * Returns the value of the fuel field in tons.
     * 
     * @return Current value for the fuel field.
     */    
    public double getFuel(){
        return fuel;
    }
    
    
    /**
     * Changes the value of the altitude field.
     * 
     * @param double value for the altitude field.
     */    
    public void setAltitude (double altitude){
        if(altitude>=0) 
         this.altitude = altitude;
        else
         throw new RuntimeException("The altitude cannot be negative (it must be positive or zero!");
    }     
     /**
     * Returns the value of the altitude field in kilometers.
     * 
     * @return Current value for the altitude field.
     */    
    public double getAltitude(){
        return altitude;
    }
    
    /**
     * Changes the value of the xPos field in a range [0,10]
     * 
     * @param int value for the xPos field.
     */    
    public void setXPos (int xPos){
        if(xPos >= 0 && xPos <= MAX_X)
         this.xPos = xPos;
        else
         throw new RuntimeException ("The value for the X coordinate is wrong (it must be in a range of 0-10)");
    }     
    /**
     * Returns the value of the xPos field.
     * 
     * @return Current value for the xPos field.
     */    
    public int getXPos(){
        return xPos;
    }
   
    /**
     * Changes the value of the yPos field in a range [0,10]
     * 
     * @param int value for the yPos field.
     */    
    public void setYPos (int yPos){
        if(yPos >= 0 && yPos <= MAX_Y)
         this.yPos = yPos;
        else
         throw new RuntimeException ("The value for the Y coordinate is wrong (it must be in a range of 0-10)");
    }    
    /**
     * Returns the value of the yPos field.
     * 
     * @return Current value for the yPos field.
     */    
    public int getYPos(){
        return yPos;
    }
    
    /**
     * Changes the value of the xSpeed field in a range [-1,1]
     * 
     * @param int value for the xSpeed field.
     */    
    public void setXSpeed (int xSpeed){
        if((xSpeed == MIN_SPEED || xSpeed == MAX_SPEED || xSpeed == 0))
         this.xSpeed = xSpeed;
        else
         throw new RuntimeException ("The value for the xSpeed is wrong (it must be the range [-1-1]");
    }    
     /**
     * Returns the value of the xSpeed field.
     * 
     * @return Current value for the xSpeed field.
     */    
    public int getXSpeed(){
        return xSpeed;
    }
   
     /**
     * Changes the value of the ySpeed field in a range [-1,1]
     * 
     * @param int value for the ySpeed field.
     */    
    public void setYSpeed (int ySpeed){
        if((ySpeed == MIN_SPEED || ySpeed == MAX_SPEED || ySpeed == 0))
         this.ySpeed = ySpeed;
        else
         throw new RuntimeException ("The value for the ySpeed is wrong (it must be the range [-1-1]");
    }    
     /**
     * Returns the value of the ySpeed field.
     * 
     * @return Current value for the ySpeed field.
     */    
    public int getYSpeed(){
        return ySpeed;
    }
    
    /**
     * Returns a String that contains the values of the fields in this class.
     * 
     * @return String Code that represents this object. Includes the value of the ID,
     *         fuel, altitude, [xPos, yPos] and [xSpeed,ySpeed]
     */    
    public String toString(){
        return "ID: " + getID() + String.format(" -  Fuel: %.2f" , getFuel()) + String.format(" -  Altitude: %.2f" , 
                getAltitude()) + " -  Pos[" + getXPos() + "," + getYPos() + "]" + " -  Speed[" + getXSpeed() + "," + getYSpeed() + "]";
    }
    
    public void print(){
        System.out.println(toString());
    }
}    