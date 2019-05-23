/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_for;

import java.util.Scanner;
/**
 *
 * @author COMPUMARS
 */
public class Estructura_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        String mensajeReporte = "";
        String nombre = "";
        String apellido = "";
        int edad = 0;
        int sumaEdades = 0;
        double promedioEdades =0;
        
        mensajeReporte = String.format("%s%s\n", mensajeReporte,
                "Listado de estudiantes");
        mensajeReporte = String.format("%s%s\t\t%stt%s\n", mensajeReporte,
                "Nombre", "Apellido", "Edad");
        for (int i = 1; i <=limite; i++) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
            entrada.nextLine();
            sumaEdades = sumaEdades + edad;
            mensajeReporte = String.format("%s%s\t\t%s\t\t%d\n",
                    mensajeReporte, nombre, apellido, edad);
        }
        promedioEdades = (double)sumaEdades / limite;
        mensajeReporte = String.format("%sPromedio de edades: %f\n",
                mensajeReporte, promedioEdades);
       System.out.printf("%s\n", mensajeReporte);    
        }
    }
