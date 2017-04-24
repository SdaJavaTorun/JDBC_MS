import java.sql.*;


/**
 * Created by RENT on 2017-04-24.
 */
public class sqlQuery {
    Statement statement = null;
    Connection connection = databaseConnection.getConnection();

    public void method() {
        try {
            statement = connection.createStatement(); //zapytanie
            ResultSet resultSet = statement.executeQuery("select * from books;");
            while (resultSet.next()) {
                System.out.printf("%-90s%-22s%-10s%20s\t%-28s%5d%20s\t%-3.2f%3d%3d",
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getDate("published"),
                        resultSet.getString("isbn"),
                        resultSet.getString("category"),
                        resultSet.getInt("page_count"),
                        resultSet.getString("publisher"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("on_stock"),
                        resultSet.getInt("id"));
                System.out.println();}
            }catch(SQLException ex){
                ex.printStackTrace();
            } catch(Exception e){
                e.printStackTrace();
            }
        }


}