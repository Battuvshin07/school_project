package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuItem;

public class genres extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					genres frame = new genres();
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
	public genres() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 866, 541);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 5, 329, 530);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox<String> dropDownList = new JComboBox<String>();
        dropDownList.setToolTipText("GENRES");
        dropDownList.addItem("Action");
        dropDownList.addItem("Adventure");
        dropDownList.addItem("Animation");
        dropDownList.addItem("Comedy");
        dropDownList.addItem("Crime");
        dropDownList.addItem("Drama");
        dropDownList.addItem("Fantasy");
        dropDownList.addItem("Horror");
        dropDownList.addItem("Mystery");
        dropDownList.addItem("Romance");
        dropDownList.addItem("Science Fiction");
        dropDownList.addItem("Thriller");
        dropDownList.addItem("War");
        dropDownList.addItem("Western");
        dropDownList.addItem("Documentary");
        dropDownList.addItem("Family");
        dropDownList.addItem("Musical");
        dropDownList.addItem("Biography");
        dropDownList.addItem("History");
        dropDownList.addItem("Sport");
        dropDownList.setBounds(10, 10, 220, 25);
        panel_1.add(dropDownList);

        // Second JComboBox with movie genres
        JComboBox<String> dropDownList_1 = new JComboBox<String>();
        dropDownList_1.setToolTipText("GENRES");
        dropDownList_1.addItem("Action");
        dropDownList_1.addItem("Adventure");
        dropDownList_1.addItem("Animation");
        dropDownList_1.addItem("Comedy");
        dropDownList_1.addItem("Crime");
        dropDownList_1.addItem("Drama");
        dropDownList_1.addItem("Fantasy");
        dropDownList_1.addItem("Horror");
        dropDownList_1.addItem("Mystery");
        dropDownList_1.addItem("Romance");
        dropDownList_1.addItem("Science Fiction");
        dropDownList_1.addItem("Thriller");
        dropDownList_1.addItem("War");
        dropDownList_1.addItem("Western");
        dropDownList_1.addItem("Documentary");
        dropDownList_1.addItem("Family");
        dropDownList_1.addItem("Musical");
        dropDownList_1.addItem("Biography");
        dropDownList_1.addItem("History");
        dropDownList_1.addItem("Sport");
        dropDownList_1.setBounds(10, 47, 220, 25);
        panel_1.add(dropDownList_1);

        // Third JComboBox with movie genres
        JComboBox<String> dropDownList_2 = new JComboBox<String>();
        dropDownList_2.setToolTipText("GENRES");
        dropDownList_2.addItem("Action");
        dropDownList_2.addItem("Adventure");
        dropDownList_2.addItem("Animation");
        dropDownList_2.addItem("Comedy");
        dropDownList_2.addItem("Crime");
        dropDownList_2.addItem("Drama");
        dropDownList_2.addItem("Fantasy");
        dropDownList_2.addItem("Horror");
        dropDownList_2.addItem("Mystery");
        dropDownList_2.addItem("Romance");
        dropDownList_2.addItem("Science Fiction");
        dropDownList_2.addItem("Thriller");
        dropDownList_2.addItem("War");
        dropDownList_2.addItem("Western");
        dropDownList_2.addItem("Documentary");
        dropDownList_2.addItem("Family");
        dropDownList_2.addItem("Musical");
        dropDownList_2.addItem("Biography");
        dropDownList_2.addItem("History");
        dropDownList_2.addItem("Sport");
        dropDownList_2.setBounds(10, 90, 220, 25);
        panel_1.add(dropDownList_2);
        
        JButton menu = new JButton("MENU");
        menu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dashBoard db = new dashBoard();
        		db.show();
        		dispose();
        	}
        });
        menu.setBounds(10, 495, 117, 29);
        panel_1.add(menu);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(383, 79, 133, 174);
		panel.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(535, 79, 133, 174);
		panel.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(690, 79, 133, 174);
		panel.add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(690, 276, 133, 174);
		panel.add(panel_2_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBounds(535, 276, 133, 174);
		panel.add(panel_2_4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBounds(383, 276, 133, 174);
		panel.add(panel_2_5);
		
		JButton UP = new JButton("UP");
		UP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UP.setBounds(743, 6, 117, 29);
		panel.add(UP);
		
		JButton DOWN = new JButton("DOWN");
		DOWN.setBounds(743, 506, 117, 29);
		panel.add(DOWN);
	}
}
