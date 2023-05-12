

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();//creates frame object
        frame.setTitle("hello world from setTitle"); // sets title
        frame.setSize(400,400);

        frame.getContentPane().setBackground(Color.RED);

        JButton button = new JButton("click this shit");
        button.setBounds(100,100,200,200);
        frame.add( button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program after the window is crossed
        frame.setResizable(false); //wont let the frame resize
        frame.setLayout(null);
        frame.setVisible(true);
    }
}