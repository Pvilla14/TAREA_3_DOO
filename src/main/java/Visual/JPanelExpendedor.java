package Visual;
import Visual.Botones.Boton100;

import java.awt.*;
import javax.swing.*;

public class JPanelExpendedor extends JPanel {
    public JPanelExpendedor(MainVisual main, int largo, int ancho) {
        super();
        this.setLayout(null);
        this.setBounds(ancho/2,0,ancho/2,largo);
        /*JPanelDulces Dulces = new JPanelDulces(main);
        Dulces.setBounds(50,10,400,200);
        this.add(Dulces);
        JPanelBebidas Bebidas = new JPanelBebidas(main);
        Bebidas.setBounds(50,220,400,200);
        this.add(Bebidas);*/
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(JPanelExpendedor.class.getResource("/Expendedor.png"));
        g.drawImage(foto.getImage(), 0, 0, Color.BLACK, this);
    }
}
