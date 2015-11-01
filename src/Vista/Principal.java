/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.PanelPersona;
import javax.swing.JFrame;

/**
 *
 * @author Yuli / Fr@n
 */
public class Principal extends JFrame{
    
    public Principal(){
        PanelPersona per = new PanelPersona();
        this.add(per);
        
        inicializar();
    }
    
    private void inicializar(){
        this.setSize(800, 600);
        this.setTitle("Inces");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    
    public static void main(String[] args) {
        new Principal();
    }
    
}
