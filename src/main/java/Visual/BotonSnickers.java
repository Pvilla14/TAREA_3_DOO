package Visual;

import Tarea.Valoresestaticos;
import javax.swing.*;
import java.awt.*;
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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Snickers.png"));
        Image scaledImage = foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image foto2 = foto.getImage();
        g.drawImage(foto2,0,0,getWidth(),getHeight(),null);
    }
    private class SeleccionarSnickers implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono el dulce Snickers");
            instanciaMain.SeleccionarProducto(Valoresestaticos.SNICKERS);
        }
    }

}
