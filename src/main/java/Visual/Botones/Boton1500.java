package Visual.Botones;

import Tarea.clasemoneda.Moneda1500;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class Boton1500 extends BotonUltra {
    JPanelMonedas botones;
    public Boton1500(MainVisual main, JPanelMonedas botonesMonedas) {
        super(main);
        botones = botonesMonedas;
        setImage("/Moneda1500.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se selecciono la moneda de 1500 pesos");
        instanciaMain.cargarMoneda(new Moneda1500(contadorserie + 1500));
        botones.repaint();
    }
}