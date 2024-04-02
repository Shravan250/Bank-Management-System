
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Ministatement extends JFrame {
    
    String pinnumber;
    
    Ministatement(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel text = new JLabel();
        add(text);
        
        JLabel bank =new JLabel("India Bank");
        bank.setBounds(150 , 20 , 100 , 20);
        add(bank);
        
        JLabel card =new JLabel("Card Number : ");
        card.setBounds(20 , 80 , 300 , 20);
        add(card);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            
            while(rs.next()){
                card.setText("Card Number : " + rs.getString("Card_No").substring(0,4) + "XXXXXXXX" +rs.getString("Card_No").substring(12));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        JLabel mini =new JLabel();
        mini.setBounds(20 , 120 , 400 ,200);
        add(mini);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "Rs." + rs.getString("amount") + "<br><br><html>" );
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        JLabel Balance = new JLabel();
        Balance.setBounds(20 , 400 , 300 ,20);
        add(Balance);
       
        try{
            Conn c = new Conn();
            int balance = 0;
            ResultSet rs = c.s.executeQuery("select * from  bank where pin = '"+pinnumber+"'");
                
            while(rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            Balance.setText("Your Current Account Balance is Rs." + balance);    
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    
    }
    
    
    public static void main (String[] args){
        new Ministatement("");
    }
}
