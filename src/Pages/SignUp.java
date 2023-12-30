package Pages;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

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
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


import javax.swing.JPasswordField;

public class SignUp extends JFrame {

	protected static final String JoptionPane = null;
	protected static final String userName = null;
	protected static final String Smail = null;
	private JPanel contentPane;
	private JTextField txtuserName;
	private JPasswordField txtpassword;
	
	
	////
	private JButton btnSignUp;
	private JButton btnSignIn;
	private JPasswordField txtUserid;
	
	///
	
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
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		panel_1.setBounds(765, 258, 396, 505);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel loginPic = new JLabel("");
		loginPic.setIcon(new ImageIcon(SignUp.class.getResource("/picture/3.png")));
		loginPic.setHorizontalAlignment(SwingConstants.CENTER);
		loginPic.setBounds(10, 47, 130, 127);
		panel_1.add(loginPic);
		
		JLabel pswdPic = new JLabel("");
		pswdPic.setIcon(new ImageIcon(SignUp.class.getResource("/picture/4.png")));
		pswdPic.setHorizontalAlignment(SwingConstants.CENTER);
		pswdPic.setBounds(40, 217, 83, 61);
		panel_1.add(pswdPic);
		
		txtuserName = new JTextField();
		txtuserName.setToolTipText("Username");
		txtuserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtuserName.setColumns(10);
		txtuserName.setBounds(123, 161, 238, 41);
		panel_1.add(txtuserName);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
	            @SuppressWarnings("deprecation")
	            public void actionPerformed(ActionEvent e) {
	            	String Suserid = txtUserid.getText();
	                String Sname = txtuserName.getText();
	                String Spassword = txtpassword.getText();
	               
	                
	                
	                if (Suserid.isEmpty() || Sname.isEmpty() || Spassword.isEmpty()) {
	                    JOptionPane.showMessageDialog(null, "Ta dutuu bogolson baina");
	                } else {
	                    try {
	                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_rental", "root", "PHW#84#jeor");

	                        String query = "INSERT INTO user(user_id, username, password) VALUES(?,?,?)";
	                        PreparedStatement pst = con.prepareStatement(query);
	                        pst.setString(1,Suserid);
	                        pst.setString(2, Sname);
	                   
	                        pst.setString(3, Spassword);
	                       

	                        int rowsAffected = pst.executeUpdate();
	                        if (rowsAffected > 0) {
	                            JOptionPane.showMessageDialog(null, "Амжилттай бүртгэгдэлээ.");
	                        } else {
	                            JOptionPane.showMessageDialog(null, "Бүртгэгдэхэд алдаа гарлаа.");
	                        }
	                        con.close();
	                    } catch (SQLException e1) {
	                        e1.printStackTrace();
	                    }
	                }
	            }
	        });
		btnSignUp.setBackground(new Color(102, 102, 102));
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSignUp.setBounds(40, 299, 321, 49);
		panel_1.add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("Register ");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 29, 321, 49);
		panel_1.add(lblNewLabel);
		
		JLabel lblReadyToUse = new JLabel("Ready to use?");
		lblReadyToUse.setHorizontalAlignment(SwingConstants.CENTER);
		lblReadyToUse.setForeground(new Color(0, 0, 0));
		lblReadyToUse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblReadyToUse.setBackground(Color.WHITE);
		lblReadyToUse.setBounds(40, 335, 321, 49);
		panel_1.add(lblReadyToUse);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
						SignIn si = new SignIn();
						si.show();
						dispose();

			}
		});
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSignIn.setBackground(new Color(102, 102, 102));
		btnSignIn.setBounds(123, 384, 239, 41);
		panel_1.add(btnSignIn);
		
		JLabel backPic = new JLabel("");
		backPic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SignIn si = new SignIn();
				si.show();
				dispose();

			}
		});
		backPic.setIcon(new ImageIcon(SignUp.class.getResource("/picture/6.png")));
		backPic.setHorizontalAlignment(SwingConstants.CENTER);
		backPic.setBounds(41, 376, 83, 61);
		panel_1.add(backPic);
		
		txtpassword = new JPasswordField();
		txtpassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtpassword.setBounds(123, 230, 238, 41);
		panel_1.add(txtpassword);
		
		txtUserid = new JPasswordField();
		txtUserid.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserid.setBounds(123, 89, 238, 41);
		panel_1.add(txtUserid);
		
		JLabel loginPic_1 = new JLabel("");
		loginPic_1.setIcon(new ImageIcon(SignUp.class.getResource("/picture/3.png")));
		loginPic_1.setHorizontalAlignment(SwingConstants.CENTER);
		loginPic_1.setBounds(10, 119, 130, 127);
		panel_1.add(loginPic_1);
		backgroundPicture.setIcon(new ImageIcon(SignUp.class.getResource("/picture/popcorn (1).jpg")));
		backgroundPicture.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundPicture.setBounds(0, 0, 1920, 1001);
		panel.add(backgroundPicture);
		
		
	}
}
