package swingdemo;

import java.awt.Choice;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Student extends JFrame{
    
    Label hd = new Label("Student Details", Label.CENTER);

    JLabel nameLabel = new JLabel("Name", Label.LEFT);
    JTextArea nameArea = new JTextArea();

    JLabel ageLabel = new JLabel("Age", JLabel.LEFT);
    Choice ageChoice = new Choice();

    JLabel gender = new JLabel("Gender", JLabel.LEFT);
    
    JLabel address = new JLabel("Address", JLabel.LEFT);
    JLabel course = new JLabel("Course", JLabel.LEFT);
    JLabel sem = new JLabel("Semester", JLabel.LEFT);
    JLabel hobbies = new JLabel("Hobbies", JLabel.LEFT);

    JLabel l = new JLabel("", JLabel.RIGHT);



}
