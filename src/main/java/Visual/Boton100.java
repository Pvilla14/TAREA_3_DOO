package Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton100 extends JButton {

    public Boton100() {
        super();

        // Cargar y redimensionar la imagen
        ImageIcon icon = new ImageIcon(Boton100.class.getResource("/Moneda100.png"));
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(scaledImage));

        // Ajustar el tamaño del botón
        this.setPreferredSize(new Dimension(100, 100));

        // Configurar el ActionListener
        this.addActionListener(new CrearMoneda());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

    private class CrearMoneda implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("hola");
        }
    }
}
