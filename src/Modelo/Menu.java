/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Yuli / Fr@n
 */
public class Menu extends JMenuBar{
    
    public JMenu actualizacion,registro,consultas,reportes,sistema;
    
    public JMenuItem preinscripcion,area,participante,
              facilitador,curso, horarios, salir;  

    public Menu(){      
        
        //Creamos los Menu
        actualizacion = new JMenu("Actualizacion");
        consultas = new JMenu("Consultas");        
        reportes = new JMenu("Reportes");
        sistema = new JMenu("Sistema");             
                
        //Este es el Jmenuitem es para dar valor al menu actualizacion
        registro = new JMenu("Registro");
        preinscripcion = new JMenuItem("Preinscripcion");
                        
        //Este es el Jmenuitem es para dar valor al menu registro
        participante = new JMenuItem("Participante");
        facilitador = new JMenuItem("Facilitador");
        area = new JMenuItem("Area de Saber");
        curso = new JMenuItem("Curso");
        horarios = new JMenuItem("Horarios");
        
        //Este es el Jmenuitem es para dar valor al menu consultas
        salir = new JMenuItem("Salir");
                
        //Menu
        
        //SubMenu Archivos
        actualizacion.add(registro);
        actualizacion.add(preinscripcion);     
                
        //SubMenu Procesos
        registro.add(participante); 
        registro.add(facilitador); 
        registro.add(area);  
        registro.add(curso); 
        registro.add(horarios); 
        
        //SubMenu Sistema
        sistema.add(salir);
        
        
        this.add(actualizacion);
        this.add(consultas);
        this.add(reportes);
        this.add(sistema);  
        
    }    
    
}
