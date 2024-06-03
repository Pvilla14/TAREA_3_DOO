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
    public BotonCompra(Deposito<Moneda> billetera, Valoresestaticos compra, Expendedor exp, JPanelMonedas botones, JPanelExpendedor maquinavisual) {
        super();
        billeteralocal = billetera;
        productoseleccionado = compra;
        maquina = exp;
        visualBotones = botones;
        visualExpendedor = maquinavisual;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon foto = new ImageIcon(BotonCompra.class.getResource("/Comprar.png"));
        g.drawImage(foto.getImage(), 0, 0,210, 210, Color.WHITE, this);
    }
    private class ConfirmarCompra implements ActionListener {
        public void Comprar() throws Exception{
            if(billeteralocal.getLargo() != 0 && productoseleccionado != null) {
                ArrayList<Moneda> monedero = billeteralocal.getDepMonedas();
                for(Moneda m: monedero) {
                    totaldinero += m.getValor();
                    if(totaldinero > productoseleccionado.getCoste()){
                        try {
                            Comprador sujeto = new Comprador(billeteralocal, productoseleccionado, maquina);
                        }
                        catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException | ProductoInexistenteException ex){
                            System.out.println(ex.getMessage());
                        }
                    }
                }
            }//agregar excepcion de ambos casos xd
            visualBotones.repaint();
            visualExpendedor.repaint();
        }

        @Override
        public void actionPerformed(ActionEvent e)  {
           // this.Comprar();
        }
    }

}
