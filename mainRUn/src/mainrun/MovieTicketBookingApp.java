/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainrun;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author TECHNICAL
 */
class MovieTicketBookingApp extends JFrame {
    private JComboBox<String> movieDropdown;
    private JComboBox<String> theaterDropdown;
    private JTextField seatField;
    private JTextArea outputArea;
    private JButton bookButton;

    public MovieTicketBookingApp() {
        setTitle("Movie Ticket Booking System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Components
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        inputPanel.add(new JLabel("Select Movie:"));
        movieDropdown = new JComboBox<>(new String[]{"Action", "Comedy", "Drama"});
        inputPanel.add(movieDropdown);

        inputPanel.add(new JLabel("Select Theater:"));
        theaterDropdown = new JComboBox<>(new String[]{"Cinema Hall", "IMAX"});
        inputPanel.add(theaterDropdown);

        inputPanel.add(new JLabel("Enter Seat Number:"));
        seatField = new JTextField();
        inputPanel.add(seatField);

        bookButton = new JButton("Book Ticket");
        inputPanel.add(bookButton);

        add(inputPanel, BorderLayout.CENTER);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Event Listener
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movie = (String) movieDropdown.getSelectedItem();
                String theater = (String) theaterDropdown.getSelectedItem();
                String seatText = seatField.getText();

                try {
                    int seatNumber = Integer.parseInt(seatText);
                    Command bookTicket = new BookTicketCommand(movie, theater, seatNumber);
                    bookTicket.execute();

                    outputArea.append("Ticket booked for " + movie + " at " + theater + " for seat " + seatNumber + "\n");
                } catch (NumberFormatException ex) {
                    outputArea.append("Invalid seat number. Please enter a valid number.\n");
                }
            }
        });
    }
}
