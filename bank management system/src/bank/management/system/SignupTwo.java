package bank.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDayChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener{
    
  
    JTextField panTextField,adharTextField;
    JButton next;
    JRadioButton eno,eyes,syes,sno;
    JComboBox religion,category,income,occupation,education;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
        
        JLabel additionalDetails=new JLabel("Page 2:  Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 50, 400, 40);
        add(additionalDetails);
        
        JLabel religions=new JLabel("Religion : ");
        religions.setFont(new Font("Raleway",Font.BOLD,20));
        religions.setBounds(100, 110, 100, 30);
        add(religions);
        
        String valreligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox(valreligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300, 110, 400, 30);
        add(religion);
        
        
        JLabel fname=new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 160, 200, 30);
        add(fname);
        
        String valCategory[]={"OBC","NT","OPEN","SC","VJ","Other"};
       category=new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
         category.setBounds(300, 160, 400, 30);
        add(category);
        
        JLabel dob=new JLabel("Income : ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 210, 200, 30);
        add(dob);
        
        String incomeCategory[]={"null","<1,50,000","<1,50,000","<2,50,000","<5,00,000","<Upto 10,00,000"};
        income=new JComboBox(incomeCategory);
         income.setBackground(Color.WHITE);
         income.setBounds(300, 210, 400, 30);
        add(income);
        
        JLabel gender=new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 260, 200, 30);
        add(gender);
       
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 285, 200, 30);
        add(email);
        
         String educationValues[]={"non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        education=new JComboBox(educationValues);
         education.setBackground(Color.WHITE);
         education.setBounds(300, 285, 400, 30);
        add(education);
        
       
        
        JLabel marital=new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 360, 200, 30);
        add(marital);
        
        String occupationValues[]={"Salairied ","Self-Employed","Bussiness","Student","Other"};
        occupation=new JComboBox(occupationValues);
         occupation.setBackground(Color.WHITE);
         occupation.setBounds(300, 360, 400, 30);
        add(occupation);
        
        
        JLabel address=new JLabel("PAN Number : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 410, 200, 30);
        add(address);
        
        panTextField=new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300, 410, 400, 30);
        add(panTextField);
        
        JLabel adhar=new JLabel("Adhar Number : ");
        adhar.setFont(new Font("Raleway",Font.BOLD,20));
        adhar.setBounds(100, 460, 200, 30);
        add(adhar);
        
        adharTextField=new JTextField();
        adharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        adharTextField.setBounds(300, 460, 400, 30);
        add(adharTextField);
        
        JLabel state=new JLabel("Senior Citizen : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 510, 200, 30);
        add(state);
        
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300, 510, 70, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450, 510, 90, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        /*
        other=new JRadioButton("Other");
        other.setBounds(580, 360, 70, 30);
        other.setBackground(Color.WHITE);
        add(other);
        */
        
        ButtonGroup marriedGroup=new ButtonGroup();
        marriedGroup.add(syes);
        marriedGroup.add(sno);
        
        
        JLabel pinCode=new JLabel("Existing Account : ");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100, 560, 200, 30);
        add(pinCode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300, 560, 70, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450, 560, 90, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
 
        ButtonGroup emarriedGroup=new ButtonGroup();
        emarriedGroup.add(eyes);
        emarriedGroup.add(eno);
//        
//        pinTextField=new JTextField();
//        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        pinTextField.setBounds(300, 560, 400, 30);
//        add(pinTextField);
//        
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
        
       
        String sreligions=(String)religion.getSelectedItem();  //setText
        String scategory=(String) category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorcitizen=null;
        
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
       
        String existingAccount=null;
        if(eyes.isSelected()){
            existingAccount="Yes";
        }else if(eno.isSelected()){
            existingAccount="No";
        }
        
        String span=panTextField.getText();
        String saadhar=adharTextField.getText();
     
        
        try {
           
           
                Conn c=new Conn();
                String query="insert into signuptwo values('" +formno+"','" +sreligions+"','" +scategory+"','" +sincome+"','" +seducation+"','" +soccupation+"','" +span+"','" +saadhar+"','" +seniorcitizen+"','" +existingAccount+"')";
                c.s.executeUpdate(query);
                
                //SignupThree Object
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
