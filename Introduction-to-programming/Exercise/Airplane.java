import java.util.Random;
/**
 * Write a description of class Airplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Airplane
{
    final static int MAX_X = 10;
    final static int MAX_Y = 10;
    final static int MIN_X = 0;
    final static int MIN_Y = 0; 
    
    char ID; //identificator for the airplane
    double fuel; //current amount of fuel in tons
    double altitude; //altitude in Km
    int xPos; //x-coordinate of the airplane ([0, MAX_X])
    int yPos; //y-coordinate of the airplane ([0, MAX_Y])
    int xSpeed; //x-speed for the plane ([-1, 0, 1])
    int ySpeed; //y-speed for the plane ([-1, 0, 1])
    Person FO;
    Person Commander;
    /**
     * Constructor for objects of class Airplane
     * 
     * @param ID The airplane ID you indicate
     */
    public Airplane()
    {
        Random generator = new Random();
        setID('X');
        setFuel(generator.nextDouble());
        setAltitude(generator.nextDouble());
        setXPos(generator.nextInt(MAX_X));
        setYPos(generator.nextInt(MAX_Y));
        setXSpeed(0);
        setYSpeed(0);
        Commander = new Person();
        FO = new Person();
    }
    
    /**
     * Constructor for objects of class Airplane
     * 
     * @param ID The airplane ID you indicate
     */
    public Airplane(char ID)
    {
        setID(ID);
        setFuel(0.0);
        setAltitude(0.0);
        setXPos(0);
        setYPos(0);
        setXSpeed(0);
        setYSpeed(0);
        Commander = new Person();
        FO = new Person();
    }
    
    /**
     * Constructor for objects of class Airplane
     * 
     * @param All the data for the airplane
     */
    public Airplane(char ID, double fuel, double altitude, int xPos, int yPos, int xSpeed, int ySpeed)
    {
        this(ID);
        setFuel(fuel);
        setAltitude(altitude);
        setXPos(xPos);
        setYPos(yPos);
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }

    /**
     * A method that sets the airplane ID to the one given
     * 
     * @param  id   the airplane ID
     */
    public void setID(char id)
    {
        this.ID = id;
    }

    /**
     * A method that sets the airplane fuel to the one given
     * 
     * @param  fuel   the airplane fuel
     */
    public void setFuel(double fuel)
    {
        if(fuel>=0){
            this.fuel = fuel;
        }
    }

    /**
     * A method that sets the airplane altitude to the one given
     * 
     * @param  altitude   the airplane altitude
     */
    public void setAltitude(double altitude)
    {
        if(altitude>=0){
            this.altitude = altitude;
        }
    }

    /**
     * A method that sets the airplane xPos to the one given
     * 
     * @param  xPos   the airplane xPos
     */
    public void setXPos(int xPos)
    {
        if(0<=xPos && xPos<=MAX_X){
            this.xPos = xPos;
        }
    }

    /**
     * A method that sets the airplane yPos to the one given
     * 
     * @param  yPos   the airplane yPos
     */
    public void setYPos(int yPos)
    {
        if(0<=yPos && yPos<=MAX_Y){
            this.yPos = yPos;
        }
    }

    /**
     * A method that sets the airplane xSpeed to the one given
     * 
     * @param  xSpeed   the airplane xSpeed
     */
    public void setXSpeed(int xSpeed)
    {
        if(xSpeed==-1 || xSpeed==0 || xSpeed==1){
            this.xSpeed = xSpeed;
        }
    }

    /**
     * A method that sets the airplane ySpeed to the one given
     * 
     * @param  ySpeed   the airplane ySpeed
     */
    public void setYSpeed(int ySpeed)
    {
        if(ySpeed==-1 || ySpeed==0 || ySpeed==1){
            this.ySpeed = ySpeed;
        }
    }
    
    /**
     * A method that returns the ID of the airplane
     * 
     * @return ID of the airplane 
     */
    public char getID()
    {
        return this.ID;
    }
    
    /**
     * A method that returns the Fuel of the airplane
     * 
     * @return Fuel of the airplane 
     */
    public double getFuel()
    {
        return this.fuel;
    }
    
    /**
     * A method that returns the Altitude of the airplane
     * 
     * @return Altitude of the airplane 
     */
    public double getAltitude()
    {
        return this.altitude;
    }
    
    /**
     * A method that returns the xPos of the airplane
     * 
     * @return xPos of the airplane 
     */
    public int getXPos()
    {
        return this.xPos;
    }
    
    /**
     * A method that returns the yPos of the airplane
     * 
     * @return yPos of the airplane 
     */
    public int getYPos()
    {
        return this.yPos;
    }
    
    /**
     * A method that returns the xSpeed of the airplane
     * 
     * @return xSpeed of the airplane 
     */
    public int getXSpeed()
    {
        return this.xSpeed;
    }
    
    /**
     * A method that returns the ySpeed of the airplane
     * 
     * @return ySpeed of the airplane 
     */
    public int getYSpeed()
    {
        return this.ySpeed;
    }
    
    /**
     * A method that transforms all the information to a string
     * 
     * @param  ySpeed   the airplane ySpeed
     */
    public String toString()
    {
        return "[ID: " + getID() + " - Fuel: " + getFuel() + " - Altitude: " + getAltitude() + " - Pos[" + getXPos() + "," + getYPos() + "] - Speed[" + getXSpeed() + "," + getYSpeed() + "]";
    }
    
    /**
     * Methot that prints in screen all the atributes of the Airplane class.
     * 
     */
    public void print(){
        System.out.println("ID: " + getID());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Altitude: " + getAltitude());
        System.out.println("Pos[" + getXPos() + "," + getYPos() + "]");
        System.out.println("Speed[" + getXSpeed() + "," + getYSpeed() + "]");
    }
    
    /**
     * Method that returns how far can the plane fly with the fuel it has given a consumption rate.
     * Remember fuel comes in tonnes not kilograms. 
     * 
     * @param consumptionRate Kg of fuel per kilometre flown 
     * @return distance the plane is able to fly with the current fuel and consumption rate
     */
    public double getMaxDistance(double consumptionRate)
    {
        if (consumptionRate>0){
            return (getFuel()*1000.0)/consumptionRate;
        }
        else{
            //Messages disabled for ease of testing//
            //System.out.println("The plane has to consume an amount of fuel greater than 0 in order to fly");
            //String message = "The plane has to consume an amount of fuel greater than 0 in order to fly";
            //throw new RuntimeException(message);
            return 0;
        }
    }
}
