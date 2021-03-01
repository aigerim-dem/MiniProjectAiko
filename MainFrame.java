import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setLayout(null);
        setSize(500, 500);

        label = new JLabel("HELLO BITLAB APPLICATION");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);


        textField = new JTextField("HELLO BITLAB APPLICATION");
        textField.setSize(300,30);
        textField.setLocation(100,150);

        add(textField);

        button = new JButton("CONFIRM");
        button.setSize(300,30);
        button.setLocation(100,200);



        JButton fire = new JButton("FIRE");
        fire.setBounds(100, 360, 300, 40);
        add(fire);

        fire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel bullet = new JLabel("*");
                bullet.setSize(40, 40);
                add(bullet);
                MainThread thread = new MainThread(bullet);
                thread.start();


            }
        });

    }
}


