package Visual;

import Tarea.*;
import Tarea.clasebebida.*;
import Tarea.clasedulces.*;
import Tarea.clasemoneda.*;
import Visual.Botones.Boton100;
import javax.swing.*;
import java.awt.*;

public class JPanelDeposito extends JPanel {
    private Deposito<Producto> deposito;
    public JPanelDeposito(Deposito<Producto> depo){
        super();
        deposito = depo;
        this.setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Object depositado = deposito.getTipo();
        Object aux;
        if (depositado.getClass() == (aux = new Fanta(-1)).getClass()) {
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Fanta.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else if(depositado.getClass() == (aux = new CocaCola(-1)).getClass()) {
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/CocaCola.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else if(depositado.getClass() == (aux = new Sprite(-1)).getClass()) {
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Sprite.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else if(depositado.getClass() == (aux = new Serranita(-1)).getClass()) {
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Serranita.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else if(depositado.getClass() == (aux = new Super8(-1)).getClass()) {
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Super8.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else if(depositado.getClass() == (aux = new Snickers(-1)).getClass()) {
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Snickers.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else if(depositado.getClass() == (aux = new Moneda100(-0).getClass())){
            for(int i = 0; i < deposito.getTamaño(); i++){
                ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Moneda100.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, Color.black,this);
            }
        }
        else{
            setBackground(Color.WHITE);
        }
    }
}