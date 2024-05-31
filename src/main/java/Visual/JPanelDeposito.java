package Visual;

import Tarea.*;
import Visual.Botones.Boton100;
import javax.swing.*;
import java.awt.*;

public class JPanelDeposito extends JPanel {
    private Deposito<Producto> deposito = new Deposito<Producto>();
    public JPanelDeposito(Deposito<Producto> depo){
        super();
        deposito = depo;
        this.setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Moneda.png"));
        foto.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        //g.drawImage(foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH), 0, 0, this);
        //Image foto2 = foto.getImage();
        //g.drawImage(foto.getImage(), 0,0,this);
        g.drawImage(foto.getImage(), 0,0,200,200, Color.black,this);

    }
}