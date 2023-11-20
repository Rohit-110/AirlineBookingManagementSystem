import javax.swing.*;

import java.util.ArrayList;
import java.awt.*;

import java.awt.event.*;
public class AddFlight extends JFrame{
        Container form = getContentPane();
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        ArrayList<flightdetails> fd = new ArrayList<flightdetails>();
        JLabel FId=new JLabel("Flight ID");
        JTextField tFId=new JTextField();
        JLabel FName=new JLabel("Flight Name");
        JTextField tFName=new JTextField();
        JLabel ori=new JLabel("Origin");
        JTextField tori=new JTextField();
        JLabel dest=new JLabel("Destination");
        JTextField tdest=new JTextField();
        JLabel Deptdate=new JLabel("Departure Date");
        JTextField tDeptdate=new JTextField();
        JLabel Arrdate=new JLabel("Arrival Date");
        JTextField tArrdate=new JTextField();
        JLabel Depttime=new JLabel("Departure Time");
        JTextField tDepttime=new JTextField();
        JLabel Arrtime=new JLabel("Arrival Time");
        JTextField tArrtime=new JTextField();
        JLabel cap=new JLabel("Capacity");
        JTextField tcap=new JTextField();
        JLabel type=new JLabel("Type");
        String ty[]={"National","International"};
        JComboBox ttype=new JComboBox(ty);
        JLabel price=new JLabel("Price");
        JTextField tprice=new JTextField();
        JButton addBtn=new JButton("Add Flight");
        JTextArea res=new JTextArea(300,100);
       
        JScrollPane pres=new JScrollPane(res);
        JButton clear=new JButton("Clear");
        
       AddFlight(){
            javax.swing.border.Border newone = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            ((JComponent) form).setBorder(newone);
            form.setLayout(new GridLayout(2,1));
            p1.setBackground(new Color(60,52,76));
            addBtn.setBackground(new Color(114,212,232));
            addBtn.setForeground(Color.BLUE);
            clear.setBackground(new Color(114,212,232));
            clear.setForeground(Color.BLUE);
            FId.setForeground(Color.WHITE);
            FName.setForeground(Color.WHITE);
            ori.setForeground(Color.WHITE);
            dest.setForeground(Color.WHITE);
            Deptdate.setForeground(Color.WHITE);
            Arrdate.setForeground(Color.WHITE);
            Depttime.setForeground(Color.WHITE);
            Arrtime.setForeground(Color.WHITE);
            cap.setForeground(Color.WHITE);
            type.setForeground(Color.WHITE);
            price.setForeground(Color.WHITE);
            // form.setLayout(new BorderLayout());
            p1.setLayout(new GridLayout(15,1));
            form.add(p1);
            form.add(p2);
            p1.add(FId);
            p1.add(tFId);
            p1.add(FName);
            p1.add(tFName);
            p1.add(type);
            p1.add(ttype);
            p1.add(cap);
            p1.add(tcap);
            p1.add(ori);
            p1.add(tori);
            p1.add(dest);
            p1.add(tdest);
            p1.add(Deptdate);
            p1.add(tDeptdate);
            p1.add(Arrdate);
            p1.add(tArrdate);
            p1.add(Arrtime);
            p1.add(tArrtime);
            p1.add(Depttime);
            p1.add(tDepttime);
            
            p1.add(price);
            p1.add(tprice);
            p1.add(addBtn);
        
        
            p1.add(clear);
            // res.setBounds(10,30, 200,200);
            p2.add(res);
            
            listener l=new listener();
            addBtn.addActionListener(l);
            clear.addActionListener(l);
            setSize(1000,1200);
            setMinimumSize(new Dimension(500,600));
        
            setVisible(true);
       }
      
		
       void showdetails()
       {
        String id = tFId.getText();
        String nme =tFName.getText();
        String des = tdest.getText();
        String or = tori.getText();
        String ddate = tDeptdate.getText();
        String adate = tArrdate.getText();
        String atime = tArrtime.getText();
        String dtime = tDepttime.getText();
        String cp=tcap.getText();
        Toolkit tpe=ttype.getToolkit();
        String pce=tprice.getText();
        String text="                             Flight ID : "+id+" -- Flight Name : "+nme;
       
        res.append(text+"\n");
        tFId.setText("");
        tFName.setText("");
        tDeptdate.setText("");
        tArrdate.setText("");
        tArrtime.setText("");
        tDepttime.setText("");
        tcap.setText("");
       
        tori.setText("");
        tdest.setText("");

       
       
       }
       class listener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource()==addBtn)
            showdetails();
            else
            {
                
                tFId.setText("");
                tFName.setText("");
                tDeptdate.setText("");
                tArrdate.setText("");
                tArrtime.setText("");
                tDepttime.setText("");
                tcap.setText("");
                tori.setText("");
                tdest.setText("");
            }
            //fd.add(new flightdetails(id, nme, des,or,ddate,adate,dtime,atime, cp,tpe,pce));
            


        }

    }
   
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        
        
    }
