package Visual;

import Tarea.Deposito;
import Tarea.Expendedor;
import Tarea.clasemoneda.Moneda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonVuelto extends JButton {
    private Expendedor maquina;
    private JPanelExpendedor visual;
    private JPanelDeposito vuelto;
    private Deposito<Moneda> monedas_en_maquina;

    public BotonVuelto(Expendedor ex, JPanelExpendedor maquinaVisual, JPanelDeposito depVuelto){
        maquina = ex;
        vuelto = depVuelto;
        visual = maquinaVisual;
        monedas_en_maquina = ex.getVuelto();
        this.addActionListener(new apretable());
    }
    public void retirarvuelto(){;}
    private class apretable implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            visual.billetera = monedas_en_maquina;
            System.out.println(visual.billetera);
            maquina.vaciarVuelto();
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
