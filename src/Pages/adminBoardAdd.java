package Pages;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;

public class adminBoardAdd extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textDescroptionField;
    private JTextField textRating;
    private JTextField textnameField;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

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
        setBounds(100, 100, 712, 515);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel basePanel = new JPanel();
        basePanel.setBackground(Color.LIGHT_GRAY);
        basePanel.setBounds(0, 0, 816, 484);
        contentPane.add(basePanel);
        basePanel.setLayout(null);

        textDescroptionField = new JTextField();
        textDescroptionField.setHorizontalAlignment(SwingConstants.LEFT);
        textDescroptionField.setBounds(45, 263, 264, 188);
        basePanel.add(textDescroptionField);
        textDescroptionField.setColumns(10);

        JTextArea txtrDescription = new JTextArea();
        txtrDescription.setBackground(Color.LIGHT_GRAY);
        txtrDescription.setForeground(Color.BLACK);
        txtrDescription.setText("Description :");
        txtrDescription.setBounds(56, 230, 165, 22);
        txtrDescription.setEditable(false);  // Set to non-editable
        basePanel.add(txtrDescription);

        JTextArea txtrRating = new JTextArea();
        txtrRating.setText("Rating :");
        txtrRating.setBackground(Color.LIGHT_GRAY);
        txtrRating.setBounds(45, 68, 69, 22);
        txtrRating.setEditable(false);  // Set to non-editable
        basePanel.add(txtrRating);

        textRating = new JTextField();
        textRating.setBounds(135, 69, 86, 22);
        basePanel.add(textRating);
        textRating.setColumns(10);

        JComboBox<String> comboBoxgenre1 = new JComboBox<String>();
        comboBoxgenre1.setBounds(45, 131, 165, 22);
        comboBoxgenre1.setEditable(false);  // Set to non-editable
        basePanel.add(comboBoxgenre1);

        JComboBox<String> comboBoxgenre2 = new JComboBox<String>();
        comboBoxgenre2.setBounds(45, 164, 165, 22);
        comboBoxgenre2.setEditable(false);  // Set to non-editable
        basePanel.add(comboBoxgenre2);

        JComboBox<String> comboBoxgenre3 = new JComboBox<String>();
        comboBoxgenre3.setBounds(45, 197, 165, 22);
        comboBoxgenre3.setEditable(false);  // Set to non-editable
        basePanel.add(comboBoxgenre3);
        
        textnameField = new JTextField();
        textnameField.setBounds(135, 40, 86, 20);
        basePanel.add(textnameField);
        textnameField.setColumns(10);
        
        JTextArea txtrName = new JTextArea();
        txtrName.setText("Name :");
        txtrName.setEditable(false);
        txtrName.setBackground(Color.LIGHT_GRAY);
        txtrName.setBounds(45, 38, 69, 22);
        basePanel.add(txtrName);
        
        JTextArea txtrGenre = new JTextArea();
        txtrGenre.setText("Genre :");
        txtrGenre.setEditable(false);
        txtrGenre.setBackground(Color.LIGHT_GRAY);
        txtrGenre.setBounds(45, 101, 69, 22);
        basePanel.add(txtrGenre);
        
        JTextArea txtrImage = new JTextArea();
        txtrImage.setText("Image :");
        txtrImage.setEditable(false);
        txtrImage.setBackground(Color.LIGHT_GRAY);
        txtrImage.setBounds(356, 38, 69, 22);
        basePanel.add(txtrImage);
        
        JTextArea txtrMovie = new JTextArea();
        txtrMovie.setText("Movie :");
        txtrMovie.setEditable(false);
        txtrMovie.setBackground(Color.LIGHT_GRAY);
        txtrMovie.setBounds(356, 68, 69, 22);
        basePanel.add(txtrMovie);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(435, 40, 236, 20);
        basePanel.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(435, 70, 236, 20);
        basePanel.add(textField_1);
        
        JButton uploadButton = new JButton("Upload");
        uploadButton.setBounds(582, 429, 89, 23);
        basePanel.add(uploadButton);
        
        JTextArea txtrCast = new JTextArea();
        txtrCast.setText("Cast :");
        txtrCast.setEditable(false);
        txtrCast.setBackground(Color.LIGHT_GRAY);
        txtrCast.setBounds(356, 101, 69, 22);
        basePanel.add(txtrCast);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(435, 101, 236, 20);
        basePanel.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(435, 133, 236, 20);
        basePanel.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(435, 164, 236, 20);
        basePanel.add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(435, 197, 236, 20);
        basePanel.add(textField_5);
        
        JTextArea txtrLanguage = new JTextArea();
        txtrLanguage.setText("Language :");
        txtrLanguage.setEditable(false);
        txtrLanguage.setBackground(Color.LIGHT_GRAY);
        txtrLanguage.setBounds(356, 230, 69, 22);
        basePanel.add(txtrLanguage);
        
        JComboBox<String> comboBoxlanguage = new JComboBox<String>();
        comboBoxlanguage.setEditable(false);
        comboBoxlanguage.setBounds(433, 228, 165, 22);
        basePanel.add(comboBoxlanguage);

        String[] genres = {"Action", "Adventure", "Animation", "Comedy", "Crime", "Drama", "Fantasy", "Horror", "Mystery", "Romance", "Science Fiction", "Thriller", "War", "Western", "Documentary", "Family", "Musical", "Biography", "History", "Sport"};

        for (String genre : genres) {
            comboBoxgenre1.addItem(genre);
            comboBoxgenre2.addItem(genre);
            comboBoxgenre3.addItem(genre);
        }
        
        String[] language = {"Mongolia", "English", "Japan"};
        
        for (String languages : language) {
        	comboBoxlanguage.addItem(languages);
        }
    }
}
