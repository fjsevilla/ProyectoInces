/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Container;
import java.awt.GridLayout;

/**
 *
 * @author Yuli / Fr@n
 */
public class PanelCursos extends Container{
    
    PanelJComboBox areas, turnos;
    CampoTexto nombre, duracion;
    
    public PanelCursos(){
        
        inicializar();
        
        areas = new PanelJComboBox("Area de Saber: ");
        turnos = new PanelJComboBox("Turno: ");
        duracion = new CampoTexto(5, "Duracion: ");
        nombre = new CampoTexto(15, "Nombre");
        
        add(nombre);
        add(duracion);
        add(areas);
        add(turnos);
        
    }
    
    private void inicializar(){
        setLayout(new GridLayout(4,1));
    }
    
}
