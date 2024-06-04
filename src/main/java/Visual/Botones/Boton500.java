package Visual.Botones;

import Tarea.clasemoneda.Moneda500;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;

public class Boton500 extends BotonUltra {
    public Boton500(JPanelExpendedor expendedor, JPanelMonedas botonesMonedas) {
        super(expendedor, botonesMonedas);
        setImage("/Moneda500.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se selecciono la moneda de 500 pesos");
        maquina.cargarMoneda(new Moneda500(contadorserie + 500));
        botones.repaint();
    }
}