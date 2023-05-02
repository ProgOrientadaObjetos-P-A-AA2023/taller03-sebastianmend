/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1.paquete2;

/**
 *
 * @author sebas
 */
public class Terreno {
    private double costo_terreno;
    private double largo;
    private double ancho;
    private double area;
    private double valorMetroCuadrado;
    
    public void establecerMetroCuadrado(double m2){
        valorMetroCuadrado = m2;
    }
    
    public void establecerLargo(double l){
        largo = l;
    }
    
    public void establecerAncho(double anch){
        ancho = anch;
    }
     public void establecerArea(){
        area = ancho*largo;
    }
    
   
    public void calcularCostoTerreno(){
        costo_terreno = valorMetroCuadrado * area ;
    }
    
    public double obtenerMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerArea(){
        return area;
    }
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
    }        

