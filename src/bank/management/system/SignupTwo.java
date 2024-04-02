
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField panTF , aadharTF;
    
    JComboBox religionbox , categorybox , incomebox , edqbox , occupationbox;
    
    JRadioButton senioncitizenyes , senioncitizenno , existingaccountyes , existingaccountno;
    
    JButton next;
    
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
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
        
        JLabel additionaldetails = new JLabel("Page 2 : Additional Details");
        additionaldetails.setFont(new Font ("Raleway" , Font.BOLD , 30));
        additionaldetails.setBounds(270, 40 , 400 , 40);
        add(additionaldetails);
        
        JLabel religion = new JLabel("Religion : ");
        religion.setFont(new Font("Raleway" ,Font.BOLD , 18));
        religion.setBounds(100 , 150 , 180 , 30);
        add(religion);
        
        String valReligion[] = {"Hindu" , "Muslim" , "Sikh" , "Christian" , "Other"}; 
        religionbox = new JComboBox(valReligion);
        religionbox.setBounds(300 , 150 , 430 , 30);
        religionbox.setBackground(Color.WHITE);
        add(religionbox);
        
        JLabel category = new JLabel("Category : ");
        category.setFont(new Font("Raleway" ,Font.BOLD , 18));
        category.setBounds(100 , 200 , 180 , 30);
        add(category);
        
        String valCategory[] = {"General" , "OBC" , "SC" , "ST" , "Other"}; 
        categorybox = new JComboBox(valCategory);
        categorybox.setBounds(300 , 200 , 430 , 30);
        categorybox.setBackground(Color.WHITE);
        add(categorybox);
        
        JLabel income = new JLabel("Income : ");
        income.setFont(new Font("Raleway" ,Font.BOLD , 18));
        income.setBounds(100 , 250 , 180 , 30);
        add(income);
        
        String valincome[] = {"Null" , "<1,50,000" , "<2,50,000" , "<5,00,000" , "Upto 10,00,000" , "More than 10,00,000"}; 
        incomebox = new JComboBox(valincome);
        incomebox.setBounds(300 , 250 , 430 , 30);
        incomebox.setBackground(Color.WHITE);
        add(incomebox);
        
        JLabel edq1 = new JLabel("Educational");
        edq1.setFont(new Font("Raleway" ,Font.BOLD , 18));
        edq1.setBounds(100 , 300 , 180 , 15);
        add(edq1);
        
        JLabel edq2 = new JLabel("Qualification : ");
        edq2.setFont(new Font("Raleway" ,Font.BOLD , 18));
        edq2.setBounds(100 , 317 , 180 , 15);
        add(edq2);
        
        String valedq[] = {"Non-Graduate" , "Graduate" , "PostGraduate" , "Doctrate" , "Other"}; 
        edqbox = new JComboBox(valedq);
        edqbox.setBounds(300 , 304 , 430 , 30);
        edqbox.setBackground(Color.WHITE);
        add(edqbox);
        
        
        JLabel occupation = new JLabel("Occupation : ");
        occupation.setFont(new Font("Raleway" ,Font.BOLD , 18));
        occupation.setBounds(100 , 350 , 180 , 30);
        add(occupation);
        
        String valocc[] = {"Salarized" , "Self-Employed" , "Buisness" , "Student" , "Retired" ,"Others"}; 
        occupationbox = new JComboBox(valocc);
        occupationbox.setBounds(300 , 350 , 430 , 30);
        occupationbox.setBackground(Color.WHITE);
        add(occupationbox);
        
        JLabel pan = new JLabel("PAN Number : ");
        pan.setFont(new Font("Raleway" ,Font.BOLD , 18));
        pan.setBounds(100 , 400 , 180 , 30);
        add(pan);
        
        panTF = new JTextField();
        panTF.setBackground(Color.WHITE);
        panTF.setBounds(300 , 400 , 430 , 30);
        add(panTF);
        
        JLabel aadhar = new JLabel("Aadhar Number : ");
        aadhar.setFont(new Font("Raleway" ,Font.BOLD , 18));
        aadhar.setBounds(100 , 450 , 180 , 30);
        add(aadhar);
        
        aadharTF = new JTextField();
        aadharTF.setBackground(Color.WHITE);
        aadharTF.setBounds(300 , 450 , 430 , 30);
        add(aadharTF);
        
        JLabel seniorcitizen = new JLabel("Senior Citizen : ");
        seniorcitizen.setFont(new Font("Raleway" ,Font.BOLD , 18));
        seniorcitizen.setBounds(100 , 500 , 180 , 30);
        add(seniorcitizen);
        
        senioncitizenyes = new JRadioButton("Yes");
        senioncitizenyes.setBounds(300 , 500 , 150 , 30);
        senioncitizenyes.setBackground(Color.WHITE);
        add(senioncitizenyes);
        
        senioncitizenno = new JRadioButton("No");
        senioncitizenno.setBounds(450 , 500 , 150 , 30);
        senioncitizenno.setBackground(Color.WHITE);
        add(senioncitizenno);
        
        JLabel existionaccount = new JLabel("Existing Account : ");
        existionaccount.setFont(new Font("Raleway" ,Font.BOLD , 18));
        existionaccount.setBounds(100 , 550 , 180 , 30);
        add(existionaccount);
        
        existingaccountyes = new JRadioButton("Yes");
        existingaccountyes.setBounds(300 , 550 , 150 , 30);
        existingaccountyes.setBackground(Color.WHITE);
        add(existingaccountyes);
        
        existingaccountno = new JRadioButton("No");
        existingaccountno.setBounds(450 , 550 , 150 , 30);
        existingaccountno.setBackground(Color.WHITE);
        add(existingaccountno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(630 , 600 , 100 , 30);
        next.setFont(new Font("Raleway" ,Font.BOLD , 18));
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850 , 800);
        setLocation(350 , 10);
        setVisible(true);
        
    }    
    
   public void actionPerformed (ActionEvent ae){
       String form = formno;
       String religion = (String) religionbox.getSelectedItem();
       String category = (String) categorybox.getSelectedItem();
       String income = (String) incomebox.getSelectedItem();
       String edq = (String) edqbox.getSelectedItem();
       String occupation = (String) occupationbox.getSelectedItem();
       
       String seniorcitizen = null;
       if(senioncitizenyes.isSelected()){
           seniorcitizen = "Yes"; 
       }else if(senioncitizenno.isSelected()){
           seniorcitizen = "No"; 
       }
       
       String existingaccount = null;
       if(existingaccountyes.isSelected()){
            existingaccount = "Yes";
       }else if(existingaccountno.isSelected()){
            existingaccount = "No";
       }
       
       String pan = panTF.getText();
       String aadhar = aadharTF.getText();
       
       try{
           if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null , "Addhar Number is Required");
            }else{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"' ,'"+religion+"' ,'"+category+"' ,'"+income+"' ,'"+edq+"' ,'"+occupation+"' ,'"+pan+"' ,'"+aadhar+"' ,'"+seniorcitizen+"' ,'"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
           }
       }catch(Exception e){
           System.out.println(e);
       }
   }
    
    public static void main(String[] args){
        new SignupTwo("");
    }
    
}
