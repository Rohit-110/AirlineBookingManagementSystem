import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main extends JFrame implements ActionListener {
    JPanel p1, p2;
    JButton b1, b2, b3;

    Main() {
        JLabel l = new JLabel("INDIAN AIRLINES");
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("User");
        b2 = new JButton("Admin");
        b3 = new JButton("Booking Agent");

        l.setFont(new Font("Times New Roman", Font.BOLD, 45));
        l.setForeground(Color.WHITE);

        ImageIcon icon = new ImageIcon("abc.jpg");
        JLabel label = new JLabel();
        label.setIcon(icon);

        setMinimumSize(new Dimension(500, 600));
        Container pane = getContentPane();
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        pane.setLayout(new GridLayout(2, 1));
        setSize(500, 600);

        // Design for p1 panel
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        p1.setBackground(new Color(60,52,76));
        p1.add(Box.createVerticalStrut(50));
        p1.add(l);

        // Design for p2 panel
        p2.setLayout(new GridLayout(3, 1));
        p2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        p2.setBackground(new Color(60,52,76));

        // Set font and size for buttons
        Font buttonFont = new Font("Arial", Font.PLAIN, 20);
        b1.setFont(buttonFont);
        b2.setFont(buttonFont);
        b3.setFont(buttonFont);

        b1.setBackground(new Color(114,212,232));
        b2.setBackground(new Color(114,212,232));
        b3.setBackground(new Color(114,212,232));

        b1.setForeground(Color.BLUE);
        b2.setForeground(Color.BLUE);
        b3.setForeground(Color.BLUE);

        // Add padding around buttons
        Insets buttonInsets = new Insets(10, 20, 10, 20);
        b1.setMargin(buttonInsets);
        b2.setMargin(buttonInsets);
        b3.setMargin(buttonInsets);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);

        pane.add(p1);
        pane.add(p2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3) {
            new Login("a", "b");
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        if (!GraphicsEnvironment.isHeadless()) {
            new Main();
        }
    }
}