import java.awt.*;
import javax.swing.*;


import java.awt.event.*;
import java.util.ArrayList;
public class Viewflight extends JFrame{
    JTable j;
    Container pane = getContentPane();
    ArrayList<flightdetails> fd;
        String header[]=new String[]{"Flight ID","Flight Name","Type","Capacity","Departure Date","Arrival Date","Origin","Destination","Price"};
        String[][] data = {
            { "1 ", "Air-India", "Indian","120","16-11-23","17-11-23","Allahabad","Haryana","10000" },
            { "2 ", "Air-India", "Indian","120","16-11-23","17-11-23","Allahabad","Delhi","10000" },
            { "3 ", "Air-India", "Indian","120","16-11-23","17-11-23","Allahabad","Banaras","10000" },
            { "4 ", "Air-India", "International","16-11-23","17-11-23","London","New York","1500" },
            { "5 ", "Air-India", "Indian","120","16-11-23","17-11-23","Allahabad","Chandigarh","10000" },
            { "6 ", "Air-India", "Indian","120","23-11-23","30-11-23","Allahabad","Delhi","1000" },
            { "7 ", "Air-India", "Indian","120","16-11-23","17-11-23","Allahabad","Punjab","10000" },
        };
        int row,col;
    Viewflight() {
       
       fd=new ArrayList<flightdetails>();
       setBackground(new Color(60,52,76));

        setSize(1000,1200);
        listener l = new listener();
        
        j = new JTable(data, header);
        j.setBounds(30, 40, 300, 600);
        j.setEditingRow(0);
        j.setEditingColumn(0);
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        pane.add(sp);
        setVisible(true);
    }
    class listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            
            //flightdetails fd=new flightdetails();
            
            
            // new flhtdetails(id);
            //     setVisible(false);
        }

    }

    
}
