
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.sql.*;

public class Fastcash extends JFrame implements ActionListener{
    
    JButton b1 , b2 , b3 , b4 , b5 , b6 , exit;
    
    String pinnumber;
    
    Fastcash(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900 , 900 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0 , 0 , 900 , 900);
        add(label);

        JLabel text = new JLabel("Select Withdrawl amount");
        text.setBounds(170 , 300 ,400 ,20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font ("System" , Font.BOLD , 16));
        label.add(text);
        
        b1 = new JButton("Rs. 100");
        b1.setBounds(170 , 415 , 150 , 30);
        b1.addActionListener(this);
        label.add(b1);
        
        b2 = new JButton("Rs. 500");
        b2.setBounds(355 , 415 , 150 , 30);
        b2.addActionListener(this);
        label.add(b2);
        
        b3 = new JButton("Rs. 1000");
        b3.setBounds(170 , 450 , 150 , 30);
        b3.addActionListener(this);
        label.add(b3);
        
        b4 = new JButton("Rs. 2000");
        b4.setBounds(355 , 450 , 150 , 30);
        b4.addActionListener(this);
        label.add(b4);
        
        b5 = new JButton("Rs. 5000");
        b5.setBounds(170 , 485 , 150 , 30);
        b5.addActionListener(this);
        label.add(b5);
        
        b6 = new JButton("Rs. 10000");
        b6.setBounds(355 , 485 , 150 , 30);
        b6.addActionListener(this);
        label.add(b6);
        
        exit = new JButton("Back");
        exit.setBounds(355 , 520 , 150 , 30);
        exit.addActionListener(this);
        label.add(exit);
        
        
        setSize(900 , 900);
        setUndecorated(true);
        setLocation(300 , 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else{
            String amount = ((JButton)ae.getSource()).getText().substring(4);
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from  bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null , "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"'  , '"+date+"'  , 'Withdrawal', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null , "Rs." + amount + " Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main (String[] args){
        new Fastcash("");
    }
}
