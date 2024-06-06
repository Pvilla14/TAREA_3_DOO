package Visual.Botones;

import Tarea.clasemoneda.Moneda1500;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton1500 extends BotonUltra {

    public Boton1500(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda1500.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se seleccionó la moneda de 1500 pesos");
        maquina.cargarMoneda(new Moneda1500(contadorserie + 1500));
        botones.repaint();
    }
}