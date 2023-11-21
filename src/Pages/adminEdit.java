package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class adminEdit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminEdit frame = new adminEdit();
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
	public adminEdit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(6, 6, 579, 418);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrCast = new JTextArea();
		txtrCast.setBounds(35, 27, 56, 16);
		txtrCast.setText("Movie ID");
		txtrCast.setEditable(false);
		txtrCast.setBackground(Color.LIGHT_GRAY);
		panel.add(txtrCast);
		
		textField = new JTextField();
		textField.setBounds(93, 22, 185, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name :");
		txtrName.setEditable(false);
		txtrName.setBackground(Color.LIGHT_GRAY);
		txtrName.setBounds(35, 55, 56, 22);
		panel.add(txtrName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 55, 185, 26);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrLanguage = new JTextArea();
		txtrLanguage.setText("Language :");
		txtrLanguage.setEditable(false);
		txtrLanguage.setBackground(Color.LIGHT_GRAY);
		txtrLanguage.setBounds(35, 89, 69, 22);
		panel.add(txtrLanguage);
		
		JComboBox<String> comboBoxlanguage = new JComboBox<String>();
		comboBoxlanguage.setEditable(false);
		comboBoxlanguage.setBounds(113, 87, 165, 22);
		panel.add(comboBoxlanguage);
		
		JTextArea txtrGenre = new JTextArea();
		txtrGenre.setText("Genre :");
		txtrGenre.setEditable(false);
		txtrGenre.setBackground(Color.LIGHT_GRAY);
		txtrGenre.setBounds(35, 123, 69, 22);
		panel.add(txtrGenre);
		
		JComboBox<String> comboBoxgenre1 = new JComboBox<String>();
		comboBoxgenre1.setEditable(false);
		comboBoxgenre1.setBounds(113, 123, 165, 22);
		panel.add(comboBoxgenre1);
		
		JComboBox<String> comboBoxgenre1_1 = new JComboBox<String>();
		comboBoxgenre1_1.setEditable(false);
		comboBoxgenre1_1.setBounds(113, 159, 165, 22);
		panel.add(comboBoxgenre1_1);
		
		JComboBox<String> comboBoxgenre1_2 = new JComboBox<String>();
		comboBoxgenre1_2.setEditable(false);
		comboBoxgenre1_2.setBounds(113, 193, 165, 22);
		panel.add(comboBoxgenre1_2);
		
		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setText("Description :");
		txtrDescription.setForeground(Color.BLACK);
		txtrDescription.setEditable(false);
		txtrDescription.setBackground(Color.LIGHT_GRAY);
		txtrDescription.setBounds(35, 227, 165, 22);
		panel.add(txtrDescription);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(35, 261, 264, 143);
		panel.add(textField_2);
		
		JTextArea txtrImage = new JTextArea();
		txtrImage.setText("Image :");
		txtrImage.setEditable(false);
		txtrImage.setBackground(Color.LIGHT_GRAY);
		txtrImage.setBounds(301, 27, 69, 22);
		panel.add(txtrImage);
		
		JTextArea txtrMovie = new JTextArea();
		txtrMovie.setText("Movie :");
		txtrMovie.setEditable(false);
		txtrMovie.setBackground(Color.LIGHT_GRAY);
		txtrMovie.setBounds(301, 55, 69, 22);
		panel.add(txtrMovie);
		
		textField_3 = new JTextField();
		textField_3.setBounds(361, 22, 130, 26);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(361, 55, 130, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("DONE");
		btnNewButton.setBounds(372, 369, 117, 29);
		panel.add(btnNewButton);
	}

}
