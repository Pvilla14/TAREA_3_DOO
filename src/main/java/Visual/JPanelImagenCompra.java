package Visual;

import Tarea.Expendedor;
import Tarea.Producto;
import Tarea.clasebebida.CocaCola;
import Tarea.clasebebida.Fanta;
import Tarea.clasebebida.Sprite;
import Tarea.clasedulces.Serranita;
import Tarea.clasedulces.Snickers;
import Tarea.clasedulces.Super8;

import javax.swing.*;
import java.awt.*;

public class JPanelImagenCompra extends JPanel {
    private Expendedor maquina;

    public JPanelImagenCompra(Expendedor exp){
        maquina = exp;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Producto comprado = maquina.Compra;
        System.out.println("   " +comprado);
        setVisible(true);
        if(comprado == null){
            setVisible(true);
        }
        else if (comprado.getClass() == Fanta.class) {
            ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Fanta.png"));
            g.drawImage(foto.getImage(), 0,0,50,50,this);
            setVisible(true);
        }
        else if(comprado.getClass() == CocaCola.class) {
            ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/CocaCola.png"));
            g.drawImage(foto.getImage(), 0,0,50,50,this);
            setVisible(true);
        }
        else if(comprado.getClass() == Sprite.class) {
            ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Sprite.png"));
            g.drawImage(foto.getImage(), 0,0,50,50,this);
            setVisible(true);
        }
        else if(comprado.getClass() == Serranita.class) {
            ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Serranita.png"));
            g.drawImage(foto.getImage(), 0,0,50,50,this);
            setVisible(true);
        }
        else if(comprado.getClass() == Super8.class) {
            ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Super8.png"));
            g.drawImage(foto.getImage(), 0,0,50,50,this);
            setVisible(true);
        }
        else if(comprado.getClass() == Snickers.class) {
            ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Snickers.png"));
            g.drawImage(foto.getImage(), 0,0,50,50,this);
            setVisible(true);
        }
    }
}
