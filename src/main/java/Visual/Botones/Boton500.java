package Visual.Botones;

import Tarea.clasemoneda.Moneda500;
import Visual.MainVisual;

public class Boton500 extends BotonUltra {
    public Boton500(MainVisual main) {
        super(main);
        setImage("/Moneda500.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono la moneda de 500 pesos");
        instanciaMain.cargarMoneda(new Moneda500(2));
    }
}