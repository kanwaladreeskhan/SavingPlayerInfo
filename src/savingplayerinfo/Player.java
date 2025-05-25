 package savingplayerinfo;
 import java.io.*;
public class Player implements Serializable{
    private String name;
    private int level;
    private double score;
    public Player(String name,int level,double score){
        this.name=name;
        this.level=level;
        this.score=score;
    }
    
    @Override
    public String toString(){
        return "Name : " + name + "\nLevel : " + level + "\nScore : " + score;
    }    

}
