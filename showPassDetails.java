import java.awt.*;
import javax.swing.*;


import java.awt.event.*;
import java.util.ArrayList;
public class showPassDetails extends JFrame{
    JTable j;
    JButton dt;
    Container pane = getContentPane();
    ArrayList<flightdetails> fd;
        String header[]=new String[]{"Identity Number","Name","To","From","Date"};
        String[][] data = {
            { "1 ", "Rahul Kala", "London","Delhi","20-11-22" }
            
        };
        int row,col;
    showPassDetails() {
       dt=new JButton("View Ticket");
       fd=new ArrayList<flightdetails>();
       JPanel p1=new JPanel();
       JPanel p2=new JPanel();

        setSize(500,600);
        
       listener l=new listener(); 
        j = new JTable(data, header);
        j.setBounds(30, 40, 400, 600);
        j.setEditingRow(0);
        j.setEditingColumn(0);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        pane.setLayout(new GridLayout(2,1));
        pane.add(p1);
        pane.add(p2);
        p1.add(sp);
        p2.add(dt);
        dt.addActionListener(l);
        setVisible(true);
        
    }
    class listener implements ActionListener{
        public void actionPerformed(ActionEvent evt) {
            if(evt.getSource()==dt)
            new tickets();
        }
    }
    

    
}
