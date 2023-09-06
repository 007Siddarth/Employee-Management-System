package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Signup2 extends JFrame implements ActionListener{
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
   
    JTextField textPan,textAad;

    JRadioButton r1,r2,e1,e2;

    JButton next;

    String formno;
    Signup2(String formno){
    super("APPLICATION FORM");

     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
     Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image =  new JLabel(i3);
     image.setBounds(150,5,100,100);
     add(image);

     this.formno = formno;

     JLabel l1 =new JLabel("Page 2 :-");
     l1.setFont(new Font("Raleway",Font.BOLD,22));
     l1.setBounds(300,30,600,40);
     add(l1);

     JLabel l2 = new JLabel("Additonal Details");
     l2.setFont(new Font("Raleway",Font.BOLD,22));
     l2.setBounds(300,60,600,40);
     add(l2);
     
     
     JLabel l3 =new JLabel("Religion :");
     l3.setFont(new Font("Raleway",Font.BOLD,18));
     l3.setBounds(100,120,100,30);
     add(l3);

     String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
     comboBox = new JComboBox(religion);
     comboBox.setBackground(new Color(255,102,102));
     comboBox.setFont(new Font("Raleway",Font.BOLD,14));
     comboBox.setBounds(350,120,320,30);
     add(comboBox);

     JLabel l4 =new JLabel("Category :");
     l4.setFont(new Font("Raleway",Font.BOLD,18));
     l4.setBounds(100,170,100,30);
     add(l4);

     String category[] = {"General","OBC","SC","ST","Other"};
     comboBox2 = new JComboBox(category);
     comboBox2.setBackground(new Color(255,102,102));
     comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
     comboBox2.setBounds(350,170,320,30);
     add(comboBox2);

     JLabel l5 =new JLabel("Income :");
     l5.setFont(new Font("Raleway",Font.BOLD,18));
     l5.setBounds(100,220,100,30);
     add(l5);

     String income[] = {"NULL","<1,50,000","<2,50,000","<5,00,000","<Upto 10,00,000","Above 10,00,000"};
     comboBox3 = new JComboBox(income);
     comboBox3.setBackground(new Color(255,102,102));
     comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
     comboBox3.setBounds(350,220,320,30);
     add(comboBox3);


     JLabel l6 =new JLabel("Educational :");
     l6.setFont(new Font("Raleway",Font.BOLD,18));
     l6.setBounds(100,270,150,30);
     add(l6);

     String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
     comboBox4 = new JComboBox(educational);
     comboBox4.setBackground(new Color(255,102,102));
     comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
     comboBox4.setBounds(350,270,320,30);
     add(comboBox4);


     JLabel l7 =new JLabel("Occupation :");
     l7.setFont(new Font("Raleway",Font.BOLD,18));
     l7.setBounds(100,320,150,30);
     add(l7);

     String occupation[] = {"Salaried","Self-Employedf","Business","Student","Retired","Other"};
     comboBox5 = new JComboBox(occupation);
     comboBox5.setBackground(new Color(255,102,102));
     comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
     comboBox5.setBounds(350,320,320,30);
     add(comboBox5);

     JLabel l8 =new JLabel("Pan No :");
     l8.setFont(new Font("Raleway",Font.BOLD,18));
     l8.setBounds(100,370,150,30);
     add(l8);

     textPan = new JTextField();
     textPan.setFont(new Font( "RaleWay",Font.BOLD,18));
     textPan.setBounds(350,370,320,30);
     add(textPan);


     JLabel l9 =new JLabel("Aadhar No :");
     l9.setFont(new Font("Raleway",Font.BOLD,18));
     l9.setBounds(100,420,150,30);
     add(l9);

     textAad = new JTextField();
     textAad.setFont(new Font( "RaleWay",Font.BOLD,18));
     textAad.setBounds(350,420,320,30);
     add(textAad);

     JLabel l10 =new JLabel("Senior Citizen :");
     l10.setFont(new Font("Raleway",Font.BOLD,18));
     l10.setBounds(100,470,180,30);
     add(l10);
    
     r1 = new JRadioButton("yes");
     r1.setFont(new Font("Raleway",Font.BOLD,14));
     r1.setBackground(new Color(255,102,102));
     r1.setBounds(350,470,100,30);
     add(r1);

     r2 = new JRadioButton("No");
     r2.setFont(new Font("Raleway",Font.BOLD,14));
     r2.setBackground(new Color(255,102,102));
     r2.setBounds(460,470,100,30);
     add(r2);

     ButtonGroup bGroup = new ButtonGroup();
     bGroup.add(r1);
     bGroup.add(r2);


     JLabel l11 =new JLabel("Existing Account :");
     l11.setFont(new Font("Raleway",Font.BOLD,18));
     l11.setBounds(100,520,180,30);
     add(l11);
    
     e1 = new JRadioButton("yes");
     e1.setFont(new Font("Raleway",Font.BOLD,14));
     e1.setBackground(new Color(255,102,102));
     e1.setBounds(350,520,100,30);
     add(e1);

     e2 = new JRadioButton("No");
     e2.setFont(new Font("Raleway",Font.BOLD,14));
     e2.setBackground(new Color(255,102,102));
     e2.setBounds(460,520,100,30);
     add(e2);

     ButtonGroup bGroup1 = new ButtonGroup();
     bGroup1.add(e1);
     bGroup1.add(e2);

     JLabel l12 =new JLabel("Form No :");
     l12.setFont(new Font("Raleway",Font.BOLD,12));
     l12.setBounds(700,10,100,30);
     add(l12);

     JLabel l13 =new JLabel(formno);
     l13.setFont(new Font("Raleway",Font.BOLD,12));
     l13.setBounds(760,10,60,30);
     add(l13);
     

     next = new JButton("Next");
     next.setFont(new Font("Raleway",Font.BOLD,14));
     next.setBackground(Color.WHITE);
     next.setForeground(Color.BLACK);
     next.setBounds(570,640,100,30);
     next.addActionListener(this);
     add(next);
 




      setLayout(null);
      setSize(850, 750);
      setLocation(450, 80);
      getContentPane().setBackground(new Color(255,102,102));
      setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inco = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();
       
       
        String pan = (String)textPan.getText();
        String addhar = (String)textAad.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "Yes";
        }else  if(r2.isSelected()){
            scitizen = "No";
        }
        String eAccount = " ";
        if(e1.isSelected()){
            eAccount = "Yes";
        }else  if(e2.isSelected()){
            eAccount = "No";
        }

        try{
          if(textPan.getText().equals("") || textAad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the fields");
          }else{
            Con1 c1 = new Con1();
            String q = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inco+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
            c1.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);  
        
        }
        }catch(Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new Signup2("");
    }
}
