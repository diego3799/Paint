import java.awt.*;

public class Punto extends Geometria {
    int x,y;
    public void dibujar(Graphics g){
        g.fillOval(x,y,30,30);
        g.setColor(Color.red);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
