package Visual;

import Tarea.clasedulces.Snickers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSnickers extends JButton {
    MainVisual instanciaMain;
    public BotonSnickers(MainVisual main) {
        super();
        instanciaMain = main;
        // Cargar y redimensionar la imagen
        ImageIcon icon = new ImageIcon(Boton100.class.getResource("/Snickers.png"));
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(scaledImage));

        // Ajustar el tamaño del botón
        this.setPreferredSize(new Dimension(100, 100));
        this.addActionListener(new SeleccionarSnickers());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

    private class SeleccionarSnickers implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono el dulce Snickers");
            instanciaMain.SeleccionarProducto(new Snickers(5));
        }
    }

}
