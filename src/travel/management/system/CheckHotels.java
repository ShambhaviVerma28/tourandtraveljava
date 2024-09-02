package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame{
    CheckHotels(){
       setBounds(500, 200, 800, 600) ;
       
       ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
       ImageIcon imageicon[]= new ImageIcon[]{i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};
       
       Image j1, j2, j3, j4, j5, j6, j7, j8, j9, j10;
       Image image[]= new Image[]{j1, j2, j3, j4, j5, j6, j7, j8, j9, j10};
       
       ImageIcon k1, k2, k3, k4, k5, k6, k7, k8, k9, k10;
       ImageIcon imageicon1[]= new ImageIcon[]{k1, k2, k3, k4, k5, k6, k7, k8, k9, k10};
       
       for(int i=0;i<10;i++){
           imageicon[i]=new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+(i+1)+".jpg"));
           image[i]= imageicon[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            i3=new ImageIcon(image[i]);
           JLabel image= new JLabel(i3);
           image.setBounds(0, 0, 800, 600);
           add(image);
       }
       
       
       setVisible(true);
    }
    public static void main(String args[]){
        new CheckHotels();
    }
}
