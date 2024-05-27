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
        // Cargar y redimensionar la imagen
        ImageIcon icon = new ImageIcon(Boton100.class.getResource("/Sprite.png"));
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(scaledImage));

        // Ajustar el tamaño del botón
        this.setPreferredSize(new Dimension(100, 100));
        this.addActionListener(new SeleccionarSprite());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

    private class SeleccionarSprite implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono una bebida Sprite");
            instanciaMain.SeleccionarProducto(new Sprite(2));
        }
    }

}

