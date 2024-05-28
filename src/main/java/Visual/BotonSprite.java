package Visual;

import Tarea.clasebebida.Sprite;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSprite extends JButton {
    MainVisual instanciaMain;
    public BotonSprite(MainVisual main) {
        super();
        instanciaMain = main;
        this.addActionListener(new SeleccionarSprite());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Sprite.png"));
        Image scaledImage = foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image foto2 = foto.getImage();
        g.drawImage(foto2,0,0,getWidth(),getHeight(),null);
    }
    private class SeleccionarSprite implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono una bebida Sprite");
            instanciaMain.SeleccionarProducto(new Sprite(2));
        }
    }

}

