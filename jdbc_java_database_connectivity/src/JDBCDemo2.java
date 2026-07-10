import java.sql.*;

public class JDBCDemo2 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "Vedant@271";
        String query1 = "Insert into student values(6, 'John', 85)";
        String query2 = "Update student set sname = 'Max' where sid = 6";
        String query3 = "Delete from student where sid = 6";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");

            Statement statement = connection.createStatement();
            // execute can hit both Select as well as Insert/Update/Delete
            // execute returns true if ResultSet is returned i.e. Select query is hit
            // execute returns false if ResultSet is not returned i.e. Insert/Update/Delete query is hit
            statement.execute(query2);

            connection.close();
            System.out.println("connection Closed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
