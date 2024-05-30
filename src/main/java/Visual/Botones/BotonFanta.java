package Visual.Botones;


import Tarea.Valoresestaticos;
import Visual.MainVisual;

public class BotonFanta extends BotonUltra {
    public BotonFanta(MainVisual main) {
        super(main);
        setImage("/Fanta.png");
    }

    @Override
    public void crearElemento() {
        System.out.println("Se selecciono una bebida Fanta");
        instanciaMain.SeleccionarProducto(Valoresestaticos.FANTA);
    }
}