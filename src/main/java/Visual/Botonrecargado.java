package Visual;

import Tarea.Expendedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Botonrecargado extends JButton {
    private Expendedor experience;
    private JPanelExpendedor j;
    private int amount;

    public Botonrecargado(JPanelExpendedor jpexp, int cant){
        super("recargar");
        experience = jpexp.getExpendedor();
        j = jpexp;
        amount = cant;
        this.addActionListener(new Recargar());
    }

    private class Recargar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            experience.recargarexpendedor(amount);
            j.revalidate();
            j.repaint();
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(BotonCompra.class.getResource("/recargar.png"));
        g.drawImage(foto.getImage(), 0, 0, 40, 40, Color.WHITE, this);
    }
}