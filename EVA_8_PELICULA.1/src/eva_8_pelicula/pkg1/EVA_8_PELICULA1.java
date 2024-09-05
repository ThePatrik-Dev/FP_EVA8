/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_8_pelicula.pkg1;

import java.util.Scanner;

/**
 *
 * @author elmas
 */
public class EVA_8_PELICULA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Alderete Aguirre Diego Joel
        
        String Nombre;
        String Reparto;
        String Clasificacion;
        String Genero;
        int Tiempo;
        Scanner SN;
        
        SN = new Scanner(System.in);
        
        System.out.println("Elige el Nombre de la Pelicula: ");
        Nombre = SN.nextLine();

        System.out.println("Escribre el Genero de la Pelicula: ");
        Genero = SN.nextLine();
        
        System.out.println("Escribe la Duracion de la Pelicula: ");
        Tiempo = SN.nextInt();
        
        System.out.println("Reparto de los Actores: ");
        Reparto = SN.nextLine();
        
        System.out.println("Que Clasificacion es: ");
        Clasificacion = SN.nextLine();
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("El Nombre de la Pelicula es : " + Nombre);
        System.out.println("El Genero de la Pelicula es : " + Genero);
        System.out.println("El Tiempo de la Pelicula es : " + Tiempo);
        System.out.println("El Reparto de los Actores son : " + Reparto);
        System.out.println("La Clasificacion de la Pelicula es : " + Clasificacion);
                
    }
    
}
