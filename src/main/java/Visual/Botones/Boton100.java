package Visual.Botones;

import Tarea.clasemoneda.Moneda100;
import Visual.MainVisual;

public class Boton100 extends BotonUltra {
    public Boton100(MainVisual main) {
        super(main);
        setImage("/Moneda100.png");
    }

    @Override
    public void crearElemento() {
        contadorserie += 1;
        System.out.println("Se selecciono la moneda de 100 pesos");
        instanciaMain.cargarMoneda(new Moneda100(contadorserie + 100));
    }
}
