package pooproblema2;
import pooproblema2.paquete2.Hora;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Pooproblema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hora equivhora = new Hora();
       int h = 174;
       // le damos el valor de la hora al objeto
       equivhora.establecerHoras(h);
       equivhora.calcularDias();
       equivhora.calcularMinutos();
       equivhora.calcularSegundos();
       // llamamos a los métodos para poner tener los cálculos requeridos
       
       System.out.printf("Horas equivalente en:\n\nCantidad de horas: %1s\n"
                + "Equivalente en dias es: %1s\nEquivalente en minutos es: %2s\n"
                + "Equivalente en segundos es: %2s\n", equivhora.obtenerHoras(),
                equivhora.obtenerDias(), equivhora.obtenerMinutos(),
                equivhora.obtenerSegundos());
       
       
       
       
    }
    
} 
   
