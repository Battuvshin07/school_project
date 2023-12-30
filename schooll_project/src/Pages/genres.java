package Pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class genres extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField searchGenreField;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private byte[] Data1 = null;
    private byte[] Data2 = null;
    private byte[] Data3 = null;
    private byte[] Data4 = null;
    private byte[] Data5 = null;
    private byte[] Data6 = null;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    genres frame = new genres();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public genres() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 866, 569);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setBounds(-75, 10, 866, 541);
        contentPane.add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(6, 5, 329, 530);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JComboBox<String> comboBoxgenre1 = new JComboBox<String>();
        comboBoxgenre1.setBounds(87, 253, 165, 22);
        comboBoxgenre1.setEditable(false);
        panel_1.add(comboBoxgenre1);

        JComboBox<String> comboBoxgenre2 = new JComboBox<String>();
        comboBoxgenre2.setBounds(87, 286, 165, 22);
        comboBoxgenre2.setEditable(false);
        panel_1.add(comboBoxgenre2);

        JComboBox<String> comboBoxgenre3 = new JComboBox<String>();
        comboBoxgenre3.setBounds(87, 318, 165, 22);
        comboBoxgenre3.setEditable(false);
        panel_1.add(comboBoxgenre3);
        
        JComboBox<String> comboBoxgenre4 = new JComboBox<String>();
        comboBoxgenre4.setBounds(87, 318, 165, 22);
        comboBoxgenre4.setEditable(false);
        panel_1.add(comboBoxgenre4);
        
        JComboBox<String> comboBoxgenre5 = new JComboBox<String>();
        comboBoxgenre5.setBounds(87, 318, 165, 22);
        comboBoxgenre5.setEditable(false);
        panel_1.add(comboBoxgenre5);
        
        JComboBox<String> comboBoxgenre6 = new JComboBox<String>();
        comboBoxgenre6.setBounds(87, 318, 165, 22);
        comboBoxgenre6.setEditable(false);
        panel_1.add(comboBoxgenre6);

        String[] genres = {"Action", "Adventure", "Animation", "Comedy", "Crime", "Drama", "Fantasy", "Horror",
                "Mystery", "Romance", "Science Fiction", "Thriller", "War", "Western", "Documentary", "Family",
                "Musical", "Biography", "History", "Sport"};

        for (String genre : genres) {
            comboBoxgenre1.addItem(genre);
            comboBoxgenre2.addItem(genre);
            comboBoxgenre3.addItem(genre);
        }

        JButton menu = new JButton("MENU");
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dashBoard db = new dashBoard();
                db.show();
                dispose();
            }
        });
        menu.setBounds(80, 491, 117, 29);
        panel_1.add(menu);

        searchGenreField = new JTextField();
        searchGenreField.setBounds(76, 127, 198, 26);
        panel_1.add(searchGenreField);
        searchGenreField.setColumns(10);

        JTextArea txtrSearch = new JTextArea();
        txtrSearch.setBackground(Color.white);
        txtrSearch.setText("search");
        txtrSearch.setBounds(20, 132, 42, 16);
        txtrSearch.setEditable(false);
        panel_1.add(txtrSearch);

        label1 = new JLabel();
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                show_board sb = new show_board(1, Data1);
                sb.setVisible(true);
                dispose();
            }
        });
        label1.setBounds(383, 79, 134, 175);
        panel.add(label1);

        label2 = new JLabel();
        label2.setBounds(543, 79, 134, 175);
        panel.add(label2);

        label3 = new JLabel();
        label3.setBounds(701, 79, 134, 175);
        panel.add(label3);

        label4 = new JLabel();
        label4.setBounds(383, 301, 134, 175);
        panel.add(label4);

        label5 = new JLabel();
        label5.setBounds(543, 301, 134, 175);
        panel.add(label5);

        label6 = new JLabel();
        label6.setBounds(701, 301, 134, 175);
        panel.add(label6);

        // Load and set the image for the labels
        try {
            Connection con1;
            PreparedStatement pst1;
            ResultSet rs1;
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db", "root", "Anar208072!@#$");

            // For label1
            pst1 = con1.prepareStatement("Select movie_picture FROM movie_info WHERE movie_id=1");
            rs1 = pst1.executeQuery();
            if (rs1.next()) {
                Data1 = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(Data1);
                label1.setIcon(imageIcon);
                addLabelMouseListener(label1, 1);
            }

            // For label2
            pst1 = con1.prepareStatement("Select movie_picture FROM movie_info WHERE movie_id=2");
            rs1 = pst1.executeQuery();
            if (rs1.next()) {
                Data2 = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(Data2);
                label2.setIcon(imageIcon);
                addLabelMouseListener(label2, 2);
            }

            // For label3
            pst1 = con1.prepareStatement("Select movie_picture FROM movie_info WHERE movie_id=3");
            rs1 = pst1.executeQuery();
            if (rs1.next()) {
                Data3 = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(Data3);
                label3.setIcon(imageIcon);
                addLabelMouseListener(label3, 3);
            }
            
            // For label4
            pst1 = con1.prepareStatement("Select movie_picture FROM movie_info WHERE movie_id=4");
            rs1 = pst1.executeQuery();
            if (rs1.next()) {
                Data4 = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(Data4);
                label4.setIcon(imageIcon);
                addLabelMouseListener(label4, 4);
            }
            
         // For label5
            pst1 = con1.prepareStatement("Select movie_picture FROM movie_info WHERE movie_id=5");
            rs1 = pst1.executeQuery();
            if (rs1.next()) {
                Data5 = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(Data5);
                label5.setIcon(imageIcon);
                addLabelMouseListener(label5, 5);
            }
            
         // For label6
            pst1 = con1.prepareStatement("Select movie_picture FROM movie_info WHERE movie_id=6");
            rs1 = pst1.executeQuery();
            if (rs1.next()) {
                Data6 = rs1.getBytes("movie_picture");
                ImageIcon imageIcon = new ImageIcon(Data6);
                label6.setIcon(imageIcon);
                addLabelMouseListener(label6, 6);
            }
            
            // Load and set images for label4 to label6 similarly...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addLabelMouseListener(JLabel label, int movieId) {
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (movieId == 1) {
                    show_board sb = new show_board(movieId, Data1);
                    sb.setVisible(true);
                } else if (movieId == 2) {
                    show_board sb = new show_board(movieId, Data2);
                    sb.setVisible(true);
                } else if (movieId == 3) {
                    show_board sb = new show_board(movieId, Data3);
                    sb.setVisible(true);
                } else if (movieId == 4) {
                	show_board sb = new show_board(movieId, Data4);
        			sb.setVisible(true);
                }else if (movieId == 5) {
                	show_board sb = new show_board(movieId, Data5);
        			sb.setVisible(true);
                }else if (movieId == 6) {
                	show_board sb = new show_board(movieId, Data6);
        			sb.setVisible(true);
                }
            }
        });
    }
}
