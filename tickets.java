
import java.awt.*;
import javax.swing.*;


import javax.swing.JLabel;
import javax.swing.JTextField;

// import java.awt.*;
// import javax.swing.*;
// import java.awt.event.*;

public class tickets extends JFrame {

    String id;
    String nme;
    String desto;
    String desfrom;
    JPanel p,pane;
    Container fp = getContentPane();
    tickets()
    {
        p=new JPanel();
        pane=new JPanel();
        JLabel tb = new JLabel("Ticket Information");
        
        JLabel identityNo = new JLabel("Identity Number");
        JTextField ino = new JTextField("1");
        JLabel name = new JLabel("Name");
        JTextField namefield = new JTextField("Rahul Kala");
        JLabel to = new JLabel("To");
        JTextField tofeild = new JTextField("London");
        JLabel from =new JLabel("From");
        JTextField fromfield = new JTextField("Delhi");
        javax.swing.border.Border newone = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        ((JComponent) pane).setBorder(newone);
        fp.setLayout(new GridLayout(3,1));
        pane.setLayout(new GridLayout(5,1));
        
        fp.add(p);
        fp.add(pane);
        p.add(tb);
        pane.add(identityNo);   
        pane.add(ino);
        pane.add(name);
        pane.add(namefield);
        pane.add(to);
        pane.add(tofeild);
        
        pane.add(from);
        pane.add(fromfield);
       
       
        setMinimumSize(new Dimension(500,600));
        setSize(500,600);
        
        setVisible(true);
       
       
        
    }
   
    tickets(String id, String nme, String desto, String desfrom) {
        this.id = id;
        this.nme = nme;
        this.desto = desto;
        this.desfrom = desfrom;
    }
    public static void main(String[] args) {
        new tickets();
    }

}
