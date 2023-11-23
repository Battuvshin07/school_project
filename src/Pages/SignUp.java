package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField passwordField_1;
    private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SignUp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Window_panel = new JPanel();
		Window_panel.setBackground(Color.LIGHT_GRAY);
		Window_panel.setBounds(0, 0, 228, 272);
		contentPane.add(Window_panel);
		
		JPanel Username = new JPanel();
		Username.setBounds(262, 53, 160, 40);
		contentPane.add(Username);
		
		usernametxt = new JTextField();
		Username.add(usernametxt);
		usernametxt.setColumns(10);
		
		JPanel Password = new JPanel();
		Password.setBounds(262, 105, 160, 40);
		contentPane.add(Password);
		
		passwordField_1 = new JPasswordField();
		Password.add(passwordField_1);
		passwordField_1.setColumns(10);
		
		JPanel Confirm_password = new JPanel();
		Confirm_password.setBounds(262, 166, 160, 40);
		contentPane.add(Confirm_password);
		
		passwordField_2 = new JPasswordField();
		Confirm_password.add(passwordField_2);
		passwordField_2.setColumns(10);
		
		JButton create_account = new JButton("Sign up");
        create_account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernametxt.getText();
                String password1 = new String(passwordField_1.getPassword());
                String password2 = new String(passwordField_2.getPassword());

                if (password1.equals(password2)) {
                    
                    try {
                    	// database uusgej holboh dutuu
                    	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlist", "root", "Hadasada3!");



                        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";

                        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                            preparedStatement.setString(1, username);
                            preparedStatement.setString(2, password1);


                            int rowsAffected = preparedStatement.executeUpdate();

                            if (rowsAffected > 0) {

                                JOptionPane.showMessageDialog(null, "Account created successfully!");
                                SignIn sn = new SignIn();
                                sn.setVisible(true);
                                dispose();
                            } else {

                                JOptionPane.showMessageDialog(null, "Failed to create account.");
                            }
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Database connection error.");
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.");
                }
            }
        });
        create_account.setBounds(285, 218, 117, 29);
        contentPane.add(create_account);
	}

}
