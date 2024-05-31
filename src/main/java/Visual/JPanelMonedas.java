package Visual;
import Visual.Botones.Boton100;
import Visual.Botones.Boton1000;
import Visual.Botones.Boton1500;
import Visual.Botones.Boton500;

import java.awt.*;
import javax.swing.*;

public class JPanelMonedas extends JPanel {
    public JPanelMonedas(MainVisual main, int largo, int ancho) {
        super();
        setLayout(null);
        this.setBounds(0, 0, ancho/2, largo);
        Boton100 boton100 = new Boton100(main);
        boton100.setBounds(0, 10, 100, 100);
        this.add(boton100);
        Boton500 boton500 = new Boton500(main);
        boton500.setBounds(110, 10, 100, 100);
        this.add(boton500);
        Boton1000 boton1000 = new Boton1000(main);
        boton1000.setBounds(0, 120, 100, 100);
        this.add(boton1000);
        Boton1500 boton1500 = new Boton1500(main);
        boton1500.setBounds(110, 120, 100, 100);
        this.add(boton1500);

        JPanelBebidas Bebidas = new JPanelBebidas(main);
        Bebidas.setBounds(50,250,400,200);
        this.add(Bebidas);
        JPanelDulces Dulces = new JPanelDulces(main);
        Dulces.setBounds(50,450,400,200);
        this.add(Dulces);

        JPanelDeposito Billetera = new JPanelDeposito(null);
        Billetera.setBounds(220,10,200,200);
        this.add(Billetera);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
    }
}