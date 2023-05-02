package pooproblema3;
import pooproblema2.paquete2.Instituciones;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Pooproblema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instituciones cole = new Instituciones();
        String nombre = "Mater Dei";
        String tipo = "Fiscomisional"; 
        int numalumn = 1000;
        int numdocen = 600;
        int numsedes = 80;
        double gastoporest = 40000;
        // en esta parte tenemos todos los valores que le damos a 
        // los atributos del objeto
        
        cole.establecerNombre(nombre);
        cole.establecerTipoInstitucion(tipo);
        cole.establecerNumeroAlumnos(numalumn);
        cole.establecerNumeroDocentes(numdocen);
        cole.establecerNumeroSedes(numsedes);
        cole.establecerGastoProyectadoEstudiante(gastoporest);
        cole.calcularPresupuesto();
        
        
        System.out.println("Administrador de instituciones educativas");
        System.out.println("----------------------------------------------------");
        System.out.println("Datos de la institución:");
        System.out.println("Nombre: "+ cole.obtenerNombre());
        System.out.println("Tipo: "+ cole.obtenerTipoInstitucion());
        System.out.println("Numero de Alumnos: "+ cole.obtenerNumeroAlumnos());
        System.out.println("Numero de Docentes: "+ cole.obtenerNumeroDocentes());
        System.out.println("Numero de Sedes: "+ cole.obtenerNumeroSedes());
        System.out.println("Gastos proyectados por estudiante: "+ cole.obtenerGastoProyectadoEstudiante());
        System.out.println("Presupuesto de la institución: $"+ cole.obtenerPresupuesto());
                     
    }
    
}
