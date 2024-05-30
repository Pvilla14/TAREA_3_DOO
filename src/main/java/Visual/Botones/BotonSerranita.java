package Visual.Botones;

import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonSerranita extends BotonUltra {
    public BotonSerranita(MainVisual main) {
        super(main);
        setImage("/Serranita.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono el dulce Serranita");
        instanciaMain.SeleccionarProducto(Valoresestaticos.SERRANITA);
    }

}
