import java.sql.*;

public class JDBCDemo4 {
    public static void main(String[] args) {
        int sid = 102;
        String sname = "Sherlock";
        int marks = 100;
        String url = "jdbc:postgresql://localhost:5433/demo";
        String username = "postgres";
        String password = "Vedant@271";
        String query1 = "Insert into student values (?, ?, ?)";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setInt(1, sid);
            preparedStatement.setString(2, sname);
            preparedStatement.setInt(3, marks);
            preparedStatement.execute();

            connection.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
