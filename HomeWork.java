import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class HomeWork {
    public static void main (String [] args) throws ClassNotFoundException, SQLException {

        Scanner scanner = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/group0801?useUnicode=true&serverTimezone=UTC","root", ""
        );


        while (true) {
            System.out.println("PRESS [1] TO ADD ITEMS\n" +
                    "PRESS [2] TO LIST ITEMS\n" +
                    "PRESS [3] TO DELETE ITEMS\n" +
                    "PRESS [0] TO EXIT");
            String choice  = scanner.next();

            if (choice.equals("1")) {
                String s = "INSERT INTO item_DB (id, name, price) VALUES (NULL,?, ?)";
                PreparedStatement ps = connection.prepareStatement(s);
                System.out.println("Insert name");
                ps.setString(1, scanner.next());
                System.out.println("Insert price: ");
                ps.setInt(2, scanner.nextInt());
                ps.executeUpdate();
            }

            else if (choice.equals("2")){
                String s = "SELECT * FROM item_DB ";
                PreparedStatement ps = connection.prepareStatement(s);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int price = rs.getInt("price");
                    System.out.println(id + ". " + name + ". price is "+ price);

                }
            }

            else if (choice.equals("3")){
                System.out.println("Enter ID");
                int id = scanner.nextInt();
                String s = "DELETE FROM item_DB where id = ?";
                PreparedStatement ps = connection.prepareStatement(s);
                ps.setInt(1, id);
                ps.executeUpdate();

            }


            else if (choice.equals("0")) break;

        }

    }
}
