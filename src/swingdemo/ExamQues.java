package swingdemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Using swing components, design a form with three buttons "red", "green" and "blue" respectively.
 * WAP to handle event such that when the user clicks the button, the color of that button will be the 
 * same as its caption.
 */

public class ExamQues extends JFrame implements ActionListener{


    JButton b1, b2, b3;

    public ExamQues(){

    b1 = new JButton("Red");
    b2 = new JButton("Green");
    b3 = new JButton("Blue");

    add(b1);
    add(b2);
    add(b3);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    setSize(300,200);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            b1.setBackground(Color.red);
        }
        else if (ae.getSource() == b2){
            b2.setBackground(Color.green);
        }
        else if (ae.getSource() == b3){
            b3.setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new ExamQues();
    }
    
    
}
