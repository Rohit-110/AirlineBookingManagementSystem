import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;



import java.awt.event.*;


public class searchFlight extends JFrame{
    // JFrame mainPanel=new JFrame();
    JLabel ino1=new JLabel("Identity Number");
    JTextField tino1=new JTextField();
    JLabel ino2=new JLabel("From");
    JTextField tino2=new JTextField();
    JLabel ino3=new JLabel("To");
    JTextField tino3=new JTextField();
    JLabel ino4=new JLabel("Arrival Time");
    JTextField tino4=new JTextField();
    JLabel ino5=new JLabel("Departure Time");
    JTextField tino5=new JTextField();
    JLabel ino6=new JLabel("Flight Name");
    JTextField tino6=new JTextField();
    JLabel ino7=new JLabel("Seats Available");
    JTextField tino7=new JTextField();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JButton search=new JButton("Search");
    
    Container pane=getContentPane();
     searchFlight()
     {
        pane.setLayout(new GridLayout(7,1));
        p1.setLayout(new GridLayout(7,1));
        pane.add(p1);
        pane.add(p2);
        p1.add(ino1);
        p1.add(tino1);
        p1.add(ino2);
        p1.add(tino2);
        p1.add(ino3);
        p1.add(tino3);
        p1.add(ino4);
        p1.add(tino4);
        p1.add(ino5);
        p1.add(tino5);
        p1.add(ino6);
        p1.add(tino6);
        p1.add(ino7);
        p1.add(tino7);
        p2.add(search);
        listener l=new listener();
        search.addActionListener(l);
        
       Border newone = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        ((JComponent) pane).setBorder(newone);
        setTitle("Flight Details");
        setSize(500,300);
        setMinimumSize(new Dimension(500,600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
     }
     class listener implements ActionListener{
        public void actionPerformed(ActionEvent evt) {
            // String id=tino.getText();
            if(tino1.getText().length()==0) {
                JOptionPane.showMessageDialog(null, "Enter the Identity Number!", "Airlines", 1);  
            }
           
            else
            {
                 new tickets();
               //JOptionPane.showMessageDialog(null, "No Flights Booked for entered Identity Number", "Airlines", 1);  
                // setVisible(false);
            }
           
        }

     }
     public static void main(String[] args)
    {
        new searchFlight();
    }
    

    
}
/*
 * import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener {
    String firstName;
    String lastName;
    JTextField fn, ln, phoneNumber, email;
    JPasswordField pass;

    Login(String a, String b) {
        this.firstName = a;
        this.lastName = b;
        setUp();
        setVisible(true);
    }

    void setUp() {
        setMinimumSize(new Dimension(500, 600));

        fn = new JTextField();
        ln = new JTextField();
        phoneNumber = new JTextField(); // Added phone number field
        email = new JTextField(); // Added email field

        JLabel f = new JLabel("First Name");
        JLabel l = new JLabel("Last Name");
        JLabel phoneLabel = new JLabel("Phone Number"); // Added label for phone number
        JLabel emailLabel = new JLabel("Email"); // Added label for email

        pass = new JPasswordField();

        JLabel passLabel = new JLabel("Password");

        JButton b = new JButton("Login");
        b.addActionListener(this);

        Container pane = getContentPane();

        setTitle("Login");
        pane.setLayout(new GridBagLayout()); // Used GridBagLayout for centering
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Added insets for spacing

        // First column
        gbc.gridx = 0;
        gbc.gridy = 0;
        pane.add(f, gbc);

        gbc.gridy = 1;
        pane.add(l, gbc);

        gbc.gridy = 2;
        pane.add(phoneLabel, gbc);

        gbc.gridy = 3;
        pane.add(emailLabel, gbc);

        gbc.gridy = 4;
        pane.add(passLabel, gbc);

        // Second column
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0; // Allow components to expand horizontally
        gbc.fill = GridBagConstraints.HORIZONTAL;

        pane.add(fn, gbc);

        gbc.gridy = 1;
        pane.add(ln, gbc);

        gbc.gridy = 2;
        pane.add(phoneNumber, gbc);

        gbc.gridy = 3;
        pane.add(email, gbc);

        gbc.gridy = 4;
        pane.add(pass, gbc);

        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER; // Align the button to the center
        pane.add(b, gbc);
        b.setPreferredSize(new Dimension(80, 20)); // Set the size of the "Login" button
    }

    public void actionPerformed(ActionEvent e) {
        char[] a = pass.getPassword();
        String s = String.valueOf(a);

        System.out.println(s);

        if (s.equals("OOM")) {
            new customer("OOM");
            setVisible(false);
        } else if (s.equals("Admin")) {
            new admin();
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Password");
            fn.setText("");
            ln.setText("");
            phoneNumber.setText(""); // Clear phone number field
            email.setText(""); // Clear email field
            pass.setText("");
        }
    }

    public static void main(String[] args) {
        if (!GraphicsEnvironment.isHeadless()) {
            new Login("First Name", "Last Name");
        }
    }
}

 */