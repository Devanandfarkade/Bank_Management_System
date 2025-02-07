
package bank.management.system;

/**
 *
 * @author Devanand
 */
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class MiniStatement extends JFrame{
    
    
    MiniStatement( String pinnumber){
        setTitle("Mini Statement ");
        
        setLayout(null);
        
        JLabel mini=new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);
        
        JLabel bank=new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
        
        JLabel card=new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        try{
            Conn conn=new Conn();
           ResultSet rs= conn.s.executeQuery("Select * from login where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number :"+ rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("CardNumber").substring(12));
            } 
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        try{
            Conn conn=new Conn();
            ResultSet rs=conn.s.executeQuery("Select * from bank where pin  = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() +"<html>"+ rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("amount") + "<br><br><html>");
            }
        }catch(Exception e){
        System.out.println(e);
        }
        
       
        
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    
    }
//    public static void main(String[] args) {
//        new MiniStatement("");
//    }
    
}
