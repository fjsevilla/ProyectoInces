/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.BorderLayout;
import java.awt.Container;

/**
 *
 * @author Yuli / Fr@n
 */
public class Cursos extends Container{
    PanelCursos superior;
    Tabla tabla;
    String[] columnas={"Nombre","Area Saber", "Turno", "Duracion"};
    Object[] tipos={new String(), new String(), new String() , new String()};
    
    public Cursos(){
        inicializar();
        superior = new PanelCursos();
        tabla = new Tabla(columnas, tipos, "Cursos Actuales");
        
        add(superior, BorderLayout.NORTH);
        add(tabla, BorderLayout.CENTER);
    }
    
    private void inicializar(){
        setLayout(new BorderLayout());
    }
        
    }
