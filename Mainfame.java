import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainfame extends JFrame {
    public Mainfame(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Aiko");
        setLayout(null);

        JLabel nameLabel = new JLabel("Full name: ");
        nameLabel.setLocation(100,100);
        nameLabel.setSize(100, 40);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setLocation(200,100);
        nameTextField.setSize(200,40);
        add(nameTextField);

        JLabel lastNameLabel = new JLabel("Phone number: ");
        lastNameLabel.setLocation(100, 150);
        lastNameLabel.setSize(100, 40);
        add(lastNameLabel);

        JTextField lastNameTextField = new JTextField();
        lastNameTextField.setLocation(200,150);
        lastNameTextField.setSize(200, 40);
        add(lastNameTextField);

        JLabel cityLabel = new JLabel("Age: ");
        cityLabel.setLocation(100, 200);
        cityLabel.setSize(100, 40);
        add(cityLabel);


        String [] ages = {" ", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29", "30"};
        JComboBox agesCombobox = new JComboBox(ages);
        agesCombobox.setLocation(200, 200);
        agesCombobox.setSize(200, 40);
        add(agesCombobox);

        JButton Button = new JButton("Add user");
        Button.setLocation(100, 250);;
        Button.setSize(300, 40);
        add(Button);

        JTextArea textArea = new JTextArea();
        textArea.setLocation(100, 300);
        textArea.setSize(300,150);
        add(textArea);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                nameTextField.setText("");
                String lastName = lastNameTextField.getText();
                lastNameTextField.setText("");
                String ages = (String) agesCombobox.getSelectedItem();
                agesCombobox .setSelectedIndex(0);
                textArea.append(name+" " + lastName + " " +ages + " \n ");


            }
        }
        );

    }
}
