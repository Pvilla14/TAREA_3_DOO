package Visual;

import Tarea.clasemoneda.Moneda1500;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton1500 extends JButton {
    MainVisual instanciaMain;
    public Boton1500(MainVisual main) {
        super();
        instanciaMain = main;
        // Configurar el ActionListener
        this.addActionListener(new CrearMoneda());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(Boton100.class.getResource("/Moneda1500.png"));
        Image scaledImage = foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image foto2 = foto.getImage();
        g.drawImage(foto2,0,0,getWidth(),getHeight(),null);
    }
    private class CrearMoneda implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Se selecciono la moneda de 1500 pesos");
            instanciaMain.cargarMoneda(new Moneda1500(4));
        }
    }
}