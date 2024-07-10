package cs520.hw5;

import java.sql.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Database {
private static final String URL = "jdbc:mysql://metcs520.mysql.database.azure.com:3306/dobogdas";
private static final String USERNAME = "dobogdas@metcs520";
private static final String PASSWORD= "$$";

public void insertPlayers(Collection<Player> player) throws DatabaseException{
    Connection conn =null;
    Statement stmt = null;
    PreparedStatement preparedStmt = null;
    try{
        conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        stmt = conn.createStatement();
        Iterator<Player> itr = player.iterator();
        while (itr.hasNext()){
            Player plr = itr.next();
            String query = "delete from players where number = "+ plr.getNumber();
            stmt.executeUpdate(query);
            //query = "insert into players values ("+ plr.getNumber()+","+ "'"+plr.getName()+"',"+"'"+plr.getPosition()+"',"+"'"+plr.getYear()+"')";
            query = "insert into players values (?,?,?,?)";
            preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1,plr.getNumber());
            preparedStmt.setString(2,plr.getName());
            preparedStmt.setString(3,plr.getPosition());
            preparedStmt.setString(4,plr.getYear());
            preparedStmt.executeUpdate();
            System.out.println("Inserting player into database: "+plr.toString());
        }
    }catch(Exception e){
        throw new DatabaseException(e);
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }

        try{
            if(preparedStmt!=null) {
                preparedStmt.close();
            }
        } catch(Exception e3){
            e3.printStackTrace();
        }

    }
}

public Map<String,Player> selectPlayers() throws DatabaseException{
    HashMap<String,Player> players = new HashMap<>();
    Connection conn =null;
    PreparedStatement preparedStmt = null;

    try {
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String query = "select * from players";
        preparedStmt = conn.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery();

        while (rs.next()) {
            Player player = new Player();
            player.setNumber(rs.getInt("NUMBER"));
            player.setName(rs.getString("NAME"));
            player.setPosition(rs.getString("POSITION"));
            player.setYear(rs.getString("YEAR"));
            players.put(rs.getString("NAME"),player);
        }


    } catch (Exception e){
        throw new DatabaseException(e);
    } finally {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }

        try{
            if(preparedStmt!=null) {
                preparedStmt.close();
            }
        } catch(Exception e3){
            e3.printStackTrace();
        }
    }

    return players;
}


}
