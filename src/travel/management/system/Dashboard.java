package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    JButton addPersonalDetails, updatePersonalDetails, viewPersonalDetails, deletePersonalDetails, checkPackages, bookPackage, viewPackage, viewHotels, bookHotel, viewBookedHotel, destinations, payments, calculator, notepad, about;
    
    String username;
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon= new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80, 10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addPersonalDetails= new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails= new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails= new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails= new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(deletePersonalDetails);
        
        checkPackages= new JButton("Check Packages");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(0, 0, 102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        bookPackage= new JButton("Book Packages");
        bookPackage.setBounds(0,250,300,50);
        bookPackage.setBackground(new Color(0, 0, 102));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);
        
        viewPackage= new JButton("View Packages");
        viewPackage.setBounds(0,300,300,50);
        viewPackage.setBackground(new Color(0, 0, 102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackage.addActionListener(this);
        p2.add(viewPackage);
        
        viewHotels= new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(viewHotels);
        
        bookHotel= new JButton("Book Hotels");
        bookHotel.setBounds(0,400,300,50);
        bookHotel.setBackground(new Color(0, 0, 102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(bookHotel);
        
        viewBookedHotel= new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,450,300,50);
        viewBookedHotel.setBackground(new Color(0, 0, 102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(viewBookedHotel);
        
        destinations= new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(destinations);
        
        payments= new JButton("Payment Gateway");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(payments);
        
        calculator= new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(calculator);
        
        notepad= new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(notepad);
        
        about= new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(about);
        
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5= i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text= new JLabel("TRAVEL AND TOURISM MANAGEMENT SYSTEM");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.black);
        text.setFont(new Font("Raleway", Font.BOLD, 40));
        image.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource()== viewPersonalDetails){
            new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkPackages){
            new CheckPackage();
        }
        else if(ae.getSource()==bookPackage){
            new BookPackage(username);
        }
        else if(ae.getSource()==viewPackage){
            new ViewPackage(username);
        }
    }
    
    public static void main(String args[]){
        new Dashboard("");
    }


}
