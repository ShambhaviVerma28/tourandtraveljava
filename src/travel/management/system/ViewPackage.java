package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    
    ViewPackage(String username){
        setBounds(450, 180, 870, 625);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);
        
        JLabel labelusername= new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);
        
        JLabel lblid= new JLabel("ID");
        lblid.setBounds(30, 110, 150, 25);
        add(lblid);
        
        JLabel labelid= new JLabel();
        labelid.setBounds(220, 110, 150, 25);
        add(labelid);
        
        JLabel lblnumber= new JLabel("ID Number");
        lblnumber.setBounds(30, 170, 150, 25);
        add(lblnumber);
        
        JLabel labelnumber= new JLabel();
        labelnumber.setBounds(220, 170, 150, 25);
        add(labelnumber);
        
        JLabel lblpackage= new JLabel("Selected Package");
        lblpackage.setBounds(30, 230, 150, 25);
        add(lblpackage);
        
        JLabel labelpackage= new JLabel();
        labelpackage.setBounds(220, 230, 150, 25);
        add(labelpackage);
        
        JLabel lblperson= new JLabel("No Of Person");
        lblperson.setBounds(30, 290, 150, 25);
        add(lblperson);
        
        JLabel labelperson= new JLabel();
        labelperson.setBounds(220, 290, 150, 25);
        add(labelperson);
        
        JLabel lblphone= new JLabel("Phone no.");
        lblphone.setBounds(30, 350, 150, 25);
        add(lblphone);
        
        JLabel labelphone= new JLabel();
        labelphone.setBounds(220, 350, 150, 25);
        add(labelphone);
        
        JLabel lblamnt= new JLabel("Amount");
        lblamnt.setBounds(30, 410, 150, 25);
        add(lblamnt);
        
        JLabel labelamnt= new JLabel();
        labelamnt.setBounds(220, 410, 150, 25);
        add(labelamnt);
        
        back= new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(Color.blue);
        back.setBounds(130, 500, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450, 20, 500, 400);
        add(image);
        
        
        try{
            Conn c=new Conn();
            String query="select * from bookPackage where username= '"+username+"'";
            ResultSet rs= c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("idname"));
                labelnumber.setText(rs.getString("idnumber"));
                labelpackage.setText(rs.getString("package"));
                labelperson.setText(rs.getString("person"));
                //labelcountry.setText(rs.getString("country"));
                //labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelamnt.setText(rs.getString("amount"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new ViewPackage("shambhavi28");
    }
}
