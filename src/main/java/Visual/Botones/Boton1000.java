package Visual.Botones;

import Tarea.clasemoneda.Moneda1000;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class Boton1000 extends BotonUltra {
    JPanelMonedas botones;
    public Boton1000(MainVisual main, JPanelMonedas botonesMonedas) {
        super(main);
        botones = botonesMonedas;
        setImage("/Moneda1000.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se selecciono la moneda de 1000 pesos");
        instanciaMain.cargarMoneda(new Moneda1000(contadorserie + 1000));
        botones.repaint();
    }
}