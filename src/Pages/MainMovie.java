package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainMovie extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMovie frame = new MainMovie();
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
	public MainMovie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 853, 503);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 5, 359, 492);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton signupButton = new JButton("бүртгүүлэх");
		signupButton.setBounds(78, 251, 199, 76);
		panel_1.add(signupButton);
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignUp sp = new SignUp();
				sp.show();
				dispose();
				
			}
		});
		
		JButton signinButton = new JButton("Нэвтрэх\n");
		signinButton.setBounds(78, 144, 199, 76);
		panel_1.add(signinButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(380, 6, 455, 491);
		panel.add(panel_3);
		signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SignIn sn = new SignIn();
				sn.show();
				dispose();
			}
		});
	}
}
