package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField passwordField_1;
	private JTextField passwordField_2;

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

	/**
	 * Create the frame.
	 */
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
		
		textField = new JTextField();
		Username.add(textField);
		textField.setColumns(10);
		
		JPanel Password = new JPanel();
		Password.setBounds(262, 105, 160, 40);
		contentPane.add(Password);
		
		passwordField_1 = new JTextField();
		Password.add(passwordField_1);
		passwordField_1.setColumns(10);
		
		JPanel Confirm_password = new JPanel();
		Confirm_password.setBounds(262, 166, 160, 40);
		contentPane.add(Confirm_password);
		
		passwordField_2 = new JTextField();
		Confirm_password.add(passwordField_2);
		passwordField_2.setColumns(10);
		
		JButton create_account = new JButton("Sign up");
		create_account.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignIn sn = new SignIn();
				sn.show();
				dispose();
				
			}
		});
		create_account.setBounds(285, 218, 117, 29);
		contentPane.add(create_account);
	}

}
