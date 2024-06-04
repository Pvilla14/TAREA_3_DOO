package Visual;

import Tarea.*;
import Tarea.clasebebida.*;
import Tarea.clasedulces.*;
import Tarea.clasemoneda.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JPanelDeposito extends JPanel {
    private Deposito deposito;
    public JPanelDeposito(Deposito depo){
        super();
        deposito = depo;
        this.setLayout(null);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (deposito == null || deposito.getLargo() == 0) {
            // Si el depósito es null o está vacío, establecemos un fondo blanco
            setBackground(Color.WHITE);
            return;
        }

        Object depositado = deposito.getTipo();

        if (depositado.getClass() == Fanta.class) {
            for(int i = 0; i < deposito.getLargo(); i++){
                ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Fanta.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50, this);
            }
        }
        else if(depositado.getClass() == CocaCola.class) {
            for(int i = 0; i < deposito.getLargo(); i++){
                ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/CocaCola.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50,this);
            }
        }
        else if(depositado.getClass() == Sprite.class) {
            for(int i = 0; i < deposito.getLargo(); i++){
                ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Sprite.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50,this);
            }
        }
        else if(depositado.getClass() == Serranita.class) {
            for(int i = 0; i < deposito.getLargo(); i++){
                ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Serranita.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50,this);
            }
        }
        else if(depositado.getClass() == Super8.class) {
            for(int i = 0; i < deposito.getLargo(); i++){
                ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Super8.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50,this);
            }
        }
        else if(depositado.getClass() == Snickers.class) {
            for(int i = 0; i < deposito.getLargo(); i++){
                ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Snickers.png"));
                g.drawImage(foto.getImage(), 20*i,0,50,50,this);
            }
        }
        else if(depositado instanceof Moneda){
            ArrayList<Moneda> depMonedas = deposito.getDepMonedas();
            int i = 0;

            for(Moneda m : depMonedas ){
                if(m.getClass() == Moneda100.class) {
                    ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Moneda100.png"));
                    g.drawImage(foto.getImage(), 30 * i, 0, 50, 50, this);
                    i++;
                }
                else if(m.getClass() == Moneda500.class) {
                    ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Moneda500.png"));
                    g.drawImage(foto.getImage(), 30 * i, 0, 50, 50, this);
                    i++;
                }
                else if(m.getClass() == Moneda1000.class) {
                    ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Moneda1000.png"));
                    g.drawImage(foto.getImage(), 30 * i, 0, 50, 50, this);
                    i++;
                }
                else if(m.getClass() == Moneda1500.class){
                    ImageIcon foto = new ImageIcon(JPanelDeposito.class.getResource("/Moneda1500.png"));
                    g.drawImage(foto.getImage(), 30*i,0,50,50, this);
                    i++;
                }
            }
        }
        else{
            setBackground(Color.WHITE);
        }
    }
}