import java.util.Random;
/**
 * Models a Person.
 * 
 * @author Carlos Manrique Enguita
 * @version 081116
 */
public class Person
{
    final static boolean MALE_VALUE = true;
    final static boolean FEMALE_VALUE = false;
    final static int MAX_AGE_VALUE = 118;
    final static int MIN_AGE_VALUE = 0;
    final static int ADULTHOOD_AGE = 18;
    final static int RETIREMENT_AGE = 67;
    final static String MALE_TEXT = "Male";
    final static String FEMALE_TEXT = "Female";
    
    String name;
    String surname;
    boolean gender;
    int age;
    
    /**
     * Constructor for objects of class Person
     * 
     * Assigns a default value for each field
     */
    public Person()
    {
        Random generator = new Random();
        setGender(generator.nextBoolean());
        if(isAGirl()){
            setName("Valentina");
            setSurname("Tereshkova");
        }
        else{
            setName("Yuri");
            setSurname("Gagarin");
        }
        setAge(generator.nextInt(MAX_AGE_VALUE+1));
    }
    
     /**
     * Constructor for objects of class Person
     * 
     * Assigns a default value for each field and the given one for age
     */
    public Person(int age)
    {
        this();
        setAge(age);
    }
    
     /**
     * Constructor for objects of class Person
     * 
     * Assigns a default value for each field and the given ones for name andsurname
     */
    public Person(String name, String surname)
    {
        this();
        setName(name);
        setSurname(surname);
    }
    
     /**
     * Constructor for objects of class Person
     * 
     * Assigns a custom value for each field
     */
    public Person(String name, String surname, int age, boolean gender)
    {
        this(name, surname);
        setAge(age);
        setGender(gender);
    }
    
    /**
     * Changes the name of the person to the one you give.
     * @param Represents a new value for the name field.
     */
    public void setName (String name){
        this.name = name;
    }
    
    /**
     * Provides de value of the name.
     * @return The name of the person
     */
    public String getName (){
        return name;
    }
    
    /**
     * Changes the surname of the person to the one you give.
     * @param Represents a new value for the surname field.
     */
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    /**
     * Provides de value of the surname.
     * @return The surname of the person
     */
    public String getSurname(){
        return surname;
    }
    
    /**
     * Changes the age of the person to the one you give after checking that the value provided is correct.
     * @param Represents a new value for the age field.
     */
    public void setAge (int age){
        if (age>=MIN_AGE_VALUE && age<=MAX_AGE_VALUE){
            this.age = age;
        }
        else if (age<MIN_AGE_VALUE){
            //this.age = Math.abs(age);
            String message = "Error with your age, it can't be negative.";
            //throw new RuntimeException(message);
        }
        else if (age>MAX_AGE_VALUE){
            //this.age = Math.abs(age);
            String message = "Error with your age, you are too old.";
            //throw new RuntimeException(message);
        }
    }
    
    /**
     * Provides de value of the age.
     * @return The age of the person
     */
    public int getAge (){
        return age;
    }
    
    /**
     * Provides a number of years depending on which stage of life is the person.
     * @return Number of years until adulthood, number of years until retirement or number of years past retirement.
     */
    public int getCriticalAge (){
        if (this.age<ADULTHOOD_AGE){
            return ADULTHOOD_AGE - this.age;
        }
        else if (this.age<=RETIREMENT_AGE && this.age>=ADULTHOOD_AGE){
            return RETIREMENT_AGE - this.age;
        }
        else{
            return this.age - RETIREMENT_AGE;
        }
    }
    
    /**
     * Changes the gender of the person to the one you give.
     * @param Represents a new value for the gender field.
     */
    public void setGender(boolean gender){
        this.gender = gender;
    }
    
    /**
     * Provides de value of the gender.
     * @return boolean The gender of the person
     */
    public boolean getGender(){
        return gender;
    }
    
    /**
     * Methot that returns true if the person is a girl and false if he is a boy.
     * 
     * @return boolean True if a girl, false if a boy.
     */
    public boolean isAGirl(){
        if (getGender() == FEMALE_VALUE){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    /**
     * Methot that returns true if the person is a boy and false if she is a girl.
     * 
     * @return True if a boy, false if a girl.
     */
    /*
    public boolean isABoy(){
        if (getGender() == MALE_VALUE){
            return true;
        }
        else if (getGender() == FEMALE_VALUE){
            return false;
        }
    }
    /*/
    
    /**
     * Methot that returns the real gender instead of true and false.
     * 
     * @return String real value of the gender
     */
    public String genderToString(){
        if (isAGirl()){
            return FEMALE_TEXT;
        }
        else{
            return MALE_TEXT;
        }
    }
    
    
    /**
     * Methot that prints in screen all the atributes of the Person class.
     * 
     */
    public void print(){
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + genderToString());
    }
            
    /**
     * Methot that returns a string with all the atributes of the Person class.
     * 
     * @return String compiled information of the class
     */
    public String toString(){
        return "[Name: " + getName() + " - Surname: " + getSurname() + " - Age: " + getAge() + " - Gender: " + genderToString() + "]";
    }
    
    /**
     * Methot that returns a hash with all the atributes of the Person class.
     * 
     * @return String hash with information of the class
     */
    
    public String getHashCode(){
        return getName().substring(0, 3).toUpperCase() + "-" + getSurname().substring(0, 3).toUpperCase() + "-" + getAge() + "-" + getGender();
    }
            
    /**
     * Methot that returns true or false depending on if you are right.
     * 
     * @return Boolean with the answer
     */
    
    public boolean isYourAge(int age){
        return age==getAge();
    }
            
    /**
     * Methot that returns true or false depending on if you are right about the name.
     * 
     * @return Boolean with the answer
     */
    
    public boolean isYou(String name){
        return name.compareToIgnoreCase(getName())==0;
    }
            
    /**
     * Methot that returns true or false depending on if you are right about the person.
     * 
     * @return Boolean with the answer
     */
    
    public boolean isYou(Person person){
        //return person.equals(this);
        return getGender() == person.getGender() && getAge() == person.getAge() && getName().compareToIgnoreCase(person.getName())==0 && getSurname().compareToIgnoreCase(person.getSurname())==0;     
    }
            
    /**
     * Methot that returns true or false depending on if you are right about a person's age.
     * 
     * @return Boolean with the number 0, -1 or +1
     */
    
    public int compareTo(Person person){
        if(getAge() == person.getAge()){
            return 0;
        }
        else if(getAge() > person.getAge()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
