package Visual;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class Pantalla extends JFrame{
    public Pantalla(){
        super();
        setTitle("Pantalla");
        this.setLayout(null);

        this.add(new JPanelExpendedor());
        this.add(new JPanelMonedas());
        this.add(new Boton100());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }

}
