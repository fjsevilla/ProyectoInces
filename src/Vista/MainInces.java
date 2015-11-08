package Vista;

import Imagenes.PanelImagen;
import Modelo.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Juli / Fr@n
 */

public class MainInces extends JFrame{
    
    Menu menu;
    
    public MainInces(){     
        inicializar();
    }
    
    private void inicializar(){
        
        menu = new Menu();
        
        this.setSize(800, 600);
        this.setJMenuBar(menu);
        this.setTitle("Inces");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        PanelImagen panelimage = new PanelImagen();
        panelimage.CrearPanelImagen();
        setContentPane(panelimage);
        //this.setUndecorated(true);
        
        this.add(new PanelCursos());
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        
        try{
        UIManager.put("MenuBar.background", Color.TRANSLUCENT);
        }catch(Exception e){}
        MainInces mainInces = new MainInces();
        
    }
    
}
