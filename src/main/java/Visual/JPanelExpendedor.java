package Visual;
import java.awt.*;
import javax.swing.*;

public class JPanelExpendedor extends JPanel {
    public JPanelExpendedor(MainVisual main) {
        super();
        this.setLayout(null);
        this.setBounds(500,0,500,800);
        JPanelDulces Dulces = new JPanelDulces(main);
        Dulces.setBounds(50,10,400,200);
        this.add(Dulces);
        JPanelBebidas Bebidas = new JPanelBebidas(main);
        Bebidas.setBounds(50,220,400,200);
        this.add(Bebidas);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLUE);
    }
}
