package Pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wallet extends JFrame {
    private double balance = 0.0;
    private JLabel balanceLabel;

    public Wallet(show_board parent) {
        setTitle("Simple Online Wallet");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        balanceLabel = new JLabel("Balance: ₮" + balance);
        JButton depositButton = new JButton("Deposit");
        JButton cancelButton = new JButton("Cancel"); // Added Cancel button

        // Add action listeners
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposit();
                parent.updateBalanceLabel(balance); // Update balance label in show_board
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeWallet();
            }
        });

        // Create layout
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(balanceLabel);
        panel.add(depositButton);
        panel.add(cancelButton); // Added Cancel button

        // Add panel to frame
        add(panel, BorderLayout.CENTER);
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
        updateBalanceLabel();
    }

    private void deposit() {
        String input = JOptionPane.showInputDialog(this, "Enter deposit amount:");
        try {
            double amount = Double.parseDouble(input);
            balance += amount;
            updateBalanceLabel();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }

    // Method to close the wallet
    private void closeWallet() {
        this.dispose(); // Close the wallet window
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Balance: ₮" + balance);
    }
}