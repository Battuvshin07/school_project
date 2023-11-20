package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class dashBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashBoard frame = new dashBoard();
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
	public dashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(6, 6, 853, 520);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(6, 6, 374, 509);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel Profile = new JPanel();
		Profile.setBounds(6, 187, 362, 70);
		panel_1.add(Profile);
		Profile.setLayout(null);
		
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Profile pr = new Profile();
				pr.show();
				dispose();
			}
		});
		btnNewButton.setBounds(6, 6, 350, 58);
		Profile.add(btnNewButton);
		
		JPanel home_page = new JPanel();
		home_page.setBounds(6, 269, 362, 70);
		panel_1.add(home_page);
		home_page.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("HOME PAGE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				homePage hp = new homePage();
				hp.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 6, 350, 58);
		home_page.add(btnNewButton_1);
		
		JPanel setings = new JPanel();
		setings.setBounds(6, 351, 362, 70);
		panel_1.add(setings);
		setings.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("SETTINGS");
		btnNewButton_2.setBounds(6, 6, 350, 58);
		setings.add(btnNewButton_2);
		
		JLabel lblimglogo = new JLabel("logo\n");
		lblimglogo.setBounds(128, 42, 109, 109);
		panel_1.add(lblimglogo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 433, 362, 70);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton GENRES = new JButton("GENRES");
		GENRES.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				genres gs = new genres();
				gs.show();
				dispose();
				}
		});
		GENRES.setBounds(6, 6, 350, 58);
		panel_2.add(GENRES);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(392, 6, 455, 509);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("Таны рекламны орон зай");
		textField.setBounds(56, 52, 360, 415);
		panel_3.add(textField);
		textField.setColumns(10);
	}
}
