/**
 * DatabaseTest.java (Assignment 5)
 * @author YOUR NAME
 */

package cs520.hw5;

import java.io.File;
import java.util.*;

public class DatabaseTest {

	// Copy main() and createPlayer() from TeamTest (Assignment 4) here and
	// make the modifications listed in the Assignment 5 document.

    public static void main(String[] args){
        // A LinkedHashSet, as opposed to an ArrayList, will ensure that there are no duplicate values in the collection.
        // Additionally, it may be more efficient to retrieve the data since they are ordered in the same way they were inserted.
        // If using a HashSet, the entire set would have to be searched each time if the Key is not known.

        LinkedHashSet<Player> players = new LinkedHashSet<>();

        try{
            File file = new File("team.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                Player player = createPlayer(scanner.nextLine(),scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                players.add(player);
                scanner.nextLine();
            }
            Database database = new Database();
            database.insertPlayers(players);
            Map<String, Player> selectedPlayers = database.selectPlayers();
            Collection<String> nameKeys = selectedPlayers.keySet();
            Iterator<String> itr = nameKeys.iterator();
            while(itr.hasNext()){
                String name = itr.next();
                System.out.println(name+": "+ selectedPlayers.get(name));
            }

            System.out.println();

        } catch(Exception e){
            System.out.println("There was a problem reading the file. Please try again.");
            e.printStackTrace();
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
