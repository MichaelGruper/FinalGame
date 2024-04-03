import java.awt.*;

public class Ship {
private int xloc, yloc, width, height;

public Ship(int xloc, int yloc, int width, int height){
    this.xloc = xloc;
    this.yloc = yloc;
    this.width = width;
    this.height = height;
}

public void moveXUp(){
xloc += 2;
}
public void moveYUp(){
yloc += 2;
}
public void moveXDown(){xloc -= 2;}
    public void moveYDown(){yloc -= 2;}
public void draw(Graphics g2){
    g2.setColor(Color.black);
g2.fillOval(xloc, yloc, width, height);
}
}
