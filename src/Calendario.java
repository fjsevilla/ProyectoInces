
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YEsparsan
 */
public class Calendario {
    Calendar calendario;
    Date fecha;
    DateFormat formatoHora, formatoFecha;
    
    public Calendario(){
        calendario = Calendar.getInstance();
        fecha = new Date();
        formatoHora = new SimpleDateFormat("HH:mm:ss");
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    public void sumarHoras(int horasDia, int horasTotal){
        int dias = (horasTotal / horasDia);
            
    }
    
    public Date sumarRestarDiasFecha(Date fecha, int dias){
        calendario = Calendar.getInstance();
        calendario.setTime(fecha); // Configuramos la fecha que se recibe
        calendario.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
        return calendario.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }
    
}
