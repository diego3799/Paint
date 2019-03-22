import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
public class DibujoJframe extends JFrame{
    OpcionesJpanel opcionesJpanel= new OpcionesJpanel();
    JTextArea jTextArea;
    DibujoJpanel dibujoJpanel= new DibujoJpanel();
    JButton colores= new JButton();
    Color color=(Color.BLACK);
    public DibujoJframe(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 204, 255));
        setTitle("DAHZ_Paint");
        colores.setBackground(Color.white);
        add(colores, BorderLayout.EAST);
        jTextArea=new JTextArea();
        colores.setText("Colores");
        colores.setBackground(Color.white);
        add(colores, BorderLayout.EAST);
        add(opcionesJpanel, BorderLayout.NORTH);
        add(dibujoJpanel, BorderLayout.CENTER);
       // add(jTextArea,BorderLayout.SOUTH);
        colores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color= JColorChooser.showDialog(null,"Pick your color:",color);
                if (color==null)
                    color=(Color.BLACK);
                dibujoJpanel.setColor(color);
            }
        });
        opcionesJpanel.lineas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dibujoJpanel.setKnowhow(false);
                if (!dibujoJpanel.getknowhow())
                jTextArea.append("false");
            }
        });
        opcionesJpanel.puntos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dibujoJpanel.setKnowhow(true);
               if (dibujoJpanel.getknowhow())
                    jTextArea.append("true");
            }
        });
    }
}