package Visual.Botones;

import Tarea.clasemoneda.Moneda1000;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton1000 extends BotonUltra {

    public Boton1000(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda1000.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 1000 pesos");
        maquina.cargarMoneda(new Moneda1000(contadorserie + 1000));
        botones.repaint();
    }
}