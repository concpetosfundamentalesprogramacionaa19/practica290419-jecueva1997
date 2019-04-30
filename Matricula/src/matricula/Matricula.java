/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

import java.util.Scanner;
import descuento.*;
/**
 *
 * @author reati
 */
public class Matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Importación del Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaración e importación de variables
        float costo = 1330, costot = 0;
        int edad = 0, ciudad = 0, estado = 0, familia = 0;
        float desciudad = Descuento.descuento1;
        float desedad = Descuento.descuento2;
        float desestado = Descuento.descuento3;
        float desfamilia = Descuento.descuento4;
        // Ingreso de datos
        System.out.println("Igrese la ciudad a la que pertenece\n"
                + "1.Zamora-Loja\n2.Otra ciudad");
        ciudad = entrada.nextInt();
        System.out.println("Ingrese la edad del estudiante");
        edad = entrada.nextInt();
        System.out.println("Ingrese el estado civil\n"
                + "1. Casado\n2. Soltero");
        estado = entrada.nextInt();
        System.out.println("Ingrese el número de hijos");
        familia = entrada.nextInt();
        // Proceso de estructura condicional
        // Calculo del iva y los impuestos
        if(ciudad == 1){
            costot = costo - desciudad;
        } else {
            if(ciudad == 2){
                costot =  costo;
            }
        }
        if(edad >= 17 || edad < 20){
            costot = costot - desedad;
        } else {
            if(edad <= 17 || edad > 20){
                costot = costot;
            }
        }
        if (estado == 1){
            costot = costot - desestado;
        } else {
            if(estado == 2){
                costot = costot;
            }
        }
        if(familia >= 1){
            costot = costot - desfamilia;
        } else {
            if(familia == 0){
                costot = costot;
            }
        }
        costot = (float) (costot + (costot * 0.02));
        // Presentación del mensaje
        System.out.printf("El valor a cancelar es de:%.2f", costot);
    }
}
