/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quequenetico;

/**
 *
 * @author neftali
 */
public class Queque {
    
    private int id;
    private float proporcion;//porcentaje
    private int tiempoBatido;//minutos
    private int tiempoCoccion;//minutos
    private int tiempoEnfriamiento;//minutos
    private int tiempoPrecalentamiento;//minutos
    private int temperaturaHorno;//gradosCelsius
    private int tiempoMezcla;//minutos
    private float experiencia;//porcentaje

    public Queque(){
        super();
    }
    
    
    public Queque(int id, float proporcion, int tiempoBatido, int tiempoEnfriamiento, int tiempoPrecalentamiento, int temperaturaHorno, int tiempoMezcla, float experiencia) {
        this.id = id;
        this.proporcion = proporcion;
        this.tiempoBatido = tiempoBatido;
        this.tiempoEnfriamiento = tiempoEnfriamiento;
        this.tiempoPrecalentamiento = tiempoPrecalentamiento;
        this.temperaturaHorno = temperaturaHorno;
        this.tiempoMezcla = tiempoMezcla;
        this.experiencia = experiencia;
    }
    
    public int getId(){
        return id;
    }

    public float getProporcion() {
        return proporcion;
    }

    public int getTiempoBatido() {
        return tiempoBatido;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public int getTiempoEnfriamiento() {
        return tiempoEnfriamiento;
    }

    public int getTiempoPrecalentamiento() {
        return tiempoPrecalentamiento;
    }

    public int getTemperaturaHorno() {
        return temperaturaHorno;
    }

    public int getTiempoMezcla() {
        return tiempoMezcla;
    }

    public float getExperiencia() {
        return experiencia;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setProporcion(float proporcion) {
        this.proporcion = proporcion;
    }

    public void setTiempoBatido(int tiempoBatido) {
        this.tiempoBatido = tiempoBatido;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public void setTiempoEnfriamiento(int tiempoEnfriamiento) {
        this.tiempoEnfriamiento = tiempoEnfriamiento;
    }

    public void setTiempoPrecalentamiento(int tiempoPrecalentamiento) {
        this.tiempoPrecalentamiento = tiempoPrecalentamiento;
    }

    public void setTemperaturaHorno(int temperaturaHorno) {
        this.temperaturaHorno = temperaturaHorno;
    }

    public void setTiempoMezcla(int tiempoMezcla) {
        this.tiempoMezcla = tiempoMezcla;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Queque{"+"Id="+ id + ", proporcion=" + proporcion + ", tiempoBatido=" + tiempoBatido + ", tiempoCoccion=" + tiempoCoccion + ", tiempoEnfriamiento=" + tiempoEnfriamiento + ", tiempoPrecalentamiento=" + tiempoPrecalentamiento + ", temperaturaHorno=" + temperaturaHorno + ", tiempoMezcla=" + tiempoMezcla + ", experiencia=" + experiencia + '}';
    }

    
}
