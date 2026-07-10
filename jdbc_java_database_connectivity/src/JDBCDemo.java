import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "Vedant@271";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
