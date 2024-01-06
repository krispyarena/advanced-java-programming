package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator1 extends JFrame {
    private JTextField numField1, numField2, resultField;
    private JButton operationButton;

    public Calculator1() {
        // FrameSetup
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(4, 2));

        // TextFeilds Creation
        numField1 = new JTextField();
        numField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        // Button Creation
        operationButton = new JButton("Press and Release");

        // Add components to the frame
        add(new JLabel("Number 1:"));
        add(numField1);
        add(new JLabel("Number 2:"));
        add(numField2);
        add(new JLabel("Result:"));
        add(resultField);
        add(operationButton);

        // Add action listeners to the button
        operationButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculate('+');
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                calculate('-');
            }
        });
    }

    private void calculate(char operation) {
        try {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
            }

            resultField.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator1().setVisible(true);
            }
        });
    }
}
