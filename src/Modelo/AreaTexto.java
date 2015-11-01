/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Container;
import java.awt.FlowLayout;
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
        scroll = new JScrollPane();
        scroll.setViewportView(campo);
        
        campo.setLineWrap(true);
        campo.setWrapStyleWord(true);
        
        add(etiqueta);
        add(campo);
    }
    
    private void inicializar(){
        this.setLayout(new FlowLayout());
        
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
