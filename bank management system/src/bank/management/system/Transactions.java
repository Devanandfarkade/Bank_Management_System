
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{

    JButton deposite,withdrawl,fastCash,balInquiry,pinChange,miniStatement,exit;
    String pinnumber;
    Transactions(String pinnumber) {
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposite=new JButton("Deposite");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);
        
        withdrawl=new JButton("Withdrawl");
        withdrawl.setBounds(355, 415, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastCash=new JButton("Fast Cash");
        fastCash.setBounds(170, 485, 150, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        miniStatement=new JButton("Mini Statement");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        pinChange=new JButton("Pin Change");
        pinChange.setBounds(170, 450, 150, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);
        
         balInquiry=new JButton("Balance Inquiry");
        balInquiry.setBounds(355, 485, 150, 30);
        balInquiry.addActionListener(this);
        image.add(balInquiry);
        
        exit=new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() ==exit){
            System.exit(0);
        }
         }
    
//      public static void main(String[] args) {
//        new Transactions("");
//      }
}
