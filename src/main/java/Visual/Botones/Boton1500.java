package Visual.Botones;

import Tarea.clasemoneda.Moneda1500;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton1500 extends BotonUltra {
    private JPanelMonedas jpm;

    public Boton1500(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda1500.png");
        this.jpm = botonesMonedas; // Asignar botonesMonedas a jpm
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 1500 pesos");
        maquina.cargarMoneda(new Moneda1500(contadorserie + 1500));

        if (jpm != null) {
            jpm.sumarSaldo(1500);
            jpm.actualizarSaldo(); // Actualizar el texto del saldo en JPanelMonedas
        } else {
            System.err.println("JPanelMonedas no inicializado correctamente en Boton1500");
        }

        botones.repaint();
    }
}