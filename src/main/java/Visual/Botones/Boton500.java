package Visual.Botones;

import Tarea.clasemoneda.Moneda500;
import Visual.JPanelMonedas;
import Visual.MainVisual;

public class Boton500 extends BotonUltra {
    JPanelMonedas botones;
    public Boton500(MainVisual main, JPanelMonedas botonesMonedas) {
        super(main);
        botones = botonesMonedas;
        setImage("/Moneda500.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se selecciono la moneda de 500 pesos");
        instanciaMain.cargarMoneda(new Moneda500(contadorserie + 500));
        botones.repaint();
    }
}