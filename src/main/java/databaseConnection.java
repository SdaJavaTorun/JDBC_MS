import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by RENT on 2017-04-24.
 */
public class databaseConnection {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/ksiegarnia?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static databaseConnection instance = null;


    private databaseConnection() {
    }

    public static Connection getConnection(){
        Connection connection = null;
        if (instance == null) {
            try {
                Class.forName(JDBC_DRIVER);
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
