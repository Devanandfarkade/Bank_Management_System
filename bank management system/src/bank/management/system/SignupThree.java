
package bank.management.system;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame{
    
    JRadioButton r1,r2,r3,r4;
    
    SignupThree(){
        setLayout(null);
       
       
        JLabel l1=new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(290, 40, 400, 40);// previous values -- 290, 40, 400, 40
        add(l1);
        
         JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 130, 200, 30);//previous values -- 100, 140, 200, 30
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100, 180, 200, 20);
        add(r1);
        
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350, 180, 150, 20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100, 220, 150, 20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350, 220, 150, 20);
        add(r4);
        
        
         setSize(850,670);// previous values --  850, 700 
        setLocation(260,5);
        setVisible(true);
    }
    
  
}
