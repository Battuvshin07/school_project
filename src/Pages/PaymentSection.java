package Pages;

import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaymentSection extends JFrame {

private JPanel contentPane;
private JTextField textField;

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
PaymentSection frame = new PaymentSection();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
			}
		}
	});
}

public PaymentSection() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 641, 522);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);



JPanel panel = new JPanel();

       


JLabel lblNewLabel_5 = new JLabel("khan bank");
lblNewLabel_5.setIcon(new ImageIcon(PaymentSection.class.getResource("/picture/Screenshot 2023-12-05 113950.png")));

lblNewLabel_5.setBounds(93, 127, 100, 96);
lblNewLabel_5.setBackground(Color.LIGHT_GRAY);
contentPane.add(lblNewLabel_5);

JLabel lblNewLabel_6 = new JLabel("state bank");
lblNewLabel_6.setIcon(new ImageIcon(PaymentSection.class.getResource("/picture/Screenshot 2023-12-05 120006.png")));

lblNewLabel_6.setBounds(261, 127, 100, 96);
lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
contentPane.add(lblNewLabel_6);

JLabel lblNewLabel_7 = new JLabel("Khas Bank");
lblNewLabel_7.setIcon(new ImageIcon(PaymentSection.class.getResource("/picture/Screenshot 2023-12-05 120323.png")));

lblNewLabel_7.setBounds(430, 127, 91, 96);
lblNewLabel_7.setBackground(Color.LIGHT_GRAY);
contentPane.add(lblNewLabel_7);

JLabel lblNewLabel_8 = new JLabel("Trade and Development Bank");
lblNewLabel_8.setIcon(new ImageIcon(PaymentSection.class.getResource("/picture/Screenshot 2023-12-05 120506.png")));

lblNewLabel_8.setBounds(93, 286, 100, 96);
lblNewLabel_8.setBackground(Color.LIGHT_GRAY);
contentPane.add(lblNewLabel_8);

JLabel lblNewLabel_9 = new JLabel("Capitron Bank");
lblNewLabel_9.setIcon(new ImageIcon(PaymentSection.class.getResource("/picture/Screenshot 2023-12-05 120705.png")));

lblNewLabel_9.setBounds(261, 286, 100, 96);
lblNewLabel_9.setBackground(Color.LIGHT_GRAY);
contentPane.add(lblNewLabel_9);

JLabel lblNewLabel_10 = new JLabel("M Bank");
lblNewLabel_10.setIcon(new ImageIcon(PaymentSection.class.getResource("/picture/Screenshot 2023-12-05 120834.png")));

lblNewLabel_10.setBounds(430, 286, 91, 96);
lblNewLabel_10.setBackground(Color.LIGHT_GRAY);
contentPane.add(lblNewLabel_10);

JLabel lblNewLabel_12 = new JLabel("RECHARGE AMOUNT");
lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
lblNewLabel_12.setBounds(37, 45, 175, 25);
contentPane.add(lblNewLabel_12);

textField = new JTextField();
textField.setBounds(249, 50, 112, 20);
contentPane.add(textField);
textField.setColumns(10);

JLabel lblNewLabel = new JLabel("CHOOSE YOUR RECHARGE BANK;");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
lblNewLabel.setBounds(195, 81, 273, 35);
contentPane.add(lblNewLabel);
JButton btnNewButton = new JButton("Pay");
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnNewButton.setBounds(273, 417, 89, 23);
contentPane.add(btnNewButton);
}
}