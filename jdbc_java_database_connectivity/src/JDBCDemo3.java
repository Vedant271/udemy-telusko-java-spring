import java.sql.*;

public class JDBCDemo3 {
    public static void main(String[] args) {
        int sid = 101;
        String sname = "Robin";
        int marks = 100;
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "Vedant@271";
        String query1 = "Insert into student values(" + sid + ", '" + sname + "', " + marks + ")";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            statement.execute(query1);

            connection.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
