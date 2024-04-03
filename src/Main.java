import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        frame.add(panel);
        frame.setVisible(true);
    }
}