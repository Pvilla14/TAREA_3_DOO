package Visual.Botones;

import Tarea.clasemoneda.Moneda1000;
import Visual.MainVisual;

public class Boton1000 extends BotonUltra {

    public Boton1000(MainVisual main) {
        super(main);
        setImage("/Moneda1000.png");
    }

    @Override
    public void crearElemento() throws Exception {
        instanciaMain.cargarMoneda(new Moneda1000(1));
    }
}