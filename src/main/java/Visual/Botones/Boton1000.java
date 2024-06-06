package Visual.Botones;

import Tarea.clasemoneda.Moneda1000;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton1000 extends BotonUltra {
    private JPanelMonedas jpm;

    public Boton1000(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda1000.png");
        this.jpm = botonesMonedas; // Asignar botonesMonedas a jpm
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 1000 pesos");
        maquina.cargarMoneda(new Moneda1000(contadorserie + 1000));

        if (jpm != null) {
            jpm.sumarSaldo(1000);
            jpm.actualizarSaldo(); // Actualizar el texto del saldo en JPanelMonedas
        } else {
            System.err.println("JPanelMonedas no inicializado correctamente en Boton1000");
        }

        botones.repaint();
    }
}