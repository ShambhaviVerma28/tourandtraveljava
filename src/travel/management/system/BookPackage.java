package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
    JLabel labelusername, labelid, labelnumber, labelphone, labelamount;
    Choice pack;
    JTextField tfperson;
    String username;
    JButton checkPrice, book, back;
    BookPackage(String username){
        this.username=username;
        setBounds(500, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
       
        JLabel text= new JLabel("BOOK PACKAGE");
        text.setBounds(50, 0, 300, 25);
        text.setFont(new Font("Algerian", Font.BOLD, 20));
        add(text);
        
       JLabel lblusername= new JLabel("Username");
       lblusername.setBounds(30,50,150,25);
       lblusername.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblusername);
       
       labelusername= new JLabel();
       labelusername.setBounds(220, 50, 150, 25);
       add(labelusername);
       
       JLabel lblpackage= new JLabel("Select Package");
       lblpackage.setBounds(30,90,150,25);
       lblpackage.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblpackage);
       
        pack= new Choice();
        pack.add("Gold Package");
        pack.add("Silver Package");
        pack.add("Bronze Package");
        pack.setBounds(220, 90, 150, 25);
        add(pack);
        
        JLabel lblperson= new JLabel("Select No of Person");
       lblperson.setBounds(30,130,150,25);
       lblperson.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblperson);
       
        tfperson=new JTextField();
        tfperson.setBounds(220,130, 150, 25);
        add(tfperson);
        
       JLabel lblid= new JLabel("ID");
       lblid.setBounds(30,170,150,25);
       lblid.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblid);
       
       labelid= new JLabel();
       labelid.setBounds(220, 170, 150, 25);
       add(labelid);
       
       JLabel lblnumber= new JLabel("Number");
       lblnumber.setBounds(30,210,150,25);
       lblnumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblnumber);
       
       labelnumber= new JLabel();
       labelnumber.setBounds(220, 210, 150, 25);
       add(labelnumber);
       
       JLabel lblphone= new JLabel("Phone");
       lblphone.setBounds(30,250,150,25);
       lblphone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblphone);
       
       labelphone= new JLabel();
       labelphone.setBounds(220, 250, 150, 25);
       add(labelphone);
       
       JLabel lblamount= new JLabel("Total Amount");
       lblamount.setBounds(30,290,150,25);
       lblamount.setFont(new Font("Times New Roman", Font.PLAIN, 15));
       add(lblamount);
       
       labelamount= new JLabel();
       labelamount.setBounds(220, 290, 150, 25);
       add(labelamount);
       
       checkPrice=new JButton("Check Price");
       checkPrice.setBackground(Color.white);
       checkPrice.setForeground(Color.blue);
       checkPrice.setBounds(60, 380, 120, 25);
       checkPrice.addActionListener(this);
       add(checkPrice);
       
       book=new JButton("Book Package");
       book.setBackground(Color.white);
       book.setForeground(Color.blue);
       book.setBounds(200, 380, 130, 25);
       book.addActionListener(this);
       add(book);
       
       back=new JButton("Back");
       back.setBackground(Color.white);
       back.setForeground(Color.blue);
       back.setBounds(350, 380, 120, 25);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
       Image i2= i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image= new JLabel(i3);
       image.setBounds(500, 50, 500, 300);
       add(image);
       
       try{
           Conn c= new Conn();
           ResultSet rs= c.s.executeQuery("select * from customer where username= '"+username+"'");
           while(rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("idname"));
               labelnumber.setText(rs.getString("idnumber"));
               labelphone.setText(rs.getString("phone"));
               
           }
       }catch (Exception e){
           e.printStackTrace();
       }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkPrice){
            String selected_pack= pack.getSelectedItem();
            int cost=0;
            if(selected_pack.equalsIgnoreCase("GOLD PACKAGE")){
                cost+=32000;
            }else if(selected_pack.equalsIgnoreCase("SILVER PACKAGE")){
                cost+=24000;
            }else{
                cost+=12000;
            }  int person=Integer.parseInt(tfperson.getText());
            cost*=person;
            labelamount.setText("Rs "+cost);
        }
        else if(ae.getSource()==book){
            try{
                Conn c= new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"', '"+pack.getSelectedItem()+"', '"+tfperson.getText()+"', '"+labelid.getText()+"', '"+labelnumber.getText()+"', '"+labelphone.getText()+"', '"+labelamount.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new BookPackage("shambhavi28");
    }

}
