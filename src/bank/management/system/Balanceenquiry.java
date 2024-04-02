
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Balanceenquiry extends JFrame implements ActionListener {
    
    JButton back;
    
    String pinnumber;
    
    Balanceenquiry(String pinnumber){
    
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900 , 900 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0 , 0 , 900 , 900);
        add(label);
        
        back = new JButton("Back");
        back.setBounds(355 , 520 , 150 , 30);
        back.addActionListener(this);
        label.add(back);
        
        Conn c = new Conn();
        int balance = 0;
        
        try{
            ResultSet rs = c.s.executeQuery("select * from  bank where pin = '"+pinnumber+"'");
                
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }    
        
        JLabel text = new JLabel("Your Current Account Balance is Rs." + balance);
        text.setForeground(Color.WHITE);
        text.setBounds(170, 300 , 400 ,30);
        label.add(text);
        
        setSize(900 , 900);
        setUndecorated(true);
        setLocation(300 , 0);
        setVisible(true);
    }    
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    
    public static void main (String[] args){
        new Balanceenquiry("");
    }
}
