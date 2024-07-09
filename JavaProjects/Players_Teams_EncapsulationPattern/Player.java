/**
 This is a placeholder file. Copy Player.java from Assignment 3 and overwrite this file.
 Make the following chsanges to it before you begin work on the assignment:
  - Change its package statement to match the current package (cs520.hw4)
  - Remove the computeScoringAverage() method
  - Remove any import statements that are no longer needed (optional)
*/

package cs520.hw4;

import java.util.Random;

public class Player {
    private int number;
    private String name;
    private String position;
    private String year;

    public Player(String name){
        this.name = name;
    }
    Random random = new Random();



    public String toString(){
        String player = "#"+ this.number +": "+this.name+" ("+this.position+", "+ this.year+")";
        return player;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
