import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdateFlight {

    UpdateFlight(){
        
        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable();
        frame.setBackground(new Color(60,52,76)); 
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns=new String[]{"Flight ID","Flight Name","Type","Capacity","Departure Date","Arrival Date","Origin","Destination","Price"};
        
        //     { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" },
        //     { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" },
        //     { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" },
        //     { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" },
        //     { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" },
        //     { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" }
        // };
        String[] data = 
            { "1 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" };
            String[] data1 = 
            { "2 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" };
            String[] data2 = 
            { "3 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" };
            String[] data3 = 
            { "4 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" };
            String[] data4 = 
            { "5 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" };
            String[] data5 = 
            { "6 ", "Air-India", "International","120","16-11-22","17-11-22","Banglore","London","60000" };
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        model.addRow(data1);
        model.addRow(data2);
        model.addRow(data3);
        model.addRow(data4);
        model.addRow(data5);
        frame.setBackground(new Color(60,52,76));
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,10);
        table.setFont(font);
        table.setRowHeight(30);
        
        // create JTextFields
       
        JTextField tFId=new JTextField();
        JTextField tFName=new JTextField();
        JTextField tori=new JTextField();
        JTextField tdest=new JTextField();
        JTextField tDeptdate=new JTextField();
        JTextField tArrdate=new JTextField();
        JTextField tDepttime=new JTextField();
        JTextField tArrtime=new JTextField();
        JTextField tcap=new JTextField();
         JTextField tprice=new JTextField();
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        btnAdd.setBackground(new Color(114,212,232));
        btnAdd.setForeground(Color.BLUE);
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBackground(new Color(114,212,232));
        btnDelete.setForeground(Color.BLUE);
        JButton btnUpdate = new JButton("Update");     
        btnUpdate.setBackground(new Color(114,212,232));
        btnUpdate.setForeground(Color.BLUE);
        
        tFId.setBounds(20, 200, 100, 25);
        tFName.setBounds(20, 220, 100, 25);
        tori.setBounds(20, 240, 100, 25);
        tdest.setBounds(20, 260, 100, 25);
        tDeptdate.setBounds(20, 280, 100, 25);
        tArrdate.setBounds(20, 300, 100, 25);
        tDepttime.setBounds(20, 320, 100, 25);
        tArrtime.setBounds(20, 340, 100, 25);
        tcap.setBounds(20, 360, 100, 25);
        
        btnAdd.setBounds(150, 220, 100, 25);
        btnUpdate.setBounds(150, 265, 100, 25);
        btnDelete.setBounds(150, 310, 100, 25);
        
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        frame.setLayout(null);
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(tFId);
        frame.add(tFName);
        frame.add(tori);
        frame.add(tdest);
        frame.add(tDeptdate);
        frame.add(tArrdate);
        frame.add(tDepttime);
        frame.add(tArrtime);
        frame.add(tcap);
    
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.setBackground(new Color(60,52,76));
        // create an array of objects to set the row data
        Object[] row = new Object[9];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = tFId.getText();
                row[1] = tFName.getText();
                row[2] = tori.getText();
                row[3] = tdest.getText();
                row[4] = tDeptdate.getText();
                row[5] = tArrdate.getText();
                row[6] = tDepttime.getText();
                row[7] = tArrtime.getText();
                row[8] = tcap.getText();
                
                // add row to the model
                if(row[0]=="1" || row[0]=="2" || row[0]=="3" || row[0]=="4" || row[0]=="5" || row[0]=="6" )
                {
                    JOptionPane.showMessageDialog(null,"Flight Id must be unique");
                }
                else
                model.addRow(row);
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
            tFId.setText(model.getValueAt(i, 0).toString());
            tFName.setText(model.getValueAt(i, 1).toString());
            tori.setText(model.getValueAt(i, 2).toString());
            tdest.setText(model.getValueAt(i, 3).toString());
            tDeptdate.setText(model.getValueAt(i, 4).toString());
            tArrdate.setText(model.getValueAt(i, 5).toString());
            tDepttime.setText(model.getValueAt(i, 6).toString());
            tArrtime.setText(model.getValueAt(i, 7).toString());
            tcap.setText(model.getValueAt(i, 8).toString());
            
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(tFId.getText(), i, 0);
                   model.setValueAt(tFName.getText(), i, 1);
                   model.setValueAt(tori.getText(), i, 2);
                   model.setValueAt(tdest.getText(), i, 3);
                   model.setValueAt(tDeptdate.getText(), i, 4);
                   model.setValueAt(tArrdate.getText(), i, 5);
                   model.setValueAt(tDepttime.getText(), i, 6);
                   model.setValueAt(tArrtime.getText(), i, 7);
                   model.setValueAt(tcap.getText(), i, 8);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        frame.setSize(900,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    public static void main(String[] args)
    {
        new UpdateFlight();
    }
}