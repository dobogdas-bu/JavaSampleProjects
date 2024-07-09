package cs520.hw4;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game {

    private int month;
    private int day;
    private int year;
    private String teamName;
    private String opponentName;
    private List<Player> players;
    private Random random = new Random();


    public void setDate(int month, int year, int day){
        this.month = month;
        this.year = year;
        this.day = day;
    }


    public void simulateGame(){
        //Game played on month/day/year vs. opponentName
        System.out.println("Game played on "+this.month+"/"+this.day +"/"+this.year+" vs "+opponentName);
        int teamPoints = 0;
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()){
            int points = random.nextInt(10)+1;
            teamPoints+=points;
            System.out.println(iterator.next().toString()+ " scored "+points+" points.");
        }
        int opponentPoints = random.nextInt(100)+1;
        System.out.println("Final Score: "+ teamName +" "+teamPoints+", "+opponentName +" "+opponentPoints);
        System.out.println();
    }




    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
