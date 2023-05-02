/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproblema2.paquete2;

/**
 *
 * @author sebas
 */
public class Hora {
     
private double horas;
    private double segundos;
    private double minutos;
    private double dias;
    

    
    public void establecerHoras(double h){
        horas = h;
    }
    
    public void calcularDias(){
        dias = horas / 24;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60 ;
    }
     public void calcularSegundos(){
        segundos = horas * 3600;
    }
    
    
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
    public double obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerSegundos(){
        return segundos;
    }
    

    
}
