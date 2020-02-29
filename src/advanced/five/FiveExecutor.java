
package advanced.five;

//java.io

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC
//1. Povezati se na izvor podataka
//1.1. Dodati konektor baze na koju se povezujemo
//1.2. Na kojoj adresi se nalazi baza (URL, username, password)
//2. Slati upite(queries) i pisati izraze(SQL)
//3. Dohvatiti podatke i analizirati ih

public class FiveExecutor {
    
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "pass";
    
    public static void main(String[] args) {
        
        try(Connection connection = DriverManager.getConnection(URL, URL, PASSWORD);){
            Statement statement = connection.createStatement();
            String sqlStatement = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(sqlStatement);
            
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                String surname = resultSet.getString(3);
                
                System.out.println(id + " -> " + name + " -> " + surname);
            }
            
        }catch(SQLException ex){
            System.err.println(ex.getLocalizedMessage());
        }
                
        
        
    }
    
}
