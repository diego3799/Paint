import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpcionesJpanel extends JPanel {
    JRadioButton puntos = new JRadioButton();
    JRadioButton lineas = new JRadioButton();
    ButtonGroup buttonGroup= new ButtonGroup();
    public OpcionesJpanel() {
        setLayout(new FlowLayout());
        //---- puntos ----
        puntos.setText("Puntos");
        puntos.setSelected(true);
        //puntos.setBackground(Color.white);
        puntos.setForeground(new Color(147, 146, 147));
        buttonGroup.add(puntos);
        add(puntos);
        //---- lineas ----
        lineas.setText("Lineas");
        //lineas.setBackground(Color.white);
        lineas.setForeground(new Color(147, 146, 147));
        buttonGroup.add(lineas);
        add(lineas);
    }
}
