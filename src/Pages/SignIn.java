package Pages;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Frame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField password;

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
		setTitle("Customer Membership System By Ponhvath Vann");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1938, 1048);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1920, 1001);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel backgroundPicture = new JLabel("");
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBounds(765, 258, 396, 528);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel loginPic = new JLabel("");
		loginPic.setIcon(new ImageIcon(SignIn.class.getResource("/picture/3.png")));
		loginPic.setHorizontalAlignment(SwingConstants.CENTER);
		loginPic.setBounds(12, 89, 130, 127);
		panel_1.add(loginPic);
		
		JLabel pswdPic = new JLabel("");;
		pswdPic.setIcon(new ImageIcon(SignIn.class.getResource("/picture/5.png")));
		pswdPic.setHorizontalAlignment(SwingConstants.CENTER);
		pswdPic.setBounds(41, 201, 83, 61);
		panel_1.add(pswdPic);
		
		user = new JTextField();
		user.setToolTipText("Username");
		user.setHorizontalAlignment(SwingConstants.CENTER);
		user.setColumns(10);
		user.setBounds(123, 133, 238, 41);
		panel_1.add(user);
		
		JLabel lblNewLabel = new JLabel("Member Login");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 60, 321, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblNew = new JLabel("New User?");
		lblNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblNew.setForeground(new Color(0, 0, 0));
		lblNew.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNew.setBackground(Color.WHITE);
		lblNew.setBounds(40, 335, 321, 49);
		panel_1.add(lblNew);
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(123, 209, 238, 41);
		panel_1.add(password);
		
		JButton btnLogin = new JButton("SIGN IN");
		btnLogin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_rental", "root", "PHW#84#jeor");

		            String query = "SELECT * FROM user WHERE username = ? AND password = ?";
		            try (PreparedStatement stmt = con.prepareStatement(query)) {
		                stmt.setString(1, user.getText()); // Use getText() to get text from JTextField
		                stmt.setString(2, password.getText()); // Use getText() to get text from JTextField

		                ResultSet rs = stmt.executeQuery();

		                if (rs.next()) {
		                    // Login successful, open the dashboard
		                    dashBoard db = new dashBoard();
		                    dispose();
		                    db.show();
		                } else {
		                    JOptionPane.showMessageDialog(null, "Нэвтрэх нэр эсвэл нууц үг буруу байна.");
		                }
		            }
		        } catch (ClassNotFoundException | SQLException e1) {
		            e1.printStackTrace(); // Handle the exception appropriately in your application
		        }
		    }
		});
//main

		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBackground(new Color(102, 102, 102));
		btnLogin.setBounds(40, 289, 321, 49);
		panel_1.add(btnLogin);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				SignUp su = new SignUp();
				su.show();
				dispose();
			}
		});
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSignUp.setBackground(new Color(102, 102, 102));
		btnSignUp.setBounds(40, 372, 321, 49);
		panel_1.add(btnSignUp);
		
		JLabel lblAdmin = new JLabel("Admin?");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setForeground(Color.BLACK);
		lblAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdmin.setBackground(Color.WHITE);
		lblAdmin.setBounds(-24, 445, 321, 49);
		panel_1.add(lblAdmin);
		
		JLabel loginPic_1 = new JLabel("");
		loginPic_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				adminLogin al = new adminLogin();
				al.show();
				dispose();
			}
	});
		loginPic_1.setIcon(new ImageIcon(SignIn.class.getResource("/picture/admin.png")));
		loginPic_1.setHorizontalAlignment(SwingConstants.CENTER);
		loginPic_1.setBounds(231, 413, 130, 127);
		panel_1.add(loginPic_1);
		backgroundPicture.setIcon(new ImageIcon(SignIn.class.getResource("/picture/popcorn (1).jpg")));
		backgroundPicture.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundPicture.setBounds(0, 0, 1920, 1001);
		panel.add(backgroundPicture);
		
	
	}
}


