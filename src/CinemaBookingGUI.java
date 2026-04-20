/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author doaaa
 */
public class CinemaBookingGUI extends JFrame {
    private JTextField nameField;
    private JComboBox<String> movieCombo;
    private JTextField ticketsField;
    private JButton bookButton;
    private JTextArea resultArea;

    public CinemaBookingGUI() {
           setTitle("Cinema Booking App");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

       
        setLayout(new BorderLayout(10, 10));

       
        JLabel title = new JLabel(" Cinema Booking System", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(50, 50, 150));
        add(title, BorderLayout.NORTH);

       
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

   
        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

      
        formPanel.add(new JLabel("Movie:"));
        String[] movies = {"Action - Fast & Furious", "Comedy - The Mask"};
        movieCombo = new JComboBox<>(movies);
        formPanel.add(movieCombo);

        
        formPanel.add(new JLabel("Tickets:"));
        ticketsField = new JTextField();
        formPanel.add(ticketsField);

       
        bookButton = new JButton("Book Ticket");
        bookButton.setBackground(new Color(70, 130, 180));
        bookButton.setForeground(Color.WHITE);
        bookButton.setFocusPainted(false);
        formPanel.add(new JLabel(""));
        formPanel.add(bookButton);

        add(formPanel, BorderLayout.CENTER);

       
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        resultArea.setBorder(BorderFactory.createTitledBorder("Booking Result"));
        add(new JScrollPane(resultArea), BorderLayout.SOUTH);

       
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (name.isEmpty() || ticketsField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int tickets;
                try {
                    tickets = Integer.parseInt(ticketsField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Tickets must be a number!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                User user = new User(name);
                Cinema cinema = new Cinema("Grand Cinema", "Cairo");

                Movie selectedMovie;
                if (movieCombo.getSelectedIndex() == 0) {
                    selectedMovie = new ActionMovie("Fast & Furious", 50.0);
                } else {
                    selectedMovie = new ComedyMovie("The Mask", 40.0);
                }

                Booking booking = new Booking(user, selectedMovie, cinema, tickets);
                resultArea.setText(booking.getBookingDetails());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CinemaBookingGUI().setVisible(true));
    }
}
    
    
    

