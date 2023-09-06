package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.ResultSet;
import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener{
    String pin;

    TextField textField;

    JButton b1,b2;
    Withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWL IS Rs.10,000 ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,700,35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        l3.add(label2);

        textField =new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(textField);

        b1 = new JButton("Withdrawl");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
         setSize(1550,830);
         setLocation(0,0);
         setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        try {
            String amount = textField.getText();
            Date date = Date.valueOf(LocalDate.now());

            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the Amount you want to withdrawl");
            }else{
                Con1 c = new Con1();
                ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultset.next()){
                    if(resultset.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultset.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultset.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");
                setVisible(false);
                new main_Class(pin);
            }
        } catch (Exception E) {
        }
    }else if(e.getSource()==b2){
        setVisible(false);
        new main_Class(pin);
    }
}
    public static void main(String[] args) {
        new Withdrawl("");
    }
    
}
