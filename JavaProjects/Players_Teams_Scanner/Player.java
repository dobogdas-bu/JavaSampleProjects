/**
 * Player.java (Assignment 3, Part 2)
 * @author YOUR NAME
 */

package cs520.hw3.part2;

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

    public double computeScoringAverage(){
        double average = random.nextDouble(10.00);
        return average;
    }

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
