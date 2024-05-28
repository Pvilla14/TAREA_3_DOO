package Visual;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;
public class JPanelMonedas extends JPanel {
    public JPanelMonedas(MainVisual main) {
        super();
        setLayout(null);
        this.setBounds(0, 0, 500, 800);
        Boton100 boton100 = new Boton100(main);
        boton100.setBounds(50, 10, 100, 100);
        this.add(boton100);
        Boton500 boton500 = new Boton500(main);
        boton500.setBounds(160, 10, 100, 100);
        this.add(boton500);
        Boton1000 boton1000 = new Boton1000(main);
        boton1000.setBounds(50, 120, 100, 100);
        this.add(boton1000);
        Boton1500 boton1500 = new Boton1500(main);
        boton1500.setBounds(160, 120, 100, 100);
        this.add(boton1500);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
    }
}