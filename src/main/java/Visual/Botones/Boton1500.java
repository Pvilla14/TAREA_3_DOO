package Visual.Botones;

import Tarea.clasemoneda.Moneda1500;
import Visual.MainVisual;

public class Boton1500 extends BotonUltra {
    public Boton1500(MainVisual main) {
        super(main);
        setImage("/Moneda1500.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono la moneda de 1500 pesos");
        instanciaMain.cargarMoneda(new Moneda1500(2));
    }
}