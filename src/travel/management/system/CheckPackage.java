package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        setBounds(450, 200, 900, 600);
        
        String package1[]={"GOLD PACKAGE", "6 days & 7 Nights", "Airport Assistance", "Half Day City Tour", "Daily Buffet", "Hard drinks free", "Full Day 3 ISland Cruise", "English Speaking Guide", "BOOK NOW!!!", "SUMMER SPECIAL","Rs 32000/-", "package1.jpg"};
        String package2[]={"SILVER PACKAGE", "5 days & 6 Nights", "Toll Free", "Entrance Free Tickets", "Meet and Greet at Airport", "Welcome drinks on arrival", "Night Safari", "Cruise with Dinner", "B00K NOW!!!", "WINTER SPECIAL", "Rs 24000/-", "package2.jpg"};
        String package3[]={"BRONZE PACKAGE", "4 days & 5 Nights", "Return Airfare", "Free Clubbing", "Free Horse Riding", "Soft drinks free", "Daily Buffet", "BBQ Dinner", "BOOK NOW!!!", "WINTER SPECIAL", "Rs 12000/-", "package3.jpg"};
        
        JTabbedPane tab= new JTabbedPane();
        
        JPanel p1= createPackage(package1);
        tab.addTab("Package 1", null, p1);
        JPanel p2= createPackage(package2);
        tab.addTab("Package 2", null, p2);
        JPanel p3= createPackage(package3);
        tab.addTab("Package 3", null, p3);
        
        add(tab);
        
        setVisible(true);
    }
    public JPanel createPackage(String pack[]){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        JLabel l1= new JLabel(pack[0]);
        l1.setBounds(50, 5, 300, 30);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Algerian", Font.BOLD, 30));
        p1.add(l1);
        
        JLabel l2= new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p1.add(l2);
        
        JLabel l3= new JLabel(pack[2]);
        l3.setBounds(30, 110, 300, 30);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Times new Roman", Font.BOLD, 20));
        p1.add(l3);
        
        JLabel l4= new JLabel(pack[3]);
        l4.setBounds(30, 160, 300, 30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Times new Roman", Font.BOLD, 20));
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210, 300, 30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Times new Roman", Font.BOLD, 20));
        p1.add(l5);
        
        JLabel l6= new JLabel(pack[5]);
        l6.setBounds(30, 260, 300, 30);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Times new Roman", Font.BOLD, 20));
        p1.add(l6);
        
        JLabel l7= new JLabel(pack[6]);
        l7.setBounds(30, 310, 300, 30);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Times new Roman", Font.BOLD, 20));
        p1.add(l7);
        
        JLabel l8= new JLabel(pack[7]);
        l8.setBounds(30, 360, 300, 30);
        l8.setForeground(Color.red);
        l8.setFont(new Font("Times new Roman", Font.BOLD, 20));
        p1.add(l8);
        
        JLabel l9= new JLabel(pack[8]);
        l9.setBounds(60, 430, 300, 30);
        l9.setForeground(Color.black);
        l9.setFont(new Font("Times new Roman", Font.BOLD, 25));
        p1.add(l9);
        
        JLabel l10= new JLabel(pack[9]);
        l10.setBounds(80, 480, 300, 30);
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Times new Roman", Font.BOLD, 25));
        p1.add(l10);
        
        JLabel l11= new JLabel(pack[10]);
        l11.setBounds(500, 480, 300, 30);
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Algerian", Font.BOLD, 25));
        p1.add(l11);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2= i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l12= new JLabel(i3);
        l12.setBounds(350, 20, 500, 300);
        p1.add(l12);
        
        return p1;
    }
    public static void main(String args[]){
        new CheckPackage();
    }
}
