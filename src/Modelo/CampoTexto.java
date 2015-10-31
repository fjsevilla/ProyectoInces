/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.FlowLayout;
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
public class CampoTexto extends JPanel{
    
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
