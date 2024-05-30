package Visual.Botones;

import Visual.MainVisual;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class BotonUltra extends JButton {
    private Image foto2;
    protected MainVisual instanciaMain;
    public BotonUltra(MainVisual main){
        super();
        instanciaMain = main;
        // Configurar el ActionListener
        this.addActionListener(new BotonUltra.CrearElemento());

        // Configurar el layout del botón
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setVerticalTextPosition(SwingConstants.BOTTOM);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(foto2,0,0,getWidth(),getHeight(),null);
    }

    public void setImage(String archivo){
        ImageIcon foto = new ImageIcon(Boton100.class.getResource(archivo));
        Image scaledImage = foto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        foto2 = foto.getImage();
    }

    public abstract void crearElemento();
    private class CrearElemento implements ActionListener {
        @Override
        public  void actionPerformed(ActionEvent ae) {
            crearElemento();
        }
    }
}
