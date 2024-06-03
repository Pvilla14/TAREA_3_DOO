package Visual;
import Tarea.Expendedor;
import Tarea.Valoresestaticos;

import javax.swing.*;

public class Pantalla extends JFrame{
    public JPanelExpendedor maquinaexpendedora;
    public JPanelMonedas maquinabotones;
    public Pantalla(MainVisual main, Expendedor ex) {
        super();
        this.setSize(1000,800);
        int ancho = this.getWidth();
        int largo = this.getHeight();
        setTitle("Pantalla");
        this.setLayout(null);

        maquinaexpendedora = new JPanelExpendedor(main, largo, ancho, ex);
        this.add(maquinaexpendedora);

        maquinabotones = new JPanelMonedas(main, largo, ancho, maquinaexpendedora);
        this.add(maquinabotones);

        BotonCompra compra = new BotonCompra(main.getBilletera(), main.producto, ex, maquinabotones, maquinaexpendedora);
        compra.setBounds(260, 10, 210, 210);
        this.add(compra);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}