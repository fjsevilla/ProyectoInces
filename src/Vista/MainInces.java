package Vista;

import Imagenes.PanelImagen;
import Modelo.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Juli / Fr@n
 */

public class MainInces extends JFrame{
    
    Menu menu;
    private Dimension dim;
    
    public MainInces(){     
        inicializar();
    }
    
    private void inicializar(){
        
        menu = new Menu();
        
        this.setJMenuBar(menu);
        this.setTitle("Sistema Automatizado de Registro INCES");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        PanelImagen panelimage = new PanelImagen();
        panelimage.CrearPanelImagen();
        setContentPane(panelimage);
        
        dim=super.getToolkit().getScreenSize();
        super.setSize(dim);               
        this.setVisible(true);
        this.setUndecorated(false);  
    }
    
    public static void main(String[] args) {
        
        try{
        UIManager.put("MenuBar.background", Color.TRANSLUCENT);
        }catch(Exception e){}
        MainInces mainInces = new MainInces();
        
    }
    
}
