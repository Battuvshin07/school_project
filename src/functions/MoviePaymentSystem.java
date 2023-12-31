package functions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoviePaymentSystem extends JFrame {
    private JComboBox<String> movieComboBox;
    private JTextField ticketsTextField;
    private JTextField balanceTextField;
    private JButton calculateButton;

    private double userBalance;

    public MoviePaymentSystem() {
        setTitle("Movie Payment System");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] movieOptions = {"Movie A", "Movie B", "Movie C"};
        movieComboBox = new JComboBox<>(movieOptions);
        ticketsTextField = new JTextField(10);
        balanceTextField = new JTextField(10);
        calculateButton = new JButton("Calculate");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePayment();	
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Select Movie:"));
        panel.add(movieComboBox);
        panel.add(new JLabel("Number of Tickets:"));
        panel.add(ticketsTextField);
        panel.add(new JLabel("Account Balance:"));
        panel.add(balanceTextField);
        panel.add(calculateButton);

        add(panel);

        try {
            String balanceInput = JOptionPane.showInputDialog("Enter your initial account balance:");
            userBalance = Double.parseDouble(balanceInput);
            balanceTextField.setText(String.valueOf(userBalance));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid balance.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        setVisible(true);
    }

    private void calculatePayment() {
        String selectedMovie = (String) movieComboBox.getSelectedItem();
        int numberOfTickets = 0;

        try {
            numberOfTickets = Integer.parseInt(ticketsTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number of tickets.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double moviePrice = getMoviePrice(selectedMovie);
        double totalPayment = numberOfTickets * moviePrice;

        if (totalPayment > userBalance) {
            JOptionPane.showMessageDialog(this, "Insufficient funds. Please add more balance.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            userBalance -= totalPayment;
            balanceTextField.setText(String.valueOf(userBalance));
            JOptionPane.showMessageDialog(this, "Payment successful!\nRemaining Balance: ₮" + userBalance, "Payment Summary", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private double getMoviePrice(String movie) {
        switch (movie) {
            case "Movie A":
                return 10000;
            case "Movie B":
                return 12000;
            case "Movie C":
                return 8000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MoviePaymentSystem());
    }
}
