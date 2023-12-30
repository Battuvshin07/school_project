package Pages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FinancialAccountApp extends JFrame {

    private static final String DB_URL = "jdbc:mysql://your_mysql_server:3306/swing_demo";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    private JLabel nameLabel, balanceLabel;
    private JTextField nameField, balanceField;
    private JButton viewButton, updateButton;

    public FinancialAccountApp() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Financial Account Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(496, 298);

        nameLabel = new JLabel("Account Name:");
        balanceLabel = new JLabel("Balance:");

        nameField = new JTextField(20);
        balanceField = new JTextField(10);

        viewButton = new JButton("View Balance");
        updateButton = new JButton("Update Balance");

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewBalance();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateBalance();
            }
        });

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(balanceLabel);
        panel.add(balanceField);
        panel.add(viewButton);
        panel.add(updateButton);

        getContentPane().add(panel);
    }

    private void viewBalance() {
        String accountName = nameField.getText();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT balance FROM financial_accounts WHERE account_name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, accountName);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        double balance = resultSet.getDouble("balance");
                        balanceField.setText(String.valueOf(balance));
                    } else {
                        JOptionPane.showMessageDialog(this, "Account not found");
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error accessing database");
        }
    }

    private void updateBalance() {
        String accountName = nameField.getText();
        double newBalance;
        try {
            newBalance = Double.parseDouble(balanceField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid balance value");
            return;
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "UPDATE financial_accounts SET balance = ? WHERE account_name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDouble(1, newBalance);
                preparedStatement.setString(2, accountName);
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Balance updated successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating balance");
        }
    }

    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
            new FinancialAccountApp().setVisible(true);
        };
    }
