package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDayChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unMarried,other;
    JDateChooser dateChooser;
    SignupTwo(){
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
        
        JLabel additionalDetails=new JLabel("Page 2:  Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 50, 400, 40);
        add(additionalDetails);
        
        JLabel name=new JLabel("Religion : ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 110, 100, 30);
        add(name);
        
        String valreligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        JComboBox religion=new JComboBox(valreligion);
        religion.setBounds(300, 110, 400, 30);
        add(religion);
        
        
        JLabel fname=new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 160, 200, 30);
        add(fname);
        
        String valCategory[]={"OBC","NT","OPEN","SC","VJ","Other"};
        JComboBox category=new JComboBox(valCategory);
         category.setBounds(300, 160, 400, 30);
        add(category);
        
        JLabel dob=new JLabel("Income : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 210, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 210, 400, 30);
        dateChooser.setForeground(Color.green);
        add(dateChooser);
        
        JLabel gender=new JLabel("Educational : ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 260, 200, 30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300, 260, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female=new JRadioButton("Female");
        female.setBounds(450, 260, 90, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 310, 200, 30);
        add(email);
        
        emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 310, 400, 30);
        add(emailTextField);
        
        JLabel marital=new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 360, 200, 30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300, 360, 70, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unMarried=new JRadioButton("Unmarried");
        unMarried.setBounds(450, 360, 90, 30);
        unMarried.setBackground(Color.WHITE);
        add(unMarried);
        
        other=new JRadioButton("Other");
        other.setBounds(580, 360, 70, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup marriedGroup=new ButtonGroup();
        marriedGroup.add(married);
        marriedGroup.add(unMarried);
        marriedGroup.add(other);
        
        JLabel address=new JLabel("PAN Number : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 410, 200, 30);
        add(address);
        
        addTextField=new JTextField();
        addTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addTextField.setBounds(300, 410, 400, 30);
        add(addTextField);
        
        JLabel city=new JLabel("Adhar Number : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 460, 200, 30);
        add(city);
        
        cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 460, 400, 30);
        add(cityTextField);
        
        JLabel state=new JLabel("Senior Citizen : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 510, 200, 30);
        add(state);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 510, 400, 30);
        add(stateTextField);
        
        JLabel pinCode=new JLabel("Existing Account : ");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100, 560, 200, 30);
        add(pinCode);
        
        pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300, 560, 400, 30);
        add(pinTextField);
        
        next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 600, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        //setSize(850,800);
        setSize(850,700);
        setLocation(260,5);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno="" + random;  //coverting long value to String value
        String name=nameTextField.getText();  //setText
        String fname=fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
       
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }else if(unMarried.isSelected()){
            marital="Unmarried";
        }else if(other.isSelected()){
            marital= "Other";
        }
        
        String address=addTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pinTextField.getText();
        
        
        try {
            if(name.equals("")){
                 JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup values('" +formno+"','" +name+"','" +fname+"','" +dob+"','" +gender+"','" +email+"','" +marital+"','" +address+"','" +city+"','" +pin+"','" +state+"')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        new SignupTwo();
    }
}
