import java.awt.*;
public class Linea extends Geometria {
    int x,y,x2,y2;
    public void dibujar(Graphics g){
        g.drawLine(x,y,x2,y2);
        g.setColor(Color.red);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
}
