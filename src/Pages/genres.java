package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

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
		panel.setBackground(Color.GRAY);
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
		
		JLabel label_0 = new JLabel("Movie 0");
		label_0.setOpaque(true);
		label_0.setHorizontalAlignment(SwingConstants.CENTER);
		label_0.setBackground(Color.LIGHT_GRAY);
		label_0.setBounds(383, 79, 133, 174);
		panel.add(label_0);
		
		label_0.addMouseListener((MouseListener) new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(genres.this, "Movie 0 Clicked!");
            }
        });
		
		JLabel label_1 = new JLabel("Movie 1");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(535, 79, 133, 174);
		panel.add(label_1);
		
		label_1.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(genres.this, "Movie 1 Clicked!");
			}
		});		
		
		
		JLabel label_2 = new JLabel("Movie 2");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBackground(Color.LIGHT_GRAY);
		label_2.setBounds(690, 79, 133, 174);
		panel.add(label_2);
		
		label_2.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(genres.this, "Movie 2 Clicked!");
			}
		});	
		
		JLabel label_3 = new JLabel("Movie 3");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBackground(Color.LIGHT_GRAY);
		label_3.setBounds(383, 276, 133, 174);
		panel.add(label_3);
		
		label_3.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(genres.this, "Movie 3 Clicked!");
			}
		});	
		
		JLabel label_4 = new JLabel("Movie 4");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBackground(Color.LIGHT_GRAY);
		label_4.setBounds(535, 276, 133, 174);
		panel.add(label_4);
		
		label_4.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(genres.this, "Movie 4 Clicked!");
			}
		});	
		
		JLabel label_5 = new JLabel("Movie 5");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBackground(Color.LIGHT_GRAY);
		label_5.setBounds(690, 276, 133, 174);
		panel.add(label_5);
		
		label_5.addMouseListener((MouseListener) new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(genres.this, "Movie 5 Clicked!");
			}
		});	
		
	}
}
