package Modelo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;


public class Tabla extends JPanel{
    
    private ModeloDeTabla tablaModelo;
    private JTable tabla;
    private TableColumn[] columna;
    private final Object[] datos;
    private JTextField campo;
    private ResultSet resultado;
    
    /**
     * Construye la JTable.
     */
    public Tabla(String[] columnas, Object[] clase, String etiqueta){
        
        setLayout(new FlowLayout());
        setBorder(BorderFactory.createTitledBorder(etiqueta));
        setOpaque(false);
        crearTabla(columnas, clase);
        datos = new Object[columnas.length];
    }
    
    final void crearTabla(String[] columnas, Object[] clase){
        
        tablaModelo = new ModeloDeTabla(columnas, clase);
        campo = new JTextField();
        campo.setEditable(false);
        
        DefaultCellEditor ce = new DefaultCellEditor(campo);
        ce.setClickCountToStart(100);

        tabla = new JTable(tablaModelo);
        tabla.setPreferredScrollableViewportSize(new Dimension(200,100));
        tabla.setFillsViewportHeight(false);
                
        columna = new TableColumn[columnas.length];
        
        for (int cuenta = 0; cuenta < columnas.length; cuenta ++){
            columna [cuenta] = new TableColumn();
            columna[cuenta] = tabla.getColumnModel().getColumn(cuenta);
            columna[cuenta].setCellEditor(ce);
            
            if (columnas[cuenta]==""){
                columna[cuenta].setMinWidth(0);
                columna[cuenta].setMaxWidth(0);                          
            }else{
                columna[cuenta].setMinWidth(50);
                columna[cuenta].setMaxWidth(200);                
            }            
        }
             
        JScrollPane scrollPanel = new JScrollPane(tabla);
        add(scrollPanel);
    }
    
    /**
     * Carga la JTable con los datos iniciales.
     */
    public void cargarTabla(){
        int filas = tabla.getRowCount();
        /**
         * El siguiente for borra los registros previamente cargados.
         */ 
        for (int i = 0; i < filas; i++)
            tablaModelo.removeRow(0);
        
        for (int cuenta = 0; cuenta < tabla.getColumnCount(); cuenta ++){
            datos[cuenta] = "";
        }
        tablaModelo.addRow(datos);
    } 
    
    /**
     * Agrega un fila a la JTable con los datos pasados por parametros.
     * @param nombreComponente Nombre del laboratorio a agregar.
     * @return Verdadero si la inclusion fue exitosa, falso en caso contrario.
     */
    
    public boolean agregarFila(String[] descripciones){
        boolean todoBien = false;
        for (int cuenta = 0; cuenta < tabla.getColumnCount(); cuenta ++){
            datos[cuenta] = descripciones[cuenta];
        }
        todoBien = true;
        tablaModelo.addRow(datos);
        return todoBien;
    }
    
    /**
     * Modifica una fila a la JTable con los datos pasados por parametros.
     * @param nombreComponente Nombre del laboratorio a agregar.
     * @return Verdadero si la modificacion fue exitosa,falso en caso contrario.
     */
    
    public boolean modificarFila(String nombreComponente){
        boolean todoBien = false;
        int fila = tabla.getSelectedRow();
        
        if (fila >= 0){
            datos[0] = nombreComponente;
            tablaModelo.setValueAt(nombreComponente, fila, 0);
            todoBien = true;
        }
        return todoBien;
    } 
    
    /**
     * Elimina la fila que este seleccionada en la JTable.
     * @return Verdadero si la eliminación fue exitosa, falso en caso contrario.
     */
    
    public boolean eliminarFila(){
        int fila = tabla.getSelectedRow();
        boolean todoBien = false;
        if (fila >= 0){
            int respuesta = JOptionPane.showConfirmDialog(this,
                                               "¿Seguro quiere eliminar a: "+
                                               tablaModelo.getValueAt(fila, 0));
            if (respuesta == JOptionPane.OK_OPTION){
                tablaModelo.removeRow(fila);
                todoBien = true;
            }   
        }
        return todoBien;
    }
    
    public String obtenerDescripcion(){
        int fila = tabla.getSelectedRow();
        if (fila >= 0)
            return (String)tabla.getValueAt(fila, 0);
        else
            return null;
    }
    
    public String obtenerId(){
        int fila = tabla.getSelectedRow();
        if (fila >= 0)
            return (String)tabla.getValueAt(fila, 1);
        else
            return null;
    }
    
    public JTable obtenerTabla(){
        return this.tabla;
    }
}