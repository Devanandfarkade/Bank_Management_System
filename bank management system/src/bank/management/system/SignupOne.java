package bank.management.system;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class SignupOne extends JFrame{
    SignupOne(){
        setLayout(null);
        Random ran=new Random();
        Long random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 10, 600, 30);
        add(formno);
        
        JLabel personDetails=new JLabel("Page 1:  Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290, 50, 400, 40);
        add(personDetails);
        
        JLabel name=new JLabel("Name : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 120, 100, 30);
        add(name);
        
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 120, 400, 30);
        add(nameTextField);
        
        JLabel fname=new JLabel("Father's Name : ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 170, 200, 30);
        add(fname);
        
        JTextField fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300, 120, 400, 30);
        add(fnameTextField);
        
        JLabel dob=new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 220, 200, 30);
        add(dob);
        
        JLabel gender=new JLabel("Gender : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 270, 200, 30);
        add(gender);
        
        JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 320, 200, 30);
        add(email);
        
        JTextField TextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300, 120, 400, 30);
        add(fnameTextField);
        
        JLabel marital=new JLabel("marital Status : ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 370, 200, 30);
        add(marital);
        
        JLabel address=new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 420, 200, 30);
        add(address);
        
        JLabel city=new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 470, 200, 30);
        add(city);
        
        JLabel state=new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 520, 200, 30);
        add(state);
        
        JLabel pinCode=new JLabel("PinCode : ");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100, 570, 200, 30);
        add(pinCode);
        
        getContentPane().setBackground(Color.WHITE);
        //setSize(850,800);
        setSize(850,650);
        setLocation(260,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
