
package bank.management.system;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SignupThree extends JFrame{
    SignupThree(){
        
        //setSize(850,820);
         setSize(850,700);
        setLocation(260,5);
        setVisible(true);
        JLabel l1=new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);
    }
    
  
}
