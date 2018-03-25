/**Program: NFLPlayer Program
 *File: NFLPlayer.java
 *Summary: Tests program, printing details of the NFL player's stats to the console.
 *using input from DisplayNFLPlayer.java program.
 *Author: Mercedes Thigpen
 *Date: March 23, 2018
 **/
package nflplayer;

/**
 *
 * @author mthigpen
 */
public class NFLPlayer {


    /**
     * @param args the command line arguments
     */
//List of variables within this class.
    private String position;
    private String name;
    private int weight;
    private int height;
    private int inch;
    private int experience;
    private int touchdowns;
    private int age;
    private int intercepts;
    private int yards;


    
    public NFLPlayer(){}
    
    /**
     *
     * @param positionIn
     * @param nameIn
     * @param weightIn
     * @param heightIn
     * @param experienceIn
     * @param inchIn
     * @param ageIn
     * @param touchdownsIn
     * @param interceptsIn
     * @param yardsIn
     */
public NFLPlayer(String positionIn, String nameIn, int heightIn, int inchIn, int weightIn, int ageIn, int experienceIn, 
        int touchdownsIn, int interceptsIn, int yardsIn){//List of properties applied to each player
    position = positionIn;
    name = nameIn;
    weight = weightIn;
    height = heightIn;
    experience = experienceIn;
    inch = inchIn;
    age = ageIn;
    experience = experienceIn;
    touchdowns = touchdownsIn;
    intercepts = interceptsIn;
    yards = yardsIn;
    //The infomation that will string into the program
    
}
//Program is pulling details from DisplayNFLPlayer.java in the order of the String in public class NFLPlayer
 public void setPosition(String positionIn){
    this.position = positionIn;}//sets instance of the position

public String getPosition(){
    return this.position;//gets the value of the position
}
 public void setName(String nameIn){//sets instance of the name
    this.name = nameIn;}
 
 public String getName(){
     return this.name;//gets the value of the name
 }
 public void setHeight(int heightIn){//sets instance of the height
    this.height = heightIn;
 }
public int getHeight(){
    return this.height;//gets the value of the height
}   
 public void setInches(int inchIn){//sets instance of the inches
    this.inch = inchIn;
 }    
    public int getInches(){
    return this.inch;//gets the value of the inches
}
  public void setWeight(int weightIn){//sets instance of the weight
    this.weight = weightIn;
 }
public int getWeight(){
    return this.weight;//gets the value of the weight
}
public void setAge(int ageIn){//sets instance of the age
    this.age = ageIn;
 }
public int getAge(){
    return this.age;//gets the value of the age
}
 public void setExperience(int experienceIn){//sets instance of the experience
    this.experience = experienceIn;
 }
public int getExperience(){
    return this.experience;//gets the value of the experience
}
public void setTouchdowns(int touchdownsIn){//sets instance of the touchdowns
    this.touchdowns = touchdownsIn;
 }
public int getTouchdowns(){
    return this.touchdowns;//gets the value of the touchdowns
}
public void setIntercepts(int interceptsIn){//sets instance of the intercepts
    this.intercepts = interceptsIn;
 }
public int getIntercepts(){
    return this.intercepts;//gets the value of the intercepts
}
public void setYards(int yardsIn){//sets instance of the yards
    this.yards = yardsIn;
 }
public int getYards(){
    return this.yards;//gets the value of the yards
}
public void DisplayNFLPlayer(){ //The program is grabbing the information from DisplayNFLPlayer.java. 
    //DisplayNFLPlayer.java is the other program in this source package.
    System.out.println("Starting " + getPosition()  +  " " + getName() + "!");
    System.out.println("At " + getHeight()+ "ft" + getInches() + " and " + getWeight() + "lbs " +  "he's a fierce competitor.");
    System.out.println("At age " + getAge() + " He's got " +  getExperience() +  " years of experience in the league.");
    System.out.println("His record has " + getTouchdowns() + " touchdowns, " + getIntercepts () + " intercepts and " + getYards () + " yards.");
} //Details are pulled and printed to the console.

    }
//End of the program