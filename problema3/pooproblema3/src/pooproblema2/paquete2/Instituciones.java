/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproblema2.paquete2;

/**
 *
 * @author sebas
 */
public class Instituciones {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoProyectadoEstudiante;
    private double presupuesto;

    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    public void establecerTipoInstitucion(String tip){
        tipoInstitucion= tip;
    }
    
    public void establecerNumeroAlumnos(int almn){
        numeroAlumnos = almn;
    }
    
    public void establecerNumeroDocentes(int docent){
        numeroDocentes = docent;
    }
     public void establecerNumeroSedes(int sedes){
        numeroSedes = sedes;
    }
    public void establecerGastoProyectadoEstudiante (double gasto){
        gastoProyectadoEstudiante = gasto;
    }
    public void calcularPresupuesto(){
        presupuesto =  gastoProyectadoEstudiante* numeroAlumnos ;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion(){
        return tipoInstitucion;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastoProyectadoEstudiante(){
        return gastoProyectadoEstudiante;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
