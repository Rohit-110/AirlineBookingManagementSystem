import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginSignupExample extends JFrame implements ActionListener {

    private JButton loginButton, signupButton;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginSignupExample() {
        setTitle("Login or Signup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));
        setSize(300, 150);

        // Username Field
        usernameField = new JTextField();
        add(new JLabel("Username:"));
        add(usernameField);

        // Password Field
        passwordField = new JPasswordField();
        add(new JLabel("Password:"));
        add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        // Signup Button
        signupButton = new JButton("Signup");
        signupButton.addActionListener(this);
        add(signupButton);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            char[] passwordChars = passwordField.getPassword();
            String password = new String(passwordChars);

            // Perform login logic here (dummy example)
            JOptionPane.showMessageDialog(this, "Login successful!\nUsername: " + username + "\nPassword: " + password);
        } else if (e.getSource() == signupButton) {
            // Perform signup logic here (dummy example)
            JOptionPane.showMessageDialog(this, "Signup successful!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginSignupExample();
        });
    }
}
