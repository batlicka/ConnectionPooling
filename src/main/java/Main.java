import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] arg){
        System.out.println("ahoj");
        try{
            Connection con = C3p0DataSource.getConnection();
            System.out.println("cennection ended");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
