import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "Vedant@271";
        String query1 = "Select sname from student where sid = 1";
        String query2 = "Select * from student";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");

            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query1);
//            resultSet.next();
//            System.out.println("Student from database is " + resultSet.getString("sname"));

            ResultSet resultSet = statement.executeQuery(query2);
            while(resultSet.next()) {
                System.out.print(resultSet.getInt(1) + " - ");
                System.out.print(resultSet.getString(2) + " - ");
                System.out.println(resultSet.getInt(3));
            }

            connection.close();
            System.out.println("connection Closed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
