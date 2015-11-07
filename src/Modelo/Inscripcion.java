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
public class Inscripcion extends Container{
    
    CampoTexto cedula, nombre, apellido;
    PanelJComboBox area, curso, horarios;
    Container persona, cursos;
    
    public Inscripcion(){
        setLayout(new GridLayout(2,1));
        add(panelSuperior());
        add(panelInferior());
        
        
    }
    
    private Container panelSuperior(){
        cedula = new CampoTexto(10, "Cedula: ");
        nombre = new CampoTexto(30, "Nombres: ");
        apellido = new CampoTexto(30,  "Apellidos: ");
        
        nombre.hacerEditable(false);
        apellido.hacerEditable(false);
        
        persona = new Container();
        persona.setLayout(new GridLayout(3,1));
        persona.add(cedula);
        persona.add(nombre);
        persona.add(apellido);
        
        return persona;
    }
    
    private Container panelInferior(){
        area = new PanelJComboBox("Area: ");
        curso = new PanelJComboBox("Curso: ");
        horarios = new PanelJComboBox("Turno: ");
        
        cursos = new Container();
        cursos.setLayout(new GridLayout(1,3));
        cursos.add(area);
        cursos.add(curso);
        cursos.add(horarios);
        
        return cursos;
    }
    
}
