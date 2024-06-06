package Visual.Botones;

import Tarea.clasemoneda.Moneda100;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton100 extends BotonUltra {
    private JPanelMonedas jpm;

    public Boton100(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda100.png");
        this.jpm = botonesMonedas; // Asignar botonesMonedas a jpm
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 100 pesos");
        maquina.cargarMoneda(new Moneda100(contadorserie + 100));

        if (jpm != null) {
            jpm.sumarSaldo(100);
            jpm.actualizarSaldo(); // Actualizar el texto del saldo en JPanelMonedas
        } else {
            System.err.println("JPanelMonedas no inicializado correctamente en Boton100");
        }

        botones.repaint();
    }
}
