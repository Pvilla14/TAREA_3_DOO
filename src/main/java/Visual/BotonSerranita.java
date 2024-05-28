package Visual;

import Tarea.clasebebida.CocaCola;
import Tarea.clasedulces.Serranita;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSerranita extends JButton {
    MainVisual instanciaMain;
    public BotonSerranita(MainVisual main) {
        super();
        instanciaMain = main;
        // Cargar y redimensionar la imagen
        ImageIcon icon = new ImageIcon(Boton100.class.getResource("/Serranita.png"));
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(scaledImage));

        // Ajustar el tamaño del botón
        this.setPreferredSize(new Dimension(100, 100));
        this.addActionListener(new SeleccionarSerranita());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

    private class SeleccionarSerranita implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono el dulce Serranita");
            instanciaMain.SeleccionarProducto(new Serranita(4));
        }
    }

}
