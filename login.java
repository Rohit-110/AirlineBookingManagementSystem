import javax.swing.*;
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
        f.setForeground(Color.WHITE);
        JLabel l = new JLabel("Last Name");
        l.setForeground(Color.WHITE);
        JLabel phoneLabel = new JLabel("Phone Number"); // Added label for phone number
        phoneLabel.setForeground(Color.WHITE);
        JLabel emailLabel = new JLabel("Email"); // Added label for email
        emailLabel.setForeground(Color.WHITE);

        pass = new JPasswordField();

        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.WHITE);

        JButton b = new JButton("Login");
        b.setForeground(Color.BLUE);
        b.addActionListener(this);
        b.setBackground(new Color(114,212,232));

        Container pane = getContentPane();
        pane.setBackground(new Color(60,52,76));
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
