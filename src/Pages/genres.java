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
import javax.swing.JTextArea;

public class genres extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchGenreField;

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
		
		JComboBox<String> comboBoxgenre1 = new JComboBox<String>();
		comboBoxgenre1.setBounds(10, 252, 165, 22);
		comboBoxgenre1.setEditable(false);  // Set to non-editable
		panel_1.add(comboBoxgenre1);

		JComboBox<String> comboBoxgenre2 = new JComboBox<String>();
		comboBoxgenre2.setBounds(10, 285, 165, 22);
		comboBoxgenre2.setEditable(false);  // Set to non-editable
		panel_1.add(comboBoxgenre2);

		JComboBox<String> comboBoxgenre3 = new JComboBox<String>();
		comboBoxgenre3.setBounds(10, 318, 165, 22);
		comboBoxgenre3.setEditable(false);  // Set to non-editable
		panel_1.add(comboBoxgenre3);

		String[] genres = {"Action", "Adventure", "Animation", "Comedy", "Crime", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Science Fiction", "Thriller", "War", "Western", "Documentary", "Family", "Musical", "Biography", "History", "Sport"};

		for (String genre : genres) {
		    comboBoxgenre1.addItem(genre);
		    comboBoxgenre2.addItem(genre);
		    comboBoxgenre3.addItem(genre);
		}

        
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
        
        searchGenreField = new JTextField();
        searchGenreField.setBounds(76, 127, 198, 26);
        panel_1.add(searchGenreField);
        searchGenreField.setColumns(10);
       
        
        JTextArea txtrSearch = new JTextArea();
        txtrSearch.setBackground(Color.white);
        txtrSearch.setText("search");
        txtrSearch.setBounds(20, 132, 42, 16);
        txtrSearch.setEditable(false);
        panel_1.add(txtrSearch);
		
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
