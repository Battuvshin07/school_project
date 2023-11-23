package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private final JPanel window_panel = new JPanel();
    private JTextField UsernameTextField;
    private JTextField Password_textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignIn frame = new SignIn();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SignIn() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        window_panel.setBackground(Color.LIGHT_GRAY);
        window_panel.setBounds(217, 0, 233, 272);
        contentPane.add(window_panel);

        JPanel User_name = new JPanel();
        User_name.setBounds(25, 106, 155, 36);
        contentPane.add(User_name);

        UsernameTextField = new JTextField();
        User_name.add(UsernameTextField);
        UsernameTextField.setColumns(10);

        JPanel Password = new JPanel();
        Password.setBounds(25, 154, 155, 36);
        contentPane.add(Password);

        Password_textField = new JTextField();
        Password.add(Password_textField);
        Password_textField.setColumns(10);

        JButton Sign_button = new JButton("Sign in");
        Sign_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signInAction();
            }
        });
        Sign_button.setBackground(Color.LIGHT_GRAY);
        Sign_button.setBounds(25, 202, 90, 17);
        contentPane.add(Sign_button);
    }

    private void signInAction() {
        try {
            Connection connection = DriverManager.getConnection("localhost url");
            PreparedStatement ps = connection.prepareStatement("SELECT `username`, `password` FROM `userlist` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, UsernameTextField.getText());
            ps.setString(2, Password_textField.getText());
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                JOptionPane.showMessageDialog(null, "Login Success.");
                homePage mm = new homePage();
                mm.show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
