import javax.swing.*;

public class MenuPage extends JPanel {
    public MenuPage () {
        setSize(500, 500);

        JButton addUserPageButton = new JButton("Add new user: ");
        addUserPageButton.setSize(300, 40);
        addUserPageButton.setLocation(100, 100);
        add(addUserPageButton);


        JButton listUsersPageButton = new JButton("Text user");
        listUsersPageButton.setSize(300, 40);

    }

}
