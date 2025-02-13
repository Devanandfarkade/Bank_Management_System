/**
 *
 * @author Devanand
 */
package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin,rePin;
    JButton change,back;
    String pinnumber;

    public PinChange(String pinnumber) {
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text=new JLabel("CHANGE YOUR  PIN ");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250, 280, 500, 35);
        image.add(text);
        
        JLabel pinText=new JLabel("NEW PIN ");
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System",Font.BOLD,16));
        pinText.setBounds(165, 320, 180, 25);
        image.add(pinText);
        
        pin=new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        JLabel repinText=new JLabel("Re-Enter NEW PIN :  ");
        repinText.setForeground(Color.WHITE);
        repinText.setFont(new Font("System",Font.BOLD,16));
        repinText.setBounds(165, 360, 180, 25);
        image.add(repinText);
        
        rePin=new JPasswordField();
        rePin.setFont(new Font("Raleway",Font.BOLD,25));
        rePin.setBounds(330, 360, 180, 25);
        image.add(rePin);
        
        change =new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
         back =new JButton("BACK");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
    
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == change){
        
        try{
            String npin=pin.getText();
            String rpin=rePin.getText();
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered Pin Does not Match");
                return;
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter new PIN");
                return;
            }
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please re-Enter PIN");
                return;
            }
            Conn  conn=new Conn();
            String query1="update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'  ";
            String query2="update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'  ";
            String query3="update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"'  ";
            
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN Changed Successfully ! ");
            setVisible(false);
            new Transactions(rpin).setVisible(true);
            
            
        }catch(Exception e){
            System.out.println(e);
            }
        }
        else{
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
                
                }

    }
    
//        public static void main(String[] args) {
//        new PinChange("").setVisible(true);
//    }

}
