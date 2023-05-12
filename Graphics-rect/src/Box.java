import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {
    int Box2X = 250;
    int Box2Y = 10;

           @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(10,20,100,100);
        g.setColor(Color.black);
        g.fillRect(200,20,50,50);
           }
}
