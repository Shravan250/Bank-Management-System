
package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    JTextField nameTF , fathernameTF ,emailTF , addressTF , cityTF , pincodeTF ,
            stateTF;
    
    long random;
    
    JButton next;
    
    JRadioButton male , female , married , unmarried , other;
    
    JDateChooser dateChooser;
    
    SignupOne()
    {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(45 , 10 , 100 , 100);
        add(label);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font ("Raleway" , Font.BOLD , 38));
        formno.setBounds(165 , 30 , 600 , 40);
        add(formno);
        
        JLabel pageno = new JLabel("Page 1 : Personal Details");
        pageno.setFont(new Font ("Raleway" , Font.BOLD , 20));
        pageno.setBounds(285 , 85 , 500 , 40);
        add(pageno);
        
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway" ,Font.BOLD , 18));
        name.setBounds(100 , 150 , 180 , 30);
        add(name);
        
        nameTF = new JTextField();
        nameTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        nameTF.setBounds(300 , 150 , 430 , 30);
        add(nameTF);
        
        JLabel fathername = new JLabel("Father's Name : ");
        fathername.setFont(new Font("Raleway" ,Font.BOLD , 18));
        fathername.setBounds(100 , 200 , 180 , 30);
        add(fathername);
        
        fathernameTF = new JTextField();
        fathernameTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        fathernameTF.setBounds(300 , 200 , 430 , 30);
        add(fathernameTF);
        
        JLabel dateofbirth = new JLabel("Date of Birth : ");
        dateofbirth.setFont(new Font("Raleway" ,Font.BOLD , 18));
        dateofbirth.setBounds(100 , 250 , 180 , 30);
        add(dateofbirth);
        
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300 , 250 , 430 , 30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway" ,Font.BOLD , 18));
        gender.setBounds(100 , 300 , 180 , 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300 , 300 , 150 , 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450 , 300 , 150 , 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        JLabel email = new JLabel("E-Mail Address : ");
        email.setFont(new Font("Raleway" ,Font.BOLD , 18));
        email.setBounds(100 , 350 , 180 , 30);
        add(email);
        
        emailTF = new JTextField();
        emailTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        emailTF.setBounds(300 , 350 , 430 , 30);
        add(emailTF);
        
        JLabel martialstatus = new JLabel("Martial Status : ");
        martialstatus.setFont(new Font("Raleway" ,Font.BOLD , 18));
        martialstatus.setBounds(100 , 400 , 180 , 30);
        add(martialstatus);
        
        married = new JRadioButton("Married");
        married.setBounds(300 , 400 , 150 , 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450 , 400 , 150 , 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(600 , 400 , 150 , 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        JLabel address  = new JLabel("Address : ");
        address.setFont(new Font("Raleway" ,Font.BOLD , 18));
        address.setBounds(100 , 450 , 180 , 30);
        add(address);
        
        addressTF = new JTextField();
        addressTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        addressTF.setBounds(300 , 450 , 430 , 30);
        add(addressTF);
        
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway" ,Font.BOLD , 18));
        city.setBounds(100 , 500 , 180 , 30);
        add(city);
        
        cityTF = new JTextField();
        cityTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        cityTF.setBounds(300 , 500 , 430 , 30);
        add(cityTF);
        
        JLabel pincode = new JLabel("Pin Code : ");
        pincode.setFont(new Font("Raleway" ,Font.BOLD , 18));
        pincode.setBounds(100 , 550 , 180 , 30);
        add(pincode);
        
        pincodeTF = new JTextField();
        pincodeTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        pincodeTF.setBounds(300 , 550 , 430 , 30);
        add(pincodeTF);
        
        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway" ,Font.BOLD , 18));
        state.setBounds(100 , 600 , 180 , 30);
        add(state);

        stateTF = new JTextField();
        stateTF.setFont(new Font("Raleway" ,Font.BOLD , 18));
        stateTF.setBounds(300 , 600 , 430 , 30);
        add(stateTF);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(630 , 650 , 100 , 30);
        next.setFont(new Font("Raleway" ,Font.BOLD , 18));
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850 , 800);
        setLocation(350 , 10);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //long conv to string
        String name = nameTF.getText();
        String fathername = fathernameTF.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTF.getText();
        
        String martial = null;
        if(married.isSelected()){
            martial = "Married";
        }else if(unmarried.isSelected()){
            martial = "Unmarried";
        }if(other.isSelected()){
            martial = "Other";
        }
        
        String address = addressTF.getText();
        String city = cityTF.getText();
        String pincode = pincodeTF.getText();
        String state = stateTF.getText();
        
        try
        {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null , "Name is Required");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"' ,'"+name+"' ,'"+fathername+"' ,'"+dob+"' ,'"+gender+"' ,'"+email+"' ,'"+martial+"' ,'"+address+"' ,'"+city+"' ,'"+pincode+"' ,'"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args){
        new SignupOne();
    }
    
}
