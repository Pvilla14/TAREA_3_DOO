package Visual.Botones;

import Tarea.clasemoneda.Moneda100;
import Visual.JPanelExpendedor;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class Boton100 extends BotonUltra {
    JPanelMonedas botones;
    public Boton100(MainVisual main, JPanelMonedas botonesMonedas) {
        super(main);
        botones = botonesMonedas;
        setImage("/Moneda100.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se selecciono la moneda de 100 pesos");
        instanciaMain.cargarMoneda(new Moneda100(contadorserie + 100));
        botones.repaint();
    }
}
