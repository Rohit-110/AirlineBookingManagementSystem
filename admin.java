import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;



import java.awt.event.*;


public class admin extends JFrame{
    // JFrame mainPanel=new JFrame();
    
    JButton adminadd=new JButton("Add a New Flight");
    JButton viewFlight=new JButton("View Flight");
    JButton adminupdate=new JButton("Update Flight Details");
    Container mainPanel=getContentPane();
     admin()
     {
        mainPanel.setLayout(new GridLayout(3,1));
        adminadd.setBackground(new Color(114,212,232));
        viewFlight.setBackground(new Color(114,212,232));
        adminupdate.setBackground(new Color(114,212,232));
        adminadd.setForeground(Color.BLUE);
        viewFlight.setForeground(Color.BLUE);
        adminupdate.setForeground(Color.BLUE);
        mainPanel.add(adminadd);
        mainPanel.add(adminupdate);
        mainPanel.add(viewFlight);
        listener l=new listener();
        adminadd.addActionListener(l);
        viewFlight.addActionListener(l);
        adminupdate.addActionListener(l);
       Border newone = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        ((JComponent) mainPanel).setBorder(newone);
        setTitle("Add a new Flight");
        setSize(1000,1200);
        setMinimumSize(new Dimension(500,600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
     }
     class listener implements ActionListener{
        public void actionPerformed(ActionEvent evt) {
            if(evt.getSource()==adminadd) {
                new AddFlight();
                // setVisible(false);
                
            }
            else if(evt.getSource()==viewFlight) {
                new Viewflight();
                // setVisible(false);
                
            }
            else
            {
                new UpdateFlight();
                // setVisible(false);
            }
           
        }

     }
     public static void main(String[] args)
    {
        new admin();
    }
    

    
}