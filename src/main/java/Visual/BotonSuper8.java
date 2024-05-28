package Visual;

import Tarea.clasebebida.CocaCola;
import Tarea.clasedulces.Super8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSuper8 extends JButton {
    MainVisual instanciaMain;
    public BotonSuper8(MainVisual main) {
        super();
        instanciaMain = main;
        // Cargar y redimensionar la imagen
        ImageIcon icon = new ImageIcon(Boton100.class.getResource("/Super8.png"));
        Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(scaledImage));

        // Ajustar el tamaño del botón
        this.setPreferredSize(new Dimension(100, 100));
        this.addActionListener(new SeleccionarSuper8());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }

    private class SeleccionarSuper8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono el dulce Super8");
            instanciaMain.SeleccionarProducto(new Super8(6));
        }
    }

}
