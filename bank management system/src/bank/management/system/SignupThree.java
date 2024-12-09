
package bank.management.system;

import java.awt.Font;
import javax.swing.ButtonGroup;
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
        r2.setBounds(350, 180, 250, 20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100, 220, 150, 20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350, 220, 250, 20);
        add(r4);
        
        ButtonGroup groupAccount=new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);
        
         JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
         JLabel number=new JLabel("XXXX-XXXX-XXXX-8424");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);
          
         JLabel details=new JLabel("This is your 16 Digit card number !");
        details.setFont(new Font("Raleway",Font.ITALIC,12));
        details.setBounds(100, 330, 300, 20);
        add(details);
        
        
         JLabel pin=new JLabel("Pin:  ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
         JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);
        
         JLabel pinDetails=new JLabel("You 4 digit Password !");
        pinDetails.setFont(new Font("Raleway",Font.ITALIC,12));
        pinDetails.setBounds(100, 400, 300, 20);
        add(pinDetails);
        
         JLabel servicesReq=new JLabel("Services Required :  ");
        servicesReq.setFont(new Font("Raleway",Font.BOLD,22));
        servicesReq.setBounds(100, 450, 250, 30);
        add(servicesReq);
        
         setSize(850,820);// previous values --  850, 700 
        setLocation(350,5);
        setVisible(true);
    }
    
  
}
