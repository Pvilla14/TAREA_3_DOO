package Visual;

import Tarea.clasemoneda.Moneda;
import Tarea.clasemoneda.Moneda1000;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton1000 extends JButton {
    MainVisual instanciaMian;
    public Boton1000(MainVisual main) {
        super();
        instanciaMian = main;
        // Cargar y redimensionar la imagen
        ImageIcon icon = new ImageIcon(Boton1000.class.getResource("/Moneda1000.png"));
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
            System.out.println("Se selecciono la moneda de 1000 pesos");
            instanciaMian.cargarMoneda(new Moneda1000());
        }
    }
}