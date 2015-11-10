/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.awt.GridLayout;
import javax.swing.JPanel;


/**
 *
 * @author Yuli / Fr@n
 */
public class PanelDatos extends JPanel{
    
    CampoTexto nombre, apellido, cedula, telefono, celular;
    AreaTexto direccion;
    
    public PanelDatos(){
        inicializar();
    }
    
    private void inicializar(){
        
        cedula = new CampoTexto(15, "Cedula: ");
        nombre = new CampoTexto(15, "Nombres: ");
        apellido = new CampoTexto(15,  "Apellidos: ");
        telefono = new CampoTexto(15, "Telefono Habitacion: ");
        celular = new CampoTexto(15, "Celular: ");
        direccion = new AreaTexto(2, 15, "Direccion: ");
        
        this.setLayout(new GridLayout(6,1,0,0));
        this.add(cedula);
        this.add(nombre);
        this.add(apellido);
        this.add(telefono);
        this.add(celular);
        this.add(direccion);
        
               
       this.setMaximumSize(new java.awt.Dimension(50, 250));       
       this.setMinimumSize(new java.awt.Dimension(50, 220));       
       this.setPreferredSize(new java.awt.Dimension(50, 230));
    }
}
