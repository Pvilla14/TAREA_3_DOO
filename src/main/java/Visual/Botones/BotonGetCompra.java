package Visual.Botones;

import Tarea.Expendedor;
import Tarea.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonGetCompra extends JButton {
    private Expendedor maquina;

    public BotonGetCompra(Expendedor ex){
        super("recoger");
        maquina = ex;
        this.addActionListener(new AgarrarProducto());
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(BotonGetCompra.class.getResource("/recoger.png"));
        g.drawImage(foto.getImage(), 0,0, 40,40, Color.black, this);
    }

    private class AgarrarProducto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Producto comprado = maquina.Compra;
            System.out.println(comprado);
            System.out.println(comprado.Consumir());
            maquina.Compra = null;
        }
    }
}