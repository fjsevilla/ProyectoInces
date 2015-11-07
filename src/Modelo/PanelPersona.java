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
public class PanelPersona extends JPanel{
    
    CampoTexto nombre, apellido, cedula, telefono, celular;
    AreaTexto direccion;
    
    public PanelPersona(){
        inicializar();
    }
    
    private void inicializar(){
        cedula = new CampoTexto(10, "Cedula: ");
        nombre = new CampoTexto(30, "Nombres: ");
        apellido = new CampoTexto(30,  "Apellidos: ");
        telefono = new CampoTexto(15, "Telefono Habitacion: ");
        celular = new CampoTexto(15, "Celular: ");
        direccion = new AreaTexto(4, 50, "Direccion: ");
        
        this.setLayout(new GridLayout(8,1));
        this.add(cedula);
        this.add(nombre);
        this.add(apellido);
        this.add(telefono);
        this.add(celular);
        this.add(direccion);
    }
    
    
}
