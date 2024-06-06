package Visual;

import Tarea.Deposito;
import Tarea.Expendedor;
import Tarea.clasemoneda.Moneda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BotonVuelto extends JButton {
    private Expendedor maquina;
    private JPanelExpendedor visual;
    private JPanelDeposito vuelto;
    private Deposito<Moneda> monedas_en_maquina;
    Pantalla pantalla;

    public BotonVuelto(Expendedor ex, JPanelExpendedor maquinaVisual, JPanelDeposito depVuelto, Pantalla jframe){
        maquina = ex;
        vuelto = depVuelto;
        visual = maquinaVisual;
        monedas_en_maquina = ex.getVuelto();
        pantalla = jframe;
        this.addActionListener(new apretable());
    }
    public void retirarvuelto(){;}
    private class apretable implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList<Moneda> aux =monedas_en_maquina.getDepMonedas();
            for(Moneda m : aux){
                visual.billetera.addElemento(m);
            }
            maquina.vaciarVuelto();
            pantalla.revalidate();
            pantalla.repaint();
            visual.revalidate();
            visual.repaint();
            vuelto.revalidate();
            vuelto.repaint();
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(JPanelExpendedor.class.getResource("/ObtenerVuelto.png"));
        g.drawImage(foto.getImage(),0,0,40,40,this);
    }
}
