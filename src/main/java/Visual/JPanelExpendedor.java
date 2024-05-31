package Visual;
import java.awt.*;
import javax.swing.*;

public class JPanelExpendedor extends JPanel {
    public JPanelExpendedor(MainVisual main) {
        super();
        this.setLayout(null);
        this.setBounds(500, 0, 500, 800);
        JPanelProducto producto = new JPanelProducto(main);
        producto.setBounds(50, 10, 400, 600);
        this.add(producto);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLUE);
    }
}
