import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "Vedant@271";
        String query = "Select sname from student where sid = 1";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            System.out.println("Student from database is " + resultSet.getString("sname"));

            connection.close();
            System.out.println("connection Closed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
