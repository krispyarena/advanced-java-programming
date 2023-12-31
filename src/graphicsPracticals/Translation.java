package graphicsPracticals;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Translation extends JFrame{
    
    int x1 = 10, y1 = 0;
    int x2 = 100, y2 = 100;

    int tx = 100, ty = 100;

    int px1, px2, py1, py2;

    public Translation(){
        setTitle("Translation of a Line");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        px1 = x1 + tx;
        px2 = x2 + tx;
        py1 = y1 + ty;
        py2 = y2 + ty;
    }

    public void paint(Graphics graphics){
        graphics.drawLine(x1, y1, x2, y2);
        graphics.drawLine(px1, py1, px2, py2);
    }

    public static void main(String[] args) {
        new Translation();
    }
}
