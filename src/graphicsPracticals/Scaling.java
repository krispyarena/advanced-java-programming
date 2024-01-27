package graphicsPracticals;

import java.awt.Graphics;
import javax.swing.JFrame;

class Scaling extends JFrame{
  int x1 = 50, y1 = 50;
  int x2 = 100, y2 = 100;

  int sx = 4, sy = 4;

  int px1, py1, px2, py2;

  public Scaling(){
    setTitle("Scaling of Line");
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    px1 = x1*sx;
    px2 = x2*sx;
    
    py1 = y1*sy;
    py2 = y2*sy;
  }

  public void paint(Graphics graphics){
    graphics.drawLine(x1,y1,x2,y2);
    graphics.drawLine(px1, py1, px2, py2);
  }

  static public void main(String[] args){
    new Scaling();
  }
}
