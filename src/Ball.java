import java.awt.*;
import java.util.*;

public class Ball {
    private int size;
    private int randomR;
    private int randomG;
    private int randomB;
    private Color color;
    private int xSpeed, ySpeed;
    private int xLoc, yLoc;

    public Ball(int xLoc, int yLoc){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        size = 20;
        xSpeed = (int)(Math.random()*10 + 1);
        ySpeed = (int)(Math.random()*10);
        randomR = (int)(Math.random()*255);
        randomG = (int)(Math.random()*255);
        randomB = (int)(Math.random()*255);
        color = new Color(randomR,randomG,randomB);
    }

    public int getSize(){
        return size;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(xLoc,yLoc,size,size);
    }

    public void move(){
        xLoc += xSpeed;
        yLoc += ySpeed;
    }
    public int getXLoc(){
        return xLoc;
    }
    public int getYLoc(){
        return yLoc;
    }
    public int getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(int newSpeed){
        xSpeed *= newSpeed;
    }

    public void setYSpeed(int newSpeed){
        ySpeed *= newSpeed;
    }


}


