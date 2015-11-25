/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quequenetico;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author neftali
 */
public class Quequenetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       List<Queque> ListaQueques = new ArrayList<Queque>();
       int cantidad = 100;
       Random rnd = new Random();
              
       float proporcion = rnd.nextFloat();//porcentaje [0-1]
       
       float tiempoBatido = rnd.nextFloat();//minutos[5-15]-->ideal 10min
       tiempoBatido = (int)(tiempoBatido * 10 + 5);
       //tiempoBatido = (int)(tiempoBatido * hasta(valor_de_variación) + base_desde);
       
       float tiempoCoccion = rnd.nextFloat();//minutos[15-35]-->ideal 22 min
       tiempoCoccion = (int)(tiempoCoccion * 20 + 15);
       
       float tiempoEnfriamiento = rnd.nextFloat();//minutos[15-45]-->ideal 30 min temp ambiente 18°C
       tiempoEnfriamiento= (int)(tiempoEnfriamiento * 30 + 15);
       
       float tiempoPrecalentamiento = rnd.nextFloat();//[15-45]min-->ideal 30min
       tiempoPrecalentamiento= (int)(tiempoPrecalentamiento * 30 + 15);
       
       float temperaturaHorno = rnd.nextFloat();//[140-220]°C-->ideal 180 °C 
       temperaturaHorno = (int)(temperaturaHorno * 80 + 140);
       
       float tiempoMezcla  = rnd.nextFloat();//[5-15]°C-->ideal 10 min temp ambiente 18°C
       tiempoMezcla = (int)(tiempoMezcla  * 10 + 5);
       
       float experiencia = rnd.nextFloat();//porcentaje [0-1]
       
       System.out.println("Queque{" + "proporcion=" + proporcion*100 + "%, tiempoBatido=" + tiempoBatido + "min, tiempoEnfriamiento=" + tiempoEnfriamiento + "min, tiempoPrecalentamiento=" + tiempoPrecalentamiento + "min, temperaturaHorno=" + temperaturaHorno + "°C, tiempoMezcla=" + tiempoMezcla + "min, experiencia=" + (experiencia*100) + "%}");

        
    }
    
}
