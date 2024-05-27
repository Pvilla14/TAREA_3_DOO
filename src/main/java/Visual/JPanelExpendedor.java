package Visual;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class JPanelExpendedor extends JPanel {
    public JPanelExpendedor(MainVisual main) {
        super();
        this.setLayout(null);
        this.setBackground(Color.BLUE);
        this.setBounds(500,0,500,800);
        JPanelDulces Dulces = new JPanelDulces(main);
        Dulces.setBounds(50,10,400,200);
        this.add(Dulces);
        JPanelBebidas Bebidas = new JPanelBebidas(main);
        Bebidas.setBounds(50,220,400,200);
        this.add(Bebidas);


    }
}
