package Pages;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class show_board extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel label;
    private JLabel priceLabel; // Changed from JTextField to JLabel
    private JButton btnNewButton;
    private JButton withdrawButton; // Changed from pay button to withdraw button
    private JButton watchButton; // New button for watching
    private JLabel lblNewLabel_1;

    private Wallet wallet; // Added Wallet instance
    private double currentBalance; // Added variable to store current balance
    private double previousBalance; // Added variable to store previous balance

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                int movie_id = 1;
                show_board frame = new show_board(movie_id, null);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public show_board(int movieId, byte[] Data1) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 762, 553);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        label = new JLabel("");
        label.setBounds(74, 113, 170, 222);
        contentPane.add(label);
        ImageIcon imageIcon = new ImageIcon(Data1);
        label.setIcon(imageIcon);

        // Changed from JTextField to JLabel
        priceLabel = new JLabel("3 day Price: ");
        priceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        priceLabel.setBounds(74, 369, 150, 19);
        contentPane.add(priceLabel);

        JButton backButton = new JButton("Back to Genres");
        backButton.addActionListener(e -> {
            goBackToGenresTable();
        });
        backButton.setBounds(20, 480, 150, 30);
        contentPane.add(backButton);

        btnNewButton = new JButton("deposit");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openWallet();
            }
        });
        btnNewButton.setBounds(553, 224, 110, 39);
        contentPane.add(btnNewButton);

        withdrawButton = new JButton("withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Deduct 3 days price from the wallet
                withdrawFromWallet();
            }
        });
        withdrawButton.setBounds(578, 411, 85, 21);
        contentPane.add(withdrawButton);

        watchButton = new JButton("Watch");
        watchButton.setVisible(false); // Initially set to invisible
        watchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement action for watching the movie
                watchMovie();
            }
        });
        watchButton.setBounds(578, 441, 85, 21);
        contentPane.add(watchButton);

        lblNewLabel_1 = new JLabel("Remained balance: 00.0₮");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_1.setBounds(369, 129, 294, 52);
        contentPane.add(lblNewLabel_1);

        // Initialize wallet
        wallet = new Wallet(this);

        // Initialize the current and previous balance
        currentBalance = 0.0;
        previousBalance = 0.0;

        // Call a method to load and display the image from the database based on movie_id
        displayImageAndPriceFromDatabase(movieId);
    }

    private void displayImageAndPriceFromDatabase(int movieId) {
        try {
            Connection con1;
            PreparedStatement pst1;
            ResultSet rs1;

            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "Anar208072!@#$");
            pst1 = con1.prepareStatement("SELECT movie_picture, movie_price FROM movie_info WHERE movie_id = ?");
            pst1.setInt(1, movieId);
            rs1 = pst1.executeQuery();

            if (rs1.next()) {
                byte[] imageData = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(imageData);
                label.setIcon(imageIcon);

                // Set the price to the priceLabel
                int moviePrice = rs1.getInt("movie_price");
                priceLabel.setText("3 day Price: ₮" + moviePrice);

                // Initialize the current balance
                currentBalance = 0.0;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void goBackToGenresTable() {
        genres genresTable = new genres();
        genresTable.setVisible(true);
        dispose();  // Close the current frame (show_board)
    }

    private void openWallet() {
        wallet.setVisible(true);
    }

    // Method to update balance label from Wallet
    public void updateBalanceLabel(double balance) {
        lblNewLabel_1.setText("Remained balance: ₮" + balance);

        // Compare the current balance with the previous balance
        if (currentBalance < previousBalance) {
            watchButton.setVisible(true);
        } else {
            watchButton.setVisible(false);
        }

        // Update the previous balance variable
        previousBalance = currentBalance;

        // Update the current balance variable
        currentBalance = balance;
    }

    // Method to withdraw from the wallet
    private void withdrawFromWallet() {
        // Deduct 3 days price from the wallet balance
        double moviePrice = Double.parseDouble(priceLabel.getText().substring(14));

        if (currentBalance >= moviePrice) {
            double newBalance = currentBalance - moviePrice;
            wallet.setBalance(newBalance);
            updateBalanceLabel(newBalance);

            // Payment successful, show the watch button
            watchButton.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient funds to withdraw.");
        }
    }

    // Method to handle watching the movie
    private void watchMovie() {
        // Implement action for watching the movie
        JOptionPane.showMessageDialog(this, "Enjoy watching the movie!");
    }
}
