import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("wat de fook");

        JButton button = new JButton("Click text");

        JLabel label = new JLabel("Hello, world!");
        frame.add(label);
        label.setBounds(50,50,50,25);

        button.setBounds(100,100,100,50);
        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}