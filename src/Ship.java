import java.awt.*;

public class Ship {
private int xloc, yloc, width, height, xMove, yMove, centerPoint;
private double radius;


public Ship(int xloc, int yloc, int width, int height){
    this.xloc = xloc;
    this.yloc = yloc;
    this.width = width;
    this.height = height;
    centerPoint = 25;
}

public void moveXUp(){
//xloc += 5;
    xMove = 5;
}
public void moveYUp(){
    yMove = 5;
}
public void moveXDown(){xMove = -5;}
    public void moveYDown(){yMove = -5;}

    public void moveXStop(){
    xMove = 0;
    }

    public void moveYStop(){
    yMove = 0;
    }

    public int getXLoc(){
    return xloc;
    }

    public int getYLoc() {
    return yloc;
    }
    public double getRadius(){
    return 25;
    }
public void draw(Graphics g2){
    xloc += xMove;
    yloc += yMove;
    g2.setColor(Color.cyan);
g2.fillOval(xloc, yloc, width, height);
}
}
