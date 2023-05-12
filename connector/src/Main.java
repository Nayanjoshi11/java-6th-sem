import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mydatabse";
        //connect to dabase
        Connection conn = DriverManager.getConnection(url,"root","root");
        System.out.println("connection success");

        //fetch data from database;
          Statement statement =  conn.createStatement();
          Resultset resultset = statement.executeQuery("SELECT * from new_table");
          System.out.println(resultset);

          while(resultset.next()){
              System.out.print(resultset.getInt("id")+ " ");

          }


    }
}