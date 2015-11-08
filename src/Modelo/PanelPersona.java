/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author YEsparsan
 */
public class PanelPersona extends JPanel{
    
    PanelDatos datos;
    JPanel derecho;
    Tabla tabla;
    String[] columnas= {"Cedula","Nombres","Apellidos"}, nombres = {"Boton1", "Boton 2"};
    Object[] tipo = {new String(), new String(), new String()};
    Border borde;
    Botones botones;
    
    
    public PanelPersona(){
        datos = new PanelDatos();
        derecho = new JPanel();
        tabla = new Tabla(columnas, tipo, "Sujetos Registrados");
        borde = BorderFactory.createBevelBorder(1, Color.DARK_GRAY, Color.DARK_GRAY);
        botones = new Botones(nombres);
        
        //derecho.setBackground(Color.DARK_GRAY);
        derecho.setBorder(borde);
        datos.setBorder(borde);
        tabla.setBorder(borde);
        botones.setBorder(borde);
        
        inicializar();
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.5;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.NORTHWEST;
        constraints.insets = new java.awt.Insets(0, 0, 0, 0);
        
        add(datos, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.8;
        constraints.weighty = 0.5;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        //constraints.insets = new java.awt.Insets(2, 20, 2, 1);
        
        add(derecho, constraints);
        
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        //constraints.insets = new java.awt.Insets(20, 20, 20, 10);
        
        add(tabla, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        //constraints.insets = new java.awt.Insets(20, 20, 20, 10);
        
        add(botones, constraints);
    }
    
    public void inicializar(){
        setLayout(new GridBagLayout());
    }
    
}
