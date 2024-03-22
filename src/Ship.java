import java.awt.*;

public class Ship {
private int size, xloc, yloc, width, height;

public Ship(int xloc, int yloc, int width, int height){
    this.xloc = xloc;
    this.yloc = yloc;
    this.width = width;
    this.height = height;
}
public int getSize(){
    return size;
}

public void moveX(){
xloc += 2;
}
public void moveY(){
yloc += 2;
}
public void draw(Graphics g2){
g2.fillOval(xloc, yloc, width, height);
}
}
