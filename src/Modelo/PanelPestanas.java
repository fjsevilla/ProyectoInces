/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JTabbedPane;

/**
 *
 * @author Yuli / Fr@n
 */
public class PanelPestanas extends JTabbedPane{
    
    PanelDatos persona;
    Cursos cursos;
    Inscripcion inscripcion;
    
    public PanelPestanas(){
        persona = new PanelDatos();
        cursos = new Cursos();
        inscripcion = new Inscripcion();
        
        this.addTab("Sujeto", persona);
        this.addTab("Cursos", cursos);
        this.addTab("Inscripcion", inscripcion);
    }
    
}
