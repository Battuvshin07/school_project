package Pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminRoom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminRoom frame = new adminRoom();
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
	public adminRoom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(6, 6, 609, 364);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton uploadButton = new JButton("Upload movie");
		uploadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminBoardAdd abd = new adminBoardAdd();
				abd.show();
				dispose();
				
			}
		});
		uploadButton.setBounds(26, 29, 117, 29);
		panel.add(uploadButton);
		
		JButton editMovie = new JButton("EDIT");
		editMovie.setBounds(26, 70, 117, 29);
		panel.add(editMovie);
		
		JButton asuserButton = new JButton("AS USER");
		asuserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dashBoard db = new dashBoard();
				db.show();
				dispose();
				
			}
		});
		asuserButton.setBounds(26, 111, 117, 29);
		panel.add(asuserButton);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.setBounds(26, 152, 117, 29);
		panel.add(deleteButton);
	}

}
