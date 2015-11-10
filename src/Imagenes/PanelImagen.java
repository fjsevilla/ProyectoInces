package Imagenes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class PanelImagen extends javax.swing.JPanel {
    
    @Override
    public void paintComponent (Graphics g){
    Dimension tamanio = getSize();
    ImageIcon imagenFondo = new ImageIcon(getClass().getResource
                        ("/Imagenes/FPInces.jpg"));
    g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
    setOpaque(false);
    super.paintComponent(g);
    }
    
    public void CrearPanelImagen(){
        
        this.setSize(1024,768);
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new BorderLayout(0, 0));
        setVisible(true); 
    }
    
}
