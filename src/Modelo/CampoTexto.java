/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Yuli / Fr@n
 */
public class CampoTexto extends Container{
    
    JTextField campo;
    JLabel etiqueta;
    
    public CampoTexto(){
        this(20, "");
    }
    
    public CampoTexto(String nombre){
        this(20, nombre);
    }
    
    public CampoTexto(int ancho){
        this(ancho, "");
    }
    
    public CampoTexto(int ancho, String nombre){
        inicializar();
        
        campo = new JTextField(ancho);
        etiqueta = new JLabel(nombre);
        etiqueta.setPreferredSize(new java.awt.Dimension(130, 10));
        etiqueta.setMinimumSize(new java.awt.Dimension(130, 10));
        setLayout(new GridBagLayout());
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new java.awt.Insets(0, 20, 0, 1);
        
        
        add(etiqueta, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.insets = new java.awt.Insets(0, 2, 0, 20);
        //constraints.fill = GridBagConstraints.HORIZONTAL;
        
        add(campo, constraints);
        
        //add(panel);
    }
    
    private void inicializar(){
        //this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //this.setLayout(new FlowLayout());
        setMaximumSize(new java.awt.Dimension(50, 5));
        setPreferredSize(new java.awt.Dimension(50,5));
        setMinimumSize(new java.awt.Dimension(50, 5));
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
    
    public void agregarOyente(ActionListener oyente){
        campo.addActionListener(oyente);
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
