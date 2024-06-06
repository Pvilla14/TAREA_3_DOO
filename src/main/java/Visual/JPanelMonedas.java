package Visual;

import Tarea.clasemoneda.Moneda;
import Visual.Botones.*;
import java.awt.*;
import javax.swing.*;

public class JPanelMonedas extends JPanel {
    private int saldo = 0;
    private JTextField textosaldo; // Campo de texto para mostrar el saldo

    public JPanelMonedas(int largo, int ancho, JPanelExpendedor jpex) {
        super();
        setLayout(null);
        this.setBounds(0, 0, ancho / 2, largo);

        // Crear el campo de texto para mostrar el saldo
        textosaldo = new JTextField("Saldo: " + saldo);
        textosaldo.setBounds(30, 230, 200, 20);
        textosaldo.setEditable(false); // Hacer el campo de texto no editable
        textosaldo.setBorder(null); // Hacer que el borde del campo de texto sea invisible
        this.add(textosaldo);

        Boton100 boton100 = new Boton100(jpex, this);
        boton100.setBounds(30, 10, 100, 100);
        this.add(boton100);

        Boton500 boton500 = new Boton500(jpex, this);
        boton500.setBounds(140, 10, 100, 100);
        this.add(boton500);

        Boton1000 boton1000 = new Boton1000(jpex, this);
        boton1000.setBounds(30, 120, 100, 100);
        this.add(boton1000);

        Boton1500 boton1500 = new Boton1500(jpex, this);
        boton1500.setBounds(140, 120, 100, 100);
        this.add(boton1500);

        JPanelProducto productos = new JPanelProducto(jpex, this);
        productos.setBounds(50, 250, 400, 600);
        this.add(productos);

        JPanelDeposito billetera = new JPanelDeposito(jpex.getBilletera());
        billetera.setBounds(50, 600, 350, 100);
        billetera.setOpaque(false);
        this.add(billetera);
    }

    public void sumarSaldo(int cantidad) {
        saldo += cantidad;
    }

    public void actualizarSaldo() {
        textosaldo.setText("Saldo: " + saldo);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setOpaque(false); // Hace que el panel no sea opaco para que el fondo se vea a través de él
    }
}
