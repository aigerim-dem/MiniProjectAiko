import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewForDB {
    public static void main (String [] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Создаем подключение.
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/group0801?useUnicode=true&serverTimezone=UTC","root", ""
        );
        System.out.println("CONNECTED");

        String s = "INSERT INTO user (id, name, surname, age) VALUES (NULL, \"Nurgul\", \"Matayeva\", 52)";
        PreparedStatement ps = connection.prepareStatement(s);
        ps.executeUpdate();
    }
}
