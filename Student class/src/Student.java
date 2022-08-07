import java.util.*;
import java.util.Vector;
public class Student {
   private String name;
   private int ID;
   private String major;
   
    public Student(){

    }

    public Student(String name,int ID,String major){
        this.name = name;
        this.ID =ID;
        this.major=major;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public String toString(){
        return "name is: "+getName()+" ,The ID number is: "+getID()+" ,and the major is: "+getMajor();
    }

}
