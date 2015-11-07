/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Yuli / Fr@n
 */
public class AreaTexto extends Container{
    
    JTextArea campo;
    JLabel etiqueta;
    JScrollPane scroll;
    
    public AreaTexto(){
        this(1, 20, "");
    }
    
    public AreaTexto(String nombre){
        this(1, 20, nombre);
    }
    
    public AreaTexto(int alto, int ancho){
        this(alto, ancho, "");
    }
    
    public AreaTexto(int alto, int ancho, String nombre){
        inicializar();
        
        campo = new JTextArea(alto, ancho);
        etiqueta = new JLabel(nombre);
        etiqueta.setPreferredSize(new java.awt.Dimension(130, 40));
        etiqueta.setMinimumSize(new java.awt.Dimension(130, 40));
        scroll = new JScrollPane();
        scroll.setViewportView(campo);
        
        campo.setLineWrap(true);
        campo.setWrapStyleWord(true);
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 1.0;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new java.awt.Insets(2, 20, 2, 1);
        
        add(etiqueta, constraints);
        
        constraints.gridx = 6;
        constraints.gridy = 0;
        constraints.gridwidth = 50;
        constraints.gridheight = 5;
        constraints.weightx = 1.0;
        constraints.insets = new java.awt.Insets(2, 2, 2, 20);
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        
        add(scroll, constraints);
    }
    
    private void inicializar(){
        //this.setLayout(new FlowLayout());
        
    }
    
    public void modificarTexto(String texto){
        campo.setText(texto);
    }
    
    public String obtenerTexto(){
        return campo.getText();
    }
    
    public void agregarOyente(KeyListener oyente){
        campo.addKeyListener(oyente);
    }
    
    public void agregarOyente(MouseListener oyente){
        campo.addMouseListener(oyente);
    }
    
    public void agregarOyente(FocusListener oyente){
        campo.addFocusListener(oyente);
    }
    
    public void hacerEditable(Boolean valor){
        campo.setEditable(valor);
    }
}
