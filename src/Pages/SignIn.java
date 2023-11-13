package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel window_panel = new JPanel();
	private JTextField UsernameTextField;
	private JTextField Password_textField;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
				
				HomePage mm  = new HomePage();
				mm.show();
				dispose();
			}
		});
		Sign_button.setBackground(Color.LIGHT_GRAY);
		Sign_button.setBounds(25, 202, 90, 17);
		contentPane.add(Sign_button);
	}
}
