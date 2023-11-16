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
import javax.swing.JTextArea;


public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tsearchHomeField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Header = new JPanel();
		Header.setBounds(0, 0, 900, 35);
		Header.setBackground(Color.LIGHT_GRAY);
		contentPane.add(Header);
		Header.setLayout(null);
		
		JButton NavigateGateDash_b = new JButton("DashBoard");
		NavigateGateDash_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dashBoard db = new dashBoard();
				db.show();
				dispose();
			}
		});
		NavigateGateDash_b.setBounds(0, 0, 128, 35);
		Header.add(NavigateGateDash_b);
		
		JButton genre = new JButton("genre");
		genre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				genres gr = new genres();
				gr.show();
				dispose();
			}
		});
		genre.setBounds(777, 3, 117, 29);
		Header.add(genre);
		
		tsearchHomeField = new JTextField();
		tsearchHomeField.setBounds(286, 3, 296, 26);
		Header.add(tsearchHomeField);
		tsearchHomeField.setColumns(10);
		
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(Color.LIGHT_GRAY);
		panel_0.setBounds(39, 75, 133, 174);
		contentPane.add(panel_0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(213, 75, 133, 174);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(392, 75, 133, 174);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(564, 75, 133, 174);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(743, 75, 133, 174);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(39, 267, 133, 174);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(213, 267, 133, 174);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(392, 267, 133, 174);
		contentPane.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(564, 267, 133, 174);
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(743, 267, 133, 174);
		contentPane.add(panel_9);
		
		JButton UP = new JButton("UP");
		UP.setBounds(759, 453, 117, 29);
		contentPane.add(UP);
		
		JButton DOWN = new JButton("DOWN");
		DOWN.setBounds(759, 494, 117, 29);
		contentPane.add(DOWN);
	}
}
