import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    private Ship mainShip = new Ship(250, 250, 50, 50);
    private ArrayList<Ball> ballArray = new ArrayList<Ball>(20);
    private int xLoc = (int) (Math.random() + 255), yLoc = (int) (Math.random() + 255);

    public MyPanel() {
        for(int i = 0;i<20;i++) {
            xLoc = (int) (Math.random() * 500);
            yLoc = (int) (Math.random() * 500);
           ballArray.add(new Ball(xLoc, yLoc));
        }

        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode());
                //S key || down arrow key
                if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
                    mainShip.moveYDown();
                }
                //A key || left arrow key
                if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
                    mainShip.moveXDown();
                }
                //D key || right arrow key
                if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
                    mainShip.moveXUp();
                }
                //W key || up arrow key
                if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
                    mainShip.moveYUp();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                //S key || down arrow key
                if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
                    mainShip.moveYStop();
                }
                //A key || left arrow key
                if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
                    mainShip.moveXStop();
                }
                //D key || right arrow key
                if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
                    mainShip.moveXStop();
                }
                //W key || up arrow key
                if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
                    mainShip.moveYStop();
                }

            }
        });


    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        mainShip.draw(g);

        for (int i = 0;i<ballArray.size();i++) {
            if(mainShip.getXLoc() == ballArray.get(i).getXLoc() && mainShip.getYLoc() == ballArray.get(i).getYLoc()){
              ballArray.remove(i);
              i--;
            }
            ballArray.get(i).draw(g);
            ballArray.get(i).move();
            if (ballArray.get(i).getXLoc() >= getWidth() - ballArray.get(i).getSize()) {
                ballArray.get(i).setXSpeed(-1);
            }
            if (ballArray.get(i).getXLoc() <= 0) {
                ballArray.get(i).setXSpeed(-1);
            }
            if (ballArray.get(i).getYLoc() >= getHeight() - ballArray.get(i).getSize()) {
                ballArray.get(i).setYSpeed(-1);
            }
            if (ballArray.get(i).getYLoc() <= 0) {
                ballArray.get(i).setYSpeed(-1);
            }
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        repaint();
    }
}


