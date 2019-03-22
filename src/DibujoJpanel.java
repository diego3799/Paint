import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class DibujoJpanel extends JPanel {
    Punto punto = new Punto();
    Linea linea = new Linea();
    Color color = Color.BLACK;

    int x, y,x1,y1, x2, y2;
    private boolean knowhow=true;//true== puntos false== lineas

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean getknowhow(){
        return knowhow;
    }
    public void setKnowhow(boolean knowhow) {
        this.knowhow = knowhow;
        x=0;y=0;x2=0;y2=0;
    }
    public DibujoJpanel() {
        //setLayout(null);
        setBackground(Color.black);
        addMouseListener(new AnnonymousMouse() {
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
            }
            public void mousePressed(MouseEvent e) {
                x1= e.getX();
                y1= e.getY();
            }
            public void mouseClicked(MouseEvent e) {
                x=e.getX();
                y=e.getY();
            }
        });

    }
    public void paint(Graphics g) {
      //  if(knowhow){
        if (knowhow){
            g.setColor(color);
            if(x!=0&&y!=0)
            {
                g.fillOval(x,y,10,10);
                x=0;y=0;
            }
            repaint();
        }

        else{
            g.setColor(color);
            if(x1!=0&&y1!=0&&x2!=0&&y2!=0){
                g.drawLine(x1,y1,x2,y2);
                x1=0;y1=0;x2=0;y2=0;
            }
            repaint();
        }
    }
}
