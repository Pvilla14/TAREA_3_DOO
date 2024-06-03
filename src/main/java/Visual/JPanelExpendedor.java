package Visual;

import Tarea.Expendedor;
import java.awt.*;
import javax.swing.*;

public class JPanelExpendedor extends JPanel {
    private Expendedor expendedor;
    public JPanelExpendedor(MainVisual main, int largo, int ancho, Expendedor ex) {
        super();
        expendedor = ex;
        this.setLayout(null);
        this.setBounds(ancho/2,0,ancho/2,largo);

        JPanelDeposito depositoCoca = new JPanelDeposito(expendedor.getDepositos(1));
        depositoCoca.setBounds(90,80,200,50);
        depositoCoca.setOpaque(false);
        this.add(depositoCoca);

        JPanelDeposito depositoFanta = new JPanelDeposito(expendedor.getDepositos(2));
        depositoFanta.setBounds(90,150,200,50);
        depositoFanta.setOpaque(false);
        this.add(depositoFanta);

        JPanelDeposito depositoSprite = new JPanelDeposito(expendedor.getDepositos(3));
        depositoSprite.setBounds(90,215,200,50);
        depositoSprite.setOpaque(false);
        this.add(depositoSprite);

        JPanelDeposito depositoSerranita = new JPanelDeposito(expendedor.getDepositos(4));
        depositoSerranita.setBounds(90,410,200,40);
        depositoSerranita.setOpaque(false);
        this.add(depositoSerranita);

        JPanelDeposito depositoSnickers = new JPanelDeposito(expendedor.getDepositos(5));
        depositoSnickers.setBounds(90,350,200,50);
        depositoSnickers.setOpaque(false);
        this.add(depositoSnickers);

        JPanelDeposito depositoSuper8 = new JPanelDeposito(expendedor.getDepositos(6));
        depositoSuper8.setBounds(90,280,200,50);
        depositoSuper8.setOpaque(false);
        this.add(depositoSuper8);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(JPanelExpendedor.class.getResource("/Expendedor.png"));
        g.drawImage(foto.getImage(), 0, 0, Color.BLACK, this);
        Color fondo = new Color(32, 31, 34);
        setBackground(fondo);
    }

    public void ExpendedorRepintar(){
        this.repaint();
    }
}
