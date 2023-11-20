import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MakePaymentPage extends JFrame implements ActionListener {
    private JComboBox<String> cardTypeComboBox;
    private JTextField cardNumberField, cvvField, expirydate, PIN, amount;
    private JButton submitButton;
    private JLabel J1,J2,J3,J4,J5,J6;

    public MakePaymentPage() {
        setTitle("Make Payment");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));
        setSize(500, 300);

        getContentPane().setBackground(new Color(60, 52, 76));
        // Card Type ComboBox
        String[] cardTypes = { "Credit Card", "Debit Card" };
        cardTypeComboBox = new JComboBox<>(cardTypes);
        J1=new JLabel("Card Type");
        J1.setForeground(Color.WHITE);
        add(J1);
        add(cardTypeComboBox);

        // Card Number Field
        cardNumberField = new JTextField();
        J2=new JLabel("Card Number");
        J2.setForeground(Color.WHITE);
        add(J2);
        add(cardNumberField);

        // PIN Field
        PIN = new JTextField();
        J3=new JLabel("Enter PIN");
        J3.setForeground(Color.WHITE);
        add(J3);
        add(PIN);

        // Expiry Date Field
        expirydate = new JTextField();
        J4=new JLabel("Expiry Date");
        J4.setForeground(Color.WHITE);
        add(J4);
        add(expirydate);

        // CVV Field
        cvvField = new JTextField();
        J5=new JLabel("CVV");
        J5.setForeground(Color.WHITE);
        add(J5);
        add(cvvField);

        // Card Number Field
        amount = new JTextField();
        J6=new JLabel("Amount");
        J6.setForeground(Color.WHITE);
        add(J6);
        add(amount);

        // Submit Button
        submitButton = new JButton("Confirm Payment");
        submitButton.setBackground(new Color(114,212,232));
        submitButton.setForeground(Color.BLUE);
        submitButton.addActionListener(this);
        add(submitButton);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String cardType = (String) cardTypeComboBox.getSelectedItem();
            String cardNumber = cardNumberField.getText();
            String cvv = cvvField.getText();
            String expiry = expirydate.getText();
            String Pin = PIN.getText();
            String amt = amount.getText();

            // Perform payment processing logic here (dummy example)
            JOptionPane.showMessageDialog(this,
                    "Payment Details:\nType: " + cardType + "\nNumber: " + cardNumber + "\nCVV: " + cvv
                            + "\n Amount Paid Successfully: "
                            + amt);

            JOptionPane.showMessageDialog(null, "Tickets Booked !", "Airlines", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MakePaymentPage();
        });
    }
}
