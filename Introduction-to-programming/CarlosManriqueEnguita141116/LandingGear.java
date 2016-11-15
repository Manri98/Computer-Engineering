/**
 * Landing gear system for the airplane class.
 * 
 * @author Carlos Manrique Enguita
 * @version 141116
 */
public class LandingGear{
    
    public static final boolean LEVER_UP = true;
    public static final boolean LEVER_DOWN = false;
    
    boolean lever;
    
    WheelStrut nose;
    WheelStrut left;
    WheelStrut right;
    
    
    
    /**
     * Constructor for objects of class LandingGear
     */    
    public LandingGear(){
        
        nose = new WheelStrut('N', 100);
        left = new WheelStrut('L', 100);
        right = new WheelStrut('R', 100);
        
        setLever(LEVER_DOWN);
    }
    
    
    
    
    /**
     * Dispalys information about the state of the three wheel struts of the airplane depending on the position of the lever.
     * 
     * @param boolean value for the lever field; true if it's up and false if it's down.
     */    
    public void setLever(boolean lever){
        
        this.lever=lever;
        
        if(getLever() == LEVER_DOWN){
            nose.setDeployed(true);
            left.setDeployed(true);
            right.setDeployed(true);
        }
        else{
            nose.setDeployed(false);
            left.setDeployed(false);
            right.setDeployed(false);
        }
    }
    
    /**
     * Returns the value for lever field.
     *  
     * @return Current value for the lever field.
     */    
    public boolean getLever(){
        return lever;
    }
    
    /**
     * Returns true if THE THREE wheel struts of the airplane are working properly at the same time. Otherwise, false.
     *  
     * @return boolean true if the THE THREE wheel struts are operational at the same time, otherwise, false.
     */    
    public boolean isOperational(){
        return nose.isOperational() && left.isOperational() && right.isOperational();
    }
    
    /**
     * Returns a String that contains the values of the fields in this class.
     * 
     * @return String code that includes the position of the lever, the general status of the plane and the status of the three struts.
     */    
    public String toString(){
       String aux = "Lever: ";
        
       if(getLever())
           aux = aux + "UP";
       else
           aux = aux + "DOWN";
        
       aux = aux + " Status: ";    
        
       if(isOperational())
           aux = aux + "ON";
       else
           aux = aux + "FAILURE";
        
       aux = aux + " Nose: ";    
        
       if(nose.isOperational())
        {
           if(nose.isDeployed())
               aux = aux + "ON";
           else    
               aux = aux + "OFF";
        }
       else 
           aux = aux + "PRESS";
            
       aux = aux + " Left: ";
        
       if(left.isOperational())
        {
           if(left.isDeployed())
               aux = aux + "ON";
           else    
               aux = aux + "OFF";
        }
       else 
           aux = aux + "PRESS";
        
       aux = aux + " Right: ";
        
       if(right.isOperational())
        {
           if(right.isDeployed())
               aux = aux + "ON";
           else    
               aux = aux + "OFF";
        }
       else 
           aux = aux + "PRESS";
        
       return aux;
    }
    
    /**
     * Displays the values of every field in this class, including the status of the wheels if they are deployed, retracted or with a press failure.
     * 
     */     
    public void print(){
        System.out.println(toString());
    }
}