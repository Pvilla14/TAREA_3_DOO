package Visual;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;
public class JPanelMonedas extends JPanel {
    public JPanelMonedas() {
        super();
        setLayout(null);
        this.setBackground(Color.BLACK);
        this.setBounds(0, 0, 500, 800);
        Boton100 boton100 = new Boton100();
        boton100.setBounds(50, 10, 100, 100);
        this.add(boton100);
        Boton500 boton500 = new Boton500();
        boton500.setBounds(160, 10, 100, 100);
        this.add(boton500);
    }
}