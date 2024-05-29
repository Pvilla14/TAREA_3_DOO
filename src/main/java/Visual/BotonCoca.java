package Visual;

import Tarea.Valoresestaticos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonCoca extends JButton {
    MainVisual instanciaMain;
    public BotonCoca(MainVisual main) {
        super();
        instanciaMain = main;

        //Añadir el Listener
        this.addActionListener(new SeleccionarCoca());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(Boton100.class.getResource("/CocaCola.png"));
        Image scaledImage = foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image foto2 = foto.getImage();
        g.drawImage(foto2,0,0,getWidth(),getHeight(),null);
    }

    private class SeleccionarCoca implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono la bebida Cocacola");
            instanciaMain.SeleccionarProducto(Valoresestaticos.COCA);
        }
    }

}
