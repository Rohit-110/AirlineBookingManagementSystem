import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class customer extends JFrame {

    JButton book = new JButton("Book Airline");
    JButton showBooking = new JButton("Show Bookings");
    Container pane = getContentPane();

    public customer(String title) {
        super(title);
        pane.setBackground(Color.CYAN);
        pane.setLayout(new GridLayout(2, 1));
        pane.add(book, BorderLayout.CENTER);
        pane.add(showBooking, BorderLayout.CENTER);
        book.setForeground((Color.BLUE));
        showBooking.setForeground((Color.BLUE));
        book.setBackground(new Color(114,212,232));
        showBooking.setBackground(new Color(114,212,232));
        Listener l = new Listener();
        book.addActionListener(l);
        showBooking.addActionListener(l);
        setMinimumSize(new Dimension(500, 600));
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ensure that the GUI components are created and modified on the EDT
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
        });
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == book) {
                new bookingPage("Book Flights");
                setVisible(false);
            } else if (evt.getSource() == showBooking) {
                new showPassDetails();
            }
        }
    }

    public static void main(String[] args) {
        new customer("Customer Page");
    }
}
