
package advanced.four;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
     public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Zana17@Su")){
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM person.person LIMIT 100";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                String name = resultSet.getString(2);
                System.out.println(name);
            }
        }catch(SQLException e){
            System.err.println(e.getCause());
        }
    }
    
}
