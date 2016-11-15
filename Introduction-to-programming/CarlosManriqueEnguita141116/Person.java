import java.util.Random;
/**
 * Model of a Person Class.
 * 
 * @author Carlos Manrique Enguita
 * @version 141116
 */
public class Person{    
    public final static boolean MALE_VALUE = false;
    public final static String TEXT_MALE = "Male";    
    public final static boolean FEMALE_VALUE = true;
    public final static String TEXT_FEMALE = "Female";

    public final static int MIN_AGE_VALUE = 0;
    public final static int MAX_AGE_VALUE = 118;
    public final static int ADULTHOOD_AGE = 18;
    public final static int RETIREMENT_AGE = 67;
    
    private String name = "Carlos";
    private String surname = "Manrique";
    private boolean gender;
    private int age;

    
    /**
     * Random constructor for objects of class Person.
     */    
    public Person(){        
        Random generator = new Random();
        setAge(generator.nextInt(MAX_AGE_VALUE+1));
        setGender(generator.nextBoolean());         
        if (isAGirl()){
            setName("Valentina");
            setSurname("Tereshkova");
        }
        else{
            setName("Yuri");
            setSurname("Gagarin");
        }  
    }    
    /**
     * Constructor for objects of class Person with a determinated age.
     * 
     * @param age Int The age of the person.
     */    
    public Person(int age){
        this();
        setAge(age);
    }    
     /**
     * Constructor for objects of class Person with a determinated name and surname.
     * 
     * @param name String The name of the person.
     * @param surname String The surname of the person.
     */   
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }    
     /**
     * Constructor for objects of class Person with every atribute.
     * 
     * @param name String The name of the person
     * @param surname String The surname of the person.
     * @param age Int The age of the person.
     * @param gender boolean The gender of the person.
     */    
    public Person(String name, String surname, int age, boolean gender){
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(gender);
    } 
    
    
    
    /**
     * Changes the value of the name.
     * 
     * @param name String The new name.
     */
    public void setName(String name){
       this.name = name;
    }    
    /**
     * Returns the value of the name.
     * 
     * @return name String The value of name.
     */    
    public String getName(){
        return name; 
    }
    
    /**
     * Changes the value of the surname.
     *
     * @param surname String The new surname.
     */    
    public void setSurname(String surname){
        this.surname = surname;
    }    
    /**
     * Returns the value of the surname.
     * 
     * @return surname String The surname of the person.
     */    
    public String getSurname(){
        return surname; 
    }
    
    /**
     * Changes the value of the age between the maximum and the minimum defined in the constants.
     * Throws an exception if user types a wrong value.
     * 
     * @param age int The new age.
     */    
    public void setAge(int age){
       if (age >= MIN_AGE_VALUE && age <= MAX_AGE_VALUE){ 
        this.age = age;
       }
       else{
        throw new RuntimeException ("Wrong: Value must be between 0 and 118!");
       }
    }     
    /**
     * Returns the value of the age.
     * 
     * @return age int The age of the person.
     */    
    public int getAge(){
        return age;
    }
    
    /**
     * Changes the value of the gender.
     * 
     * @param gender boolean The gender of the person.
     */    
    public void setGender(boolean gender){
        this.gender = gender;
    }      
    /**
     * Returns the value of the gender.
     * 
     * @return gender boolean The value of the gender.
     */    
    public boolean getGender(){
        return gender; 
    }
    
    /**
     * Returns true if it's female and and false if it's male.
     * 
     * @return true boolean If it's female.
     * @return false boolean If t's male.
     */    
    public boolean isAGirl(){
        if (gender){
         return true;
        }
        else{
         return false;
        }
    }
    
    /**
     * Show information of all the values in the object. 
     */    
    public void print1(){
       System.out.println("Name: " + getName());
       System.out.println("Surname: " + getSurname()); 
       System.out.println("Age: " + getAge());
       System.out.print("Gender: ");
       if (isAGirl()){
        System.out.println("Female");
       }
       else{
        System.out.println("Male");
       }
    } 
    
    /**
     * Returns different text depending of the gender.
     * 
     * @return TEXT_FEMALE String If it's female.
     * @return TEXT_MALE String If it's male.
     */    
    private String genderToString(){
        if(isAGirl()){
         return (TEXT_FEMALE);
        }
        else{
         return (TEXT_MALE);
        }
    }
    
     /**
     * Show information about the different values of the object. 
     */    
    public void print2(){
       System.out.println("Name: " + getName());
       System.out.println("Surname: " + getSurname()); 
       System.out.println("Age: " + getAge());
       System.out.print("Gender: " + genderToString());
    } 
    
    /**
     * Return a string which contains all the values of the object.
     * 
     * @return String Contains all the info.
     */    
    public String toString(){
      return "[Name: " + getName() + " - Surname: " + getSurname()+ " - Age: " + getAge() + " - Gender: " + genderToString() + "]";
    } 
    
    /**
     * Return a hash code based on the values of the object.
     * 
     * @return String Hash code of the object.
     */    
    public String getHashCode(){
      return getName().toUpperCase().substring(0,3) + " - " + getSurname().toUpperCase().substring(0,3) + " - " + getAge() + " - " + genderToString();
    }

    /** 
     * Returns the number of years until adulthood, until retirement or after retirement.
     * 
     * @return int years until adulthood.
     * @return int years untill retirement.
     * @return int years being retired.
     **/     
    public int getCriticalAge(){
        if(age <= ADULTHOOD_AGE){
         return ADULTHOOD_AGE - this.age;
        }
        else if(age > ADULTHOOD_AGE && age <= RETIREMENT_AGE){
            return RETIREMENT_AGE - this.age;
        }
        else{
            return this.age - RETIREMENT_AGE;
        }        
    }
    
    /**
     * Compares an age with ethe one in the object.
     * 
     * @param age int The age to compare with.
     * @return boolean Depending if the condition is true or false
     */    
    public boolean isYourAge(int age){
       if(age==this.age){
           return true;
       }
       else{
           return false;
       }
    }
    
    /**
     * Compares a name with the one in the object.
     * 
     * @param name String The name to compare with.
     * @return boolean True if the age provided is the same as the name.
     */    
    public boolean isYou(String name){
        if(name.equalsIgnoreCase(this.name)){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Compares with another person object.
     * 
     * @param Person The object to be compared.
     * @return boolean True if both object are equals. Otherwise false.
     */    
    public boolean isYou(Person person){
       if(this.name.compareToIgnoreCase(person.getName())==0 && 
          this.surname.compareToIgnoreCase(person.getSurname())==0 && 
          this.age == person.getAge() && 
          this.gender == person.getGender()){
           return true;
       }
       else{
           return false;
       }
    }
    
    /**
     * Compares ages between two person objects.
     * 
     * @param Person person to be compared with.
     * 
     * @return 0 int If both ages are the same.
     * @return -1 int If the parameter's object is bigger.
     * @return 1 in every other case.
     */    
    public int compareTo(Person person){
       if(this.age == person.getAge()){
           return 0;
       }
       else if (this.age < person.getAge()){
           return -1;
       }
       else{
           return 1;
       }
    }
}