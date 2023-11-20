package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable profile_img;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Username = new JPanel();
		Username.setBounds(402, 248, 210, 70);
		contentPane.add(Username);
		Username.setLayout(null);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(6, 6, 198, 58);
		Username.add(txtpnUsername);
		
		JPanel Left_days = new JPanel();
		Left_days.setBounds(402, 330, 210, 62);
		contentPane.add(Left_days);
		Left_days.setLayout(null);
		
		JTextPane txtpnLeftDaysN = new JTextPane();
		txtpnLeftDaysN.setBounds(6, 6, 198, 50);
		Left_days.add(txtpnLeftDaysN);
		txtpnLeftDaysN.setText("LEFT DAYS: n");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 229, 511);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME PAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePage hp = new homePage();
				hp.show();
				dispose();
			}
		});
		btnNewButton.setBounds(53, 129, 117, 29);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("сунгалт хийх");
		btnNewButton_1.setBounds(53, 193, 117, 29);
		panel_2.add(btnNewButton_1);
		
		profile_img = new JTable();
		profile_img.setBounds(392, 16, 220, 220);
		contentPane.add(profile_img);
	}
}
