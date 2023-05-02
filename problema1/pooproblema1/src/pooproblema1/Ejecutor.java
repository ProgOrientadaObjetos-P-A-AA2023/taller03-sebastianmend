package pooproblema1;
import problema1.paquete2.Terreno;
 
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de tipo terreno
        Terreno terr = new Terreno();
        // Valores de entrada
        double largo = 70;
        double ancho = 50;
        double valmetroCuadrado = 1300;
        // declaramos las variables y les damos el valor que vamos a enviar 
        
        // usamos los métodos establecer para darle valores a los 
        // atributos del objeto.
        terr.establecerMetroCuadrado(valmetroCuadrado);
        terr.establecerAncho(ancho);
        terr.establecerLargo(largo);
        // usamos las variables que ya tienen un valor asignado 
        
        // hasta aquí el objeto ya tiene valores para sus atributos
        
        // llamo al método calcularCostoTerreno y establecerArea
        // no se envía parámetros
        // pues trabaja con los valores que ya posee el objeto 
        
        terr.establecerArea();
        terr.calcularCostoTerreno();
        
        // Usamos los métodos obtener para presentar en pantalla los datos 
        
        System.out.printf("Costo de Terreno\n\nAncho: %s\n"
                + "Largo: %.2f\nValor del metro cuadrado: %.2f\n"
                + "Costo Total: %.2f\n", terr.obtenerAncho(),
                terr.obtenerLargo(), terr.obtenerMetroCuadrado(),
                terr.obtenerCostoTerreno());
    }
    }
        
        
        
   
    

