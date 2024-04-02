
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    String formno;
    
    JRadioButton savingsacc , fixeddepositacc , currentacc , recurringdepositacc;
    
    JCheckBox atmcard , internetbanking , mobilebanking , emailalerts , 
            chequebook , estatement , decleration ;
    
    JButton submit , cancel;
    
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100 , 100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(150 , 10 , 100 , 100);
        add(label);
        
        JLabel form = new JLabel("Form No. "+ formno);
        form.setFont(new Font ("Raleway" , Font.BOLD , 12));
        form.setBounds(670, 10 , 100 , 20);
        add(form);
        
        JLabel accountdetails = new JLabel("Page 3 : Account Details");
        accountdetails.setFont(new Font ("Raleway" , Font.BOLD , 30));
        accountdetails.setBounds(270, 40 , 400 , 40);
        add(accountdetails);
        
        JLabel accounttype = new JLabel("Account Type : ");
        accounttype.setFont(new Font("Raleway" ,Font.BOLD , 20));
        accounttype.setBounds(100 , 150 , 180 , 30);
        add(accounttype);
        
        savingsacc = new JRadioButton("Savings Account");
        savingsacc.setBounds(120 , 200 , 300 , 30);
        savingsacc.setFont(new Font("Raleway" ,Font.BOLD , 18));
        savingsacc.setBackground(Color.WHITE);
        add(savingsacc);
        
        fixeddepositacc = new JRadioButton("Fixed Deposit Account");
        fixeddepositacc.setBounds(420 , 200 , 300 , 30);
        fixeddepositacc.setFont(new Font("Raleway" ,Font.BOLD , 18));
        fixeddepositacc.setBackground(Color.WHITE);
        add(fixeddepositacc);
        
        currentacc = new JRadioButton("Current Account");
        currentacc.setBounds(120 , 250 , 300 , 30);
        currentacc.setFont(new Font("Raleway" ,Font.BOLD , 18));
        currentacc.setBackground(Color.WHITE);
        add(currentacc);
        
        recurringdepositacc = new JRadioButton("Recurring Deposit Account");
        recurringdepositacc.setBounds(420 , 250 , 300 , 30);
        recurringdepositacc.setFont(new Font("Raleway" ,Font.BOLD , 18));
        recurringdepositacc.setBackground(Color.WHITE);
        add(recurringdepositacc);
        
        JLabel cardno = new JLabel("Card No : ");
        cardno.setFont(new Font("Raleway" ,Font.BOLD , 20));
        cardno.setBounds(100 , 310 , 180 , 30);
        add(cardno);
        
        JLabel cardno2 = new JLabel("(Your 16-Digit Card Number)");
        cardno2.setFont(new Font("Raleway" ,Font.BOLD , 13));
        cardno2.setBounds(100 , 340 , 180 , 30);
        add(cardno2);
        
        JLabel cardno3 = new JLabel("XXXX-XXXX-XXXX-4184");
        cardno3.setFont(new Font("Raleway" ,Font.BOLD , 20));
        cardno3.setBounds(360 , 310 , 400 , 30);
        add(cardno3);
        
        JLabel cardno4 = new JLabel("It would appear on ATM CardCheque Book and Statements");
        cardno4.setFont(new Font("Raleway" ,Font.BOLD , 13));
        cardno4.setBounds(360 , 340 , 400 , 30);
        add(cardno4);
        
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway" ,Font.BOLD , 20));
        pin.setBounds(100 , 400 , 180 , 30);
        add(pin);
        
        JLabel pin2 = new JLabel("(4-Digit Password)");
        pin2.setFont(new Font("Raleway" ,Font.BOLD , 13));
        pin2.setBounds(100 , 430 , 180 , 30);
        add(pin2);
        
        JLabel pin3 = new JLabel("XXXX");
        pin3.setFont(new Font("Raleway" ,Font.BOLD , 20));
        pin3.setBounds(360 , 400 , 150 , 30);
        add(pin3);
        
        JLabel services = new JLabel("Services Required : ");
        services.setFont(new Font("Raleway" ,Font.BOLD , 20));
        services.setBounds(100 , 480 , 250 , 30);
        add(services);
        
        atmcard = new JCheckBox("ATM Card");
        atmcard.setBounds(120 , 520 , 300 , 30);
        atmcard.setFont(new Font("Raleway" ,Font.BOLD , 18));
        atmcard.setBackground(Color.WHITE);
        add(atmcard);
        
        internetbanking = new JCheckBox("Internet Banking");
        internetbanking.setBounds(420 , 520 , 300 , 30);
        internetbanking.setFont(new Font("Raleway" ,Font.BOLD , 18));
        internetbanking.setBackground(Color.WHITE);
        add(internetbanking);
        
        mobilebanking = new JCheckBox("Mobile Banking");
        mobilebanking.setBounds(120 , 560 , 300 , 30);
        mobilebanking.setFont(new Font("Raleway" ,Font.BOLD , 18));
        mobilebanking.setBackground(Color.WHITE);
        add(mobilebanking);
        
        emailalerts = new JCheckBox("Email Alerts");
        emailalerts.setBounds(420 , 560 , 300 , 30);
        emailalerts.setFont(new Font("Raleway" ,Font.BOLD , 18));
        emailalerts.setBackground(Color.WHITE);
        add(emailalerts);
        
        chequebook = new JCheckBox("Cheque Book");
        chequebook.setBounds(120 , 600 , 300 , 30);
        chequebook.setFont(new Font("Raleway" ,Font.BOLD , 18));
        chequebook.setBackground(Color.WHITE);
        add(chequebook);
        
        estatement = new JCheckBox("E-Statement");
        estatement.setBounds(420 , 600 , 300 , 30);
        estatement.setFont(new Font("Raleway" ,Font.BOLD , 18));
        estatement.setBackground(Color.WHITE);
        add(estatement);
        
        decleration = new JCheckBox("I hereby declare that the above entered details are correct to best of my knowledge");
        decleration.setBounds(100 , 650 , 600 , 30);
        decleration.setFont(new Font("Raleway" ,Font.BOLD , 13));
        decleration.setBackground(Color.WHITE);
        add(decleration);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250 , 690 , 100 , 30);
        submit.setFont(new Font("Raleway" ,Font.BOLD , 18));
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450 , 690 , 100 , 30);
        cancel.setFont(new Font("Raleway" ,Font.BOLD , 18));
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850 , 800);
        setLocation(350 , 10);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accounttype = null;
            if(savingsacc.isSelected()){
                accounttype = "Savings Account";
            }else if(fixeddepositacc.isSelected()){
                accounttype = "Fixed Deposit Account";
            }else if(currentacc.isSelected()){
                accounttype = "Current Account";
            }else if(recurringdepositacc.isSelected()){
                accounttype = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
        
            String pin = "" + Math.abs((random.nextLong() % 9000L) +1000L);
    
            
            String facility = null;
            if(atmcard.isSelected()){
                facility = "ATM Card";
            }else if(internetbanking.isSelected()){
                facility = "Internet Banking";
            }else if(mobilebanking.isSelected()){
                facility = "Mobile Banking";
            }else if(emailalerts.isSelected()){
                facility = "Email Alerts";
            }else if(chequebook.isSelected()){
                facility = "Cheque Book";
            }else if(estatement.isSelected()){
                facility = "E-Statement";
            }
            
            try{
                
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null , "Account Type is Required");
                }else{
                    Conn c = new Conn();
                    String query = "insert into signupthree values('"+formno+"' , '"+accounttype+"' , '"+cardnumber+"' , '"+pin+"' , '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"' , '"+cardnumber+"' , '"+pin+"')";
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null , "Card Number : " + cardnumber + "\n PIN : " + pin);
                    
                    setVisible(false);
                    new Deposit(pin).setVisible(true);
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        
        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    
    public static void main(String[] args){
        new SignupThree("");
    }
}
