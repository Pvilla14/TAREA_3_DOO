package Visual;

import java.awt.*;
import java.util.ArrayList;
import Tarea.clasemoneda.*;
import Tarea.*;
import Tarea.mensajeerror.*;
import javax.swing.*;
import java.awt.event.*;

public class BotonCompra extends JButton {
    private Deposito<Moneda> billeteralocal;
    private int totaldinero = 0;
    private Valoresestaticos productoseleccionado;
    public Expendedor maquina;
    private JPanelExpendedor visualExpendedor;
    private JPanelMonedas visualBotones;

    public BotonCompra(JPanelMonedas botones, JPanelExpendedor maquinavisual) {
        super();
        visualExpendedor = maquinavisual;
        visualBotones = botones;
        this.addActionListener(new ConfirmarCompra());
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(BotonCompra.class.getResource("/Comprar.png"));
        g.drawImage(foto.getImage(), 0, 0, 210, 210, Color.WHITE, this);
    }

    private class ConfirmarCompra implements ActionListener {
        public void Comprar() throws Exception {
            billeteralocal = visualExpendedor.getBilletera();
            productoseleccionado = visualExpendedor.getCompra();
            maquina = visualExpendedor.getExpendedor();
            totaldinero = 0; // Reiniciar totaldinero
            if(billeteralocal.getLargo() != 0) {
                ArrayList<Moneda> monedero = billeteralocal.getDepMonedas();
                for (Moneda m : monedero) {
                    totaldinero += m.getValor();
                }
                System.out.println(totaldinero);
            }
            if(totaldinero >= productoseleccionado.getCoste()){
                try {
                    Comprador sujeto = new Comprador(billeteralocal, productoseleccionado, maquina);
                } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException | ProductoInexistenteException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Dinero insuficiente para realizar la compra.");
            }

            // Actualizar los paneles
            visualBotones.revalidate();
            visualBotones.repaint();
            visualExpendedor.revalidate();
            visualExpendedor.repaint();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Comprar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage());
            }
        }
    }
}
