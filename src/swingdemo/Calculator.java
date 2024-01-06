package swingdemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame{

    JLabel l1,l2,l3,l4;
    JTextField t1, t2;
    JButton b1,b2,b3,b4;

    Calculator(){

        setTitle("Java Arithmetic Calculator");
        l1 = new JLabel("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setBounds(60,10,300,30);
        l1.setFont(new Font("consolas", Font.BOLD, 30));
        l1.setForeground(Color.BLUE);
        add(l1);
        setLayout(null);
        setBounds(400,200,400,300);
        

        l3 = new JLabel("No 1:");
        l4 = new JLabel("No 2:");

        l3.setBounds(50,60,40,20);
        l4.setBounds(50,100,40,20);
        add(l3);
        add(l4);

        t1 = new JTextField(50);
        t2 = new JTextField(50);

        t1.setBounds(100,60,120,30);
        t2.setBounds(100,100,120,30);

        add(t1);
        add(t2);
        
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");

        b1.setBounds(100, 140, 50, 30);
        b2.setBounds(160, 140, 50, 30);
        b3.setBounds(100, 180, 50, 30);
        b4.setBounds(160, 180, 50, 30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        l2 = new JLabel();
        l2.setBounds(100,220,100,30);
        add(l2);

        setVisible(true);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                double no1 = Double.parseDouble(t1.getText());
                double no2 = Double.parseDouble(t2.getText());
                l2.setText("Answer : " + (no1+no2));
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                double no1 = Double.parseDouble(t1.getText());
                double no2 = Double.parseDouble(t2.getText());
                l2.setText("Answer : " + (no1-no2));
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                double no1 = Double.parseDouble(t1.getText());
                double no2 = Double.parseDouble(t2.getText());
                l2.setText("Answer : " + (no1*no2));
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                double no1 = Double.parseDouble(t1.getText());
                double no2 = Double.parseDouble(t2.getText());
                l2.setText("Answer : " + (no1/no2));
            }
        });
    }
}

class SimpleCalculator{
    public static void main(String[] args) {
        new Calculator();
    }
}
