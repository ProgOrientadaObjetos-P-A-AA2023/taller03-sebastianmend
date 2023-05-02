
package pooproblema4;
import pooproblema4.paquete2.DispElectronicos;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Pooproblema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DispElectronicos de = new DispElectronicos();
        String sistOp = "IOS";
        double tamaPant = 6.1; 
        double costIni = 1099.56;
        double ivaP = 12;
        String dirMac = "33:1h:28:00:5B::B7";
        String imei = "92384201/23/383638/1.";
        
        de.establecerSistemaOperativo(sistOp);
        de.establecerTamanioPantalla(tamaPant);
        de.establecerCostoInicial(costIni);
        de.establecerIvaPorcentaje(ivaP);
        de.establecerDireccionMac(dirMac);
        de.establecerImei(imei);
        de.calcularIvaCostoInicial();
        de.calcularCostoFinal();
        
        System.out.println("Dispositivos Electronicos: Iphone 14");
        System.out.println("---------------------------------------------------------");
        System.out.println("Sistema Operativo: "+ de.obtenerSistemaOperativo());
        System.out.println("Tamanio de Pantalla: "+ de.obtenerTamanioPantalla());
        System.out.println("Costo Inicial: "+ de.obtenerCostoInicial());
        System.out.println("Iva: "+ de.obtenerIvaPorcentaje()+"%");
        System.out.println("Direccion Mac: "+ de.obtenerDireccionMac());
        System.out.println("IMEI: "+ de.obtenerImei());
        System.out.println("Iva del costo inicial: $"+ de.obtenerIvaCostoInicial());
        System.out.println("Costo total: $"+ de.obtenerCostoFinal());
                     
    }
        
    }

    