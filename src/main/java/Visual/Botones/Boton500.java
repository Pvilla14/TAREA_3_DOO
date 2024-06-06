package Visual.Botones;

import Tarea.clasemoneda.Moneda500;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton500 extends BotonUltra {
    private JPanelMonedas jpm;

    public Boton500(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda500.png");
        this.jpm = botonesMonedas; // Asignar botonesMonedas a jpm
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 500 pesos");
        maquina.cargarMoneda(new Moneda500(contadorserie + 500));

        if (jpm != null) {
            jpm.sumarSaldo(500);
            jpm.actualizarSaldo(); // Actualizar el texto del saldo en JPanelMonedas
        } else {
            System.err.println("JPanelMonedas no inicializado correctamente en Boton500");
        }

        botones.repaint();
    }
}