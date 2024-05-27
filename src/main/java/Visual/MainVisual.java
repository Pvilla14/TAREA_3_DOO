package Visual;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import Tarea.clasemoneda.Moneda;

import javax.swing.*;

public class MainVisual {
    private Moneda moneda = null;
    public static void main(String[] args) {
        MainVisual instanciamain = new MainVisual();
        Pantalla pantalla = new Pantalla(instanciamain);
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void cargarMoneda(Moneda m){
        moneda = m;
    }
}
