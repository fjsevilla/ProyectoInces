/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Container;

/**
 *
 * @author Yuli / Fr@n
 */
public class Inscripcion extends Container{
    
    CampoTexto cedula;
    
    public Inscripcion(){
        cedula = new CampoTexto(10, "Cedula");
    }
    
}
