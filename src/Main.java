import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame frame = new JFrame();
        JLabel timer = new JLabel();
        JLabel label = new JLabel("Best Time: ");
        frame.setSize(500,500);

        frame.add(panel);
        frame.setVisible(true);
    }
}