package Visual.Botones;

import Tarea.clasemoneda.Moneda100;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton100 extends BotonUltra {

    public Boton100(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda100.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 100 pesos");
        maquina.cargarMoneda(new Moneda100(contadorserie + 100));
        botones.repaint();
    }
}
