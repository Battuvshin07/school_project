package Pages;

import java.awt.EventQueue;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class upload_image extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel label;
    private String selectedImagePath;
    private JTextField txtName;
    private JTextField txtPrice;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                upload_image frame = new upload_image();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public upload_image() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 762, 534);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnuploadPicture = new JButton("Upload");
        btnuploadPicture.setBounds(119, 367, 85, 21);
        contentPane.add(btnuploadPicture);

        JButton insert = new JButton("Insert");
        insert.setBounds(226, 367, 85, 21);
        contentPane.add(insert);

        label = new JLabel("");
        label.setBounds(74, 113, 170, 222);
        contentPane.add(label);

        txtName = new JTextField();
        txtName.setBounds(350, 159, 96, 19);
        contentPane.add(txtName);
        txtName.setColumns(10);

        txtPrice = new JTextField();
        txtPrice.setBounds(350, 202, 96, 19);
        contentPane.add(txtPrice);
        txtPrice.setColumns(10);

        JLabel lblNewLabel = new JLabel("Name :");
        lblNewLabel.setBounds(286, 162, 45, 13);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Price :");
        lblNewLabel_1.setBounds(286, 205, 45, 13);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("movie id :");
        lblNewLabel_2.setBounds(273, 243, 58, 13);
        contentPane.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(350, 240, 96, 19);
        contentPane.add(textField);

        btnuploadPicture.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                selectedImagePath = selectedFile.getAbsolutePath();
                displayImage(selectedImagePath);
            }
        });

        insert.addActionListener(e -> {
            if (label.getIcon() != null) {
                File selectedFile = new File(selectedImagePath);
                if (selectedFile.exists()) {
                    // Use the values from text fields
                    String movieName = txtName.getText();
                    int moviePrice = 0;
                    int movieId = 0;

                    try {
                        moviePrice = Integer.parseInt(txtPrice.getText());
                        movieId = Integer.parseInt(textField.getText());
                    } catch (NumberFormatException ex) {
                        // Handle invalid input for price or movie id
                        ex.printStackTrace();
                        return;
                    }

                    boolean isSuccess = insertDataIntoDatabase(movieId, movieName, moviePrice, selectedImagePath);
                    if (isSuccess) {
                        JOptionPane.showMessageDialog(this, "Image successfully inserted into the database!");
                    }
                }
            }
        });
    }

    private void displayImage(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        label.setIcon(icon);
    }

    private boolean insertDataIntoDatabase(int id, String movieName, int moviePrice, String imagePath) {
        try {
            // Establish database connection
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "Anar208072!@#$")) {

                // Prepare SQL statement for data insertion
                String sql = "INSERT INTO movie_info (movie_id, movie_name, movie_price, movie_picture) VALUES (?, ?, ?, ?)";
                try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

                    // Set parameters for the SQL statement
                    pstmt.setInt(1, id);
                    pstmt.setString(2, movieName);
                    pstmt.setInt(3, moviePrice);

                    byte[] imageData = Files.readAllBytes(Paths.get(imagePath));
                    pstmt.setBytes(4, imageData);

                    // Execute the statement
                    pstmt.executeUpdate();
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}