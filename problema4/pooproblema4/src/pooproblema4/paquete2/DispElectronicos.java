/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproblema4.paquete2;

/**
 *
 * @author sebas
 */
public class DispElectronicos {
    
private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String imei;
    

    
    public void establecerSistemaOperativo(String sistop){
        sistemaOperativo =  sistop;
    }
    public void establecerTamanioPantalla(double pant){
        tamanioPantalla = pant;
    }
    
    public void establecerCostoInicial(double costin){
        costoInicial = costin;
    }
    
    public void establecerIvaPorcentaje(double iva){
        ivaPorcentaje = iva;
    }
     public void calcularIvaCostoInicial(){
        ivaCostoInicial = (ivaPorcentaje/100) * costoInicial;
    }
    public void calcularCostoFinal (){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    

    public void establecerDireccionMac(String mac){
        direccionMac = mac;
    }
    public void establecerImei(String imeii){
        imei = imeii;
    }

    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public String obtenerImei(){
    return imei;
    }
}