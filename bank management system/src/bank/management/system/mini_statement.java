package bank.management.system;

import java.awt.Button;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;

public class mini_statement extends JFrame implements ActionListener{
    JButton button;
    String pin;
    mini_statement(String pin){
        setTitle("Mini Statement");
        this.pin = pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("Indian Bank");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try {
            Con1 c = new Con1();
            ResultSet resultset = c.statement.executeQuery("select * from login where pin = '"+pin+"'");

            while(resultset.next()){
                label3.setText("Card Number :"+ resultset.getString("card_number").substring(0,4) + "XXXXXXXX"+resultset.getString("card_number").substring(12));

            }




        } catch (Exception e) {
           e.printStackTrace();
        }
        try {

            int balance = 0;
            Con1 c= new Con1();
            ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                 while(resultset.next()){
                    label1.setText(label1.getText() + "<html>" + resultset.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultset.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultset.getString("amount")+"<br><br><html>");
                    if(resultset.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(resultset.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultset.getString("amount"));
                    }
                 }
                label4.setText("Your Total Balance is Rs. "+balance);     
        } catch (Exception e) {
            e.printStackTrace(); 
        }

        button =new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }
    public static void main(String[] args) {
  
        new mini_statement("");
    }
}
