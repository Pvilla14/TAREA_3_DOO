package Visual;

import Tarea.Producto;
import Tarea.clasebebida.*;
import Tarea.clasedulces.*;
import javax.swing.*;
import java.awt.*;

public class JPanelComprado extends JButton {
    private JPanelExpendedor jpexp;
    private Producto productocomprado;

    public JPanelComprado(JPanelExpendedor jpalgo){
        jpexp = jpalgo;
        productocomprado = jpexp.getExpendedor().getCompra();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (productocomprado.getClass() == Fanta.class) {
            ImageIcon foto = new ImageIcon(JPanelComprado.class.getResource("/Fanta.png"));
            g.drawImage(foto.getImage(), 0,0,50,50, this);
        }
        else if(productocomprado.getClass() == CocaCola.class) {
            ImageIcon foto = new ImageIcon(JPanelComprado.class.getResource("/CocaCola.png"));
            g.drawImage(foto.getImage(), 0,0,50,50, this);
        }
        else if(productocomprado.getClass() == Sprite.class) {
            ImageIcon foto = new ImageIcon(JPanelComprado.class.getResource("/Sprite.png"));
            g.drawImage(foto.getImage(), 0,0,50,50, this);
        }
        else if(productocomprado.getClass() == Serranita.class) {
            ImageIcon foto = new ImageIcon(JPanelComprado.class.getResource("/Serranita.png"));
            g.drawImage(foto.getImage(), 0,0,50,50, this);
        }
        else if(productocomprado.getClass() == Super8.class) {
            ImageIcon foto = new ImageIcon(JPanelComprado.class.getResource("/Super8.png"));
            g.drawImage(foto.getImage(), 0,0,50,50, this);
        }
        else if(productocomprado.getClass() == Snickers.class) {
            ImageIcon foto = new ImageIcon(JPanelComprado.class.getResource("/Snickers.png"));
            g.drawImage(foto.getImage(), 0,0,50,50, this);
        }
    }
}
