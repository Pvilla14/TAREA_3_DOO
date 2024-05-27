package Visual;

import Tarea.clasebebida.CocaCola;
import Tarea.clasedulces.Serranita;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonSerranita extends JButton {
    MainVisual instanciaMain;
    public BotonSerranita(MainVisual main) {
        super();
        instanciaMain = main;
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
