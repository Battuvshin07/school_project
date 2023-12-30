package Pages;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;

public class adminBoardAdd extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtDescriptionField;
    private JTextField txtRating;
    private JTextField txttitle;
    private JTextField txtcast;
    private JTextField txtcast_1;
    private JTextField txtcast_2;
    private JTextField txtcast_3;
    private JTextField txtmovieCost;
    private JTextField txtID;
	protected JComboBox<String> comboBoxlanguage;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    adminBoardAdd frame = new adminBoardAdd();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public adminBoardAdd() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 763, 514);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.LIGHT_GRAY);
        basePanel.setBounds(0, 0, 816, 484);
        contentPane.add(basePanel);
        basePanel.setLayout(null);

        txtDescriptionField = new JTextField();
        txtDescriptionField.setHorizontalAlignment(SwingConstants.LEFT);
        txtDescriptionField.setBounds(45, 263, 264, 188);
        basePanel.add(txtDescriptionField);
        txtDescriptionField.setColumns(10);

        JTextArea txtrDescription = new JTextArea();
        txtrDescription.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrDescription.setBackground(Color.LIGHT_GRAY);
        txtrDescription.setForeground(Color.BLACK);
        txtrDescription.setText("Description :");
        txtrDescription.setBounds(56, 230, 165, 22);
        txtrDescription.setEditable(false);  // Set to non-editable
        basePanel.add(txtrDescription);

        JTextArea txtrRating = new JTextArea();
        txtrRating.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrRating.setText("Rating :");
        txtrRating.setBackground(Color.LIGHT_GRAY);
        txtrRating.setBounds(45, 82, 80, 22);
        txtrRating.setEditable(false);  // Set to non-editable
        basePanel.add(txtrRating);

        txtRating = new JTextField();
        txtRating.setBounds(135, 85, 86, 22);
        basePanel.add(txtRating);
        txtRating.setColumns(10);

        JComboBox<String> comboBoxgenre1 = new JComboBox<String>();
        comboBoxgenre1.setBounds(45, 144, 165, 22);
        comboBoxgenre1.setEditable(false);  // Set to non-editable
        basePanel.add(comboBoxgenre1);

        JComboBox<String> comboBoxgenre2 = new JComboBox<String>();
        comboBoxgenre2.setBounds(445, 177, 165, 22);
        comboBoxgenre2.setEditable(false);  // Set to non-editable
        basePanel.add(comboBoxgenre2);

        JComboBox<String> comboBoxgenre3 = new JComboBox<String>();
        comboBoxgenre3.setBounds(45, 177, 165, 22);
        comboBoxgenre3.setEditable(false);  // Set to non-editable
        basePanel.add(comboBoxgenre3);
        
        txttitle = new JTextField();
        txttitle.setBounds(135, 54, 86, 20);
        basePanel.add(txttitle);
        txttitle.setColumns(10);
        
        JTextArea txtrName = new JTextArea();
        txtrName.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrName.setText("Name :");
        txtrName.setEditable(false);
        txtrName.setBackground(Color.LIGHT_GRAY);
        txtrName.setBounds(45, 50, 69, 22);
        basePanel.add(txtrName);
        
        JTextArea txtrGenre = new JTextArea();
        txtrGenre.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrGenre.setText("Genre :");
        txtrGenre.setEditable(false);
        txtrGenre.setBackground(Color.LIGHT_GRAY);
        txtrGenre.setBounds(45, 111, 69, 22);
        basePanel.add(txtrGenre);
        
        JTextArea txtrImage = new JTextArea();
        txtrImage.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrImage.setText("Image :");
        txtrImage.setEditable(false);
        txtrImage.setBackground(Color.LIGHT_GRAY);
        txtrImage.setBounds(356, 207, 69, 22);
        basePanel.add(txtrImage);
        
        JTextArea txtrMovie = new JTextArea();
        txtrMovie.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrMovie.setText("Movie Cost :");
        txtrMovie.setEditable(false);
        txtrMovie.setBackground(Color.LIGHT_GRAY);
        txtrMovie.setBounds(311, 144, 114, 22);
        basePanel.add(txtrMovie);
        
        txtcast = new JTextField();
        txtcast.setColumns(10);
        txtcast.setBounds(435, 21, 236, 20);
        basePanel.add(txtcast);
        
        txtcast_1 = new JTextField();
        txtcast_1.setColumns(10);
        txtcast_1.setBounds(435, 54, 236, 20);
        basePanel.add(txtcast_1);
        
        JButton btnuploadButton = new JButton("Upload");    
        btnuploadButton.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent e) {
                String Stitle = txttitle.getText();
                String Srating = txtRating.getText();
                String Smovieid = txtID.getText();
                String Sdescription = txtDescriptionField.getText();
                String Scast = txtcast.getText();
                String Smoviecost = txtmovieCost.getText();
                String Sgenre = (String) comboBoxgenre1.getSelectedItem();
                String Slanguage = (String) comboBoxgenre2.getSelectedItem();

                if (Smovieid.isEmpty() || Stitle.isEmpty() || Srating.isEmpty() || Sdescription.isEmpty() || Scast.isEmpty() || Smoviecost.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                } else {
                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_rental", "root", "PHW#84#jeor");

                        String query = "INSERT INTO movie(movie_id, title, rating, description, cast, cost, genre, language) VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.setString(1, Smovieid);
                        pst.setString(2, Stitle);
                        pst.setString(3, Srating);
                        pst.setString(4, Sdescription);
                        pst.setString(5, Scast);
                        pst.setString(6, Smoviecost);
                        pst.setString(7, Sgenre);
                        pst.setString(8, Slanguage);

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Upload Successfully.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error.");
                        }
                        con.close();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        btnuploadButton.setBounds(561, 425, 114, 29);
        basePanel.add(btnuploadButton);
        JTextArea txtrCast = new JTextArea();
        txtrCast.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrCast.setText("Cast :");
        txtrCast.setEditable(false);
        txtrCast.setBackground(Color.LIGHT_GRAY);
        txtrCast.setBounds(356, 17, 69, 22);
        basePanel.add(txtrCast);
        
        txtcast_2 = new JTextField();
        txtcast_2.setColumns(10);
        txtcast_2.setBounds(435, 86, 236, 20);
        basePanel.add(txtcast_2);
        
        txtcast_3 = new JTextField();
        txtcast_3.setColumns(10);
        txtcast_3.setBounds(435, 115, 236, 20);
        basePanel.add(txtcast_3);
        
        txtmovieCost = new JTextField();
        txtmovieCost.setColumns(10);
        txtmovieCost.setBounds(435, 145, 236, 20);
        basePanel.add(txtmovieCost);
        
        JTextArea txtrLanguage = new JTextArea();
        txtrLanguage.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrLanguage.setText("Language :");
        txtrLanguage.setEditable(false);
        txtrLanguage.setBackground(Color.LIGHT_GRAY);
        txtrLanguage.setBounds(330, 174, 95, 22);
        basePanel.add(txtrLanguage);
        
        JTextArea txtrId = new JTextArea();
        txtrId.setText("ID :");
        txtrId.setFont(new Font("Monospaced", Font.PLAIN, 15));
        txtrId.setEditable(false);
        txtrId.setBackground(Color.LIGHT_GRAY);
        txtrId.setBounds(45, 17, 69, 22);
        basePanel.add(txtrId);
        
        txtID = new JTextField();
        txtID.setColumns(10);
        txtID.setBounds(135, 21, 86, 20);
        basePanel.add(txtID);

        String[] genres = {"Action", "Adventure", "Animation", "Comedy", "Crime", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Science Fiction", "Thriller", "War", "Western", "Documentary", "Family", "Musical", "Biography", "History", "Sport"};
        
        for (String genre : genres) {
            comboBoxgenre1.addItem(genre);
        }
        
        String[] languages = {"MONGOLIA", "ENGLISH", "JAPAN"};
        
        for (String language : languages) {
            comboBoxgenre1.addItem(language);
        }
    }
}

