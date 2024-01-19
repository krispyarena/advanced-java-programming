package swingdemo;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class App extends JFrame{

    public void initialise(){
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(0,0,155));

        //setMinimumSize(new Dimension(500,500));

        setTitle("BMW Nepal");
        setSize(420,420);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBackground(new Color(50,255,100));

        ImageIcon image = new ImageIcon("images/logo.png");
        setIconImage(image.getImage());

        //getContentPane().setBackground(new Color(0X123456));

        JLabel label = new JLabel();
        label.setText("Bavarian Motor Works");
        add(label);

        ImageIcon image1 = new ImageIcon("images/fcb.jpg");

        Border border = BorderFactory.createLineBorder(Color.MAGENTA, 3, true);

        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0X0123FF));

        label.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 20));
        label.setIconTextGap(20);
        label.setBackground(new Color(0X36013F));
        label.setOpaque(true);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // setLayout(null);
        // label.setBounds(50,50,500,300);

        pack();
    }
}
