import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class bookingPage extends JFrame {

    ArrayList<tickets> ticketlist = new ArrayList<tickets>();

    JLabel identityNo = new JLabel("Identity Number");
    JTextField ino = new JTextField();
    JLabel name = new JLabel("Name");
    JTextField namefield = new JTextField();
    JLabel to = new JLabel("To:");
    JTextField tofeild = new JTextField();
    JLabel from = new JLabel("From");
    JTextField fromfield = new JTextField();
    JButton search = new JButton("Search flights");
    Container pane = getContentPane();
    JButton book = new JButton("Book");

    bookingPage(String title) {
        super(title);
        pane.setBackground(Color.CYAN);
        pane.setLayout(new GridLayout(5, 2));
        pane.add(identityNo);
        pane.add(ino);
        pane.add(name);
        pane.add(namefield);
        pane.add(to);
        pane.add(tofeild);
        pane.add(from);
        pane.add(fromfield);
        pane.add(search, BorderLayout.CENTER);
        pane.add(book);
        setMinimumSize(new Dimension(500, 600));
        setSize(500, 600);
        listener l = new listener();
        book.addActionListener(l);
        search.addActionListener(l);
        setVisible(true);
    }

    class listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == book) {
                if (ino.getText().length() != 0 && namefield.getText().length() != 0 && tofeild.getText().length() != 0
                        && fromfield.getText().length() != 0) {
                            
                SwingUtilities.invokeLater(() -> new MakePaymentPage());
                    
                } else {
                    JOptionPane.showMessageDialog(null, "All fields are mandatory!", "Airlines", 1);
                }
            } else if (event.getSource() == search) {
                new searchFlight();
            }
        }
    }

    private void openFile(String filename) {
        try {
            File file = new File(filename);
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new bookingPage("Book Flights");
    }
}
