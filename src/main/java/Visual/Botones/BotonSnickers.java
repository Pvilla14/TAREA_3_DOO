package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonSnickers extends BotonUltra {
    public BotonSnickers(MainVisual main) {
        super(main);
        setImage("/Snickers.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono el dulce Snickers");
        instanciaMain.SeleccionarProducto(Valoresestaticos.SNICKERS);
    }
}
