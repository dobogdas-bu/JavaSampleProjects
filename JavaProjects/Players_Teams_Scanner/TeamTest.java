/**
 * TeamTest.java (Assignment 3, Part 2)
 * @author YOUR NAME
 */

package cs520.hw3.part2;

import java.io.File;
import java.util.Scanner;

public class TeamTest {

    public static void main(String[] args){
        double totalScoringAverage=0;
        try{
            File file = new File("team.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                totalScoringAverage += createPlayer(scanner.nextLine(),scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

                scanner.nextLine();
            }
            System.out.println();
            System.out.println("Average score: "+totalScoringAverage/10);

        } catch(Exception e){
            System.out.println("There was a problem reading the file. Please try again.");
            e.printStackTrace();
        }

        //while File.hasnextline?
    }


    public static double createPlayer(String number, String name, String position, String year){
        int intNumber = Integer.parseInt(number);
        Player player = new Player(name);
        player.setNumber(intNumber);
        player.setPosition(position);
        player.setYear(year);
        double average = player.computeScoringAverage();
        System.out.println(player.toString()+": "+average);
        return average;
    }


}
