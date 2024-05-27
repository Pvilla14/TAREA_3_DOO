package Visual;

import Tarea.clasedulces.Snickers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSnickers extends JButton {
    MainVisual instanciaMain;
    public BotonSnickers(MainVisual main) {
        super();
        instanciaMain = main;
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
