package Electricity;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener{
    
    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About(){
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180,430,120,20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        s = "About Project"
            +"This project system eliminates the need for maintaining paper"
            + "electricity bills, as all the electricity bill records are" 
            + "managed electronically. The administrator doesn't have to keep"
            + "a manual track of the users. The system automatically calculates" 
            + "fines, and users don't have to visit the office for bill payment."
            + "There is no need for a delivery boy to deliver bills to the user's"
            + "place. Thus, it saves human efforts and resources.";

        TextArea t1 = new TextArea(s, 10,40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);

        l1.setBounds(170,10,180,80);
        l1.setForeground(Color.red);

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(700,220,500,550);

        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        dispose();
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
