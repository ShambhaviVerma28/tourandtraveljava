
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, password;
    JTextField tfusername, tfpassword;
    
    Login(){
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        
        JPanel p1= new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel Image= new JLabel(i3);
        Image.setBounds(100, 120, 200, 200);
        p1.add(Image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);
        
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("Calibri", Font.PLAIN, 20));
        p2.add(lblusername);
        
        tfusername= new JTextField();
        tfusername.setBounds(60, 50, 300, 30);
        p2.add(tfusername);
        
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(60, 100, 100, 25);
        lblpassword.setFont(new Font("Calibri", Font.PLAIN, 20));
        p2.add(lblpassword);
        
        tfpassword= new JTextField();
        tfpassword.setBounds(60, 130, 300, 30);
        p2.add(tfpassword);
        
        login= new JButton("Login");
        login.setBounds(60, 200,130, 30 );
        login.addActionListener(this);
        p2.add(login);
        
        signup= new JButton("Signup");
        signup.setBounds(250, 200 ,130, 30 );
        signup.addActionListener(this);
        p2.add(signup);
        
        password= new JButton("Forgot Password");
        password.setBounds(150, 250 ,130, 30 );
        password.addActionListener(this);
        p2.add(password);
        
        setVisible(true);
    }
    
    //@override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==signup){
            setVisible(false);
            new Signup();
        }
        else if(ae.getSource()== password){
            setVisible(false);
            new ForgetPassword();
        }
        else if(ae.getSource()==login){
            try{
                String username= tfusername.getText();
                String pass= tfpassword.getText();
                
                String query= "select * from user where username= '"+username+"' AND password= '"+pass+"'";
                Conn c=new Conn();
                ResultSet rs= c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
