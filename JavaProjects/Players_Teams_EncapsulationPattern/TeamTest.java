/**
 This is a placeholder file. Copy TeamTest.java from Assignment 3 and overwrite this file.
 Change its package statement to match the current package (cs520.hw4).
 */

package cs520.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamTest {
    public static void main(String[] args){

        ArrayList<Player> players = new ArrayList<>();

        try{
            File file = new File("team.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                Player player = createPlayer(scanner.nextLine(),scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                players.add(player);
                scanner.nextLine();
            }

            System.out.println();


        } catch(Exception e){
            System.out.println("There was a problem reading the file. Please try again.");
            e.printStackTrace();
        }

        String[] opponents = new String[] {"BC", "Northeastern", "Harvard", "MIT", "UMass"};
        for (String team : opponents){
            Game game = new Game();
            game.setTeamName("Boston");
            game.setOpponentName(team);
            game.setDate(06,2022,05);
            game.setPlayers(players);
            game.simulateGame();

        }

    }


    public static Player createPlayer(String number, String name, String position, String year){
        int intNumber = Integer.parseInt(number);
        Player player = new Player(name);
        player.setNumber(intNumber);
        player.setPosition(position);
        player.setYear(year);
        return player;
    }


}
