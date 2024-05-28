package Visual;

import Tarea.clasebebida.Fanta;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonFanta extends JButton {
    MainVisual instanciaMain;
    public BotonFanta(MainVisual main) {
        super();
        instanciaMain = main;

        this.addActionListener(new SeleccionarFanta());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Fanta.png"));
        Image scaledImage = foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image foto2 = foto.getImage();
        g.drawImage(foto2,0,0,getWidth(),getHeight(),null);
    }
    private class SeleccionarFanta implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono la bebida Fanta");
            instanciaMain.SeleccionarProducto(new Fanta(3));
        }
    }

}
