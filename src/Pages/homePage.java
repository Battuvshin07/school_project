package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;


public class homePage extends JFrame {

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
					homePage frame = new homePage();
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
	public homePage() {
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
		
		JLabel panel_0 = new JLabel("Movie 0");
        panel_0.setBackground(Color.LIGHT_GRAY);
        panel_0.setBounds(39, 75, 133, 174);
        contentPane.add(panel_0);
        panel_0.setOpaque(true);
        panel_0.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel_0.addMouseListener((MouseListener) new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(homePage.this, "Panel 0 Clicked!");
            }
        });
		
        JLabel panel_1 = new JLabel("Movie 1");
        panel_1.setBackground(Color.LIGHT_GRAY);
        panel_1.setBounds(213, 75, 133, 174);
        contentPane.add(panel_1);
        panel_1.setOpaque(true);
        panel_1.setHorizontalAlignment(SwingConstants.CENTER);

        panel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	
                JOptionPane.showMessageDialog(homePage.this, "Panel 1 Clicked!");
            }
        });
        
        JLabel panel_2 = new JLabel("Movie 2");
        panel_2.setBackground(Color.LIGHT_GRAY);
        panel_2.setBounds(392, 75, 133, 174);
        contentPane.add(panel_2);
        panel_2.setOpaque(true);
        panel_2.setHorizontalAlignment(SwingConstants.CENTER);

        panel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	
                JOptionPane.showMessageDialog(homePage.this, "Panel 2 Clicked!");
            }
        });
		
        JLabel panel_3 = new JLabel("Movie 3");
        panel_3.setBackground(Color.LIGHT_GRAY);
        panel_3.setBounds(564, 75, 133, 174);
        contentPane.add(panel_3);
        panel_3.setOpaque(true);
        panel_3.setHorizontalAlignment(SwingConstants.CENTER);

        panel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(homePage.this, "Panel 3 Clicked!");
            }
        });
		
        JLabel panel_4 = new JLabel("Movie 4");
        panel_4.setBackground(Color.LIGHT_GRAY);
        panel_4.setBounds(743, 75, 133, 174);
        contentPane.add(panel_4);
        panel_4.setOpaque(true);
        panel_4.setHorizontalAlignment(SwingConstants.CENTER);

        panel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(homePage.this, "Panel 4 Clicked!");
            }
        });
		
		JLabel panel_5 = new JLabel("Movie 5");
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(39, 267, 133, 174);
		contentPane.add(panel_5);
		panel_5.setOpaque(true);
        panel_5.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(homePage.this, "Panel 5 Clicked!");
            }
        });
		
		JLabel panel_6 = new JLabel("Movie 6");
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(213, 267, 133, 174);
		contentPane.add(panel_6);
		panel_6.setOpaque(true);
		panel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(homePage.this, "Panel 6 Clicked!");
            }
        });
		
		JLabel panel_7 = new JLabel("Movie 7");
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(392, 267, 133, 174);
		contentPane.add(panel_7);
		panel_7.setOpaque(true);
		panel_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JOptionPane.showMessageDialog(homePage.this, "Panel 7 Clicked!");
            }
        });
		
		JLabel panel_8 = new JLabel("Movie 8");
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(564, 267, 133, 174);
		contentPane.add(panel_8);
		panel_8.setOpaque(true);
		panel_8.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JOptionPane.showMessageDialog(homePage.this, "Panel 8 Clicked!");
            }
        });
		
		JLabel panel_9 = new JLabel("Movie 9");
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(743, 267, 133, 174);
		contentPane.add(panel_9);
		panel_9.setOpaque(true);
		panel_9.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                JOptionPane.showMessageDialog(homePage.this, "Panel 9 Clicked!");
            }
        });
		
		JButton UP = new JButton("UP");
		UP.setBounds(759, 453, 117, 29);
		contentPane.add(UP);
		
		JButton DOWN = new JButton("DOWN");
		DOWN.setBounds(759, 494, 117, 29);
		contentPane.add(DOWN);
	}
}
