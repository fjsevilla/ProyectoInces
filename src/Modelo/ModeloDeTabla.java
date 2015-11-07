package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ModeloDeTabla extends DefaultTableModel{
    
    ArrayList <Object> data;
    Object[] nombreColumnas;
    Object [] claseColumnas;
    
    public ModeloDeTabla(String[] columnas, Object[] clase){
        nombreColumnas = columnas;
        claseColumnas = clase;
        
        data = new ArrayList<>();
        setColumnIdentifiers(nombreColumnas);
    }

    @Override
    public Class getColumnClass(int c) {
        return claseColumnas[c].getClass();
    }
}