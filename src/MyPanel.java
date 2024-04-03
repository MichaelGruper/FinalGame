import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyPanel extends JPanel {
    private int xloc, yloc;
    private Ship mainShip = new Ship(250,250,50,50);

    public MyPanel(){
        xloc = 250;
        yloc = 250;

        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                //CHANGE THESE TO BE BOOLEAN FLAGS THAT ARE TRUE WHEN PRESSING A KEY AND FALSE WHEN RELEASED
              //S key
                if(e.getKeyCode() == 87){
                    mainShip.moveYDown();
                }
                //A key
                if(e.getKeyCode() == 65){
                    mainShip.moveXDown();
                }
                //D key
                if(e.getKeyCode() == 68){
                    mainShip.moveXUp();
                }
                //W key
                if(e.getKeyCode() == 83){
                    mainShip.moveYUp();
                }
            }
        });
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        mainShip.draw(g);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        repaint();
    }
}
