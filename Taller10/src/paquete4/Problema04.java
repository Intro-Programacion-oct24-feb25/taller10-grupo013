/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        int contador = 0;
        double ingreso;

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("ingrese el valor para la posicion[%d][%d]\n", i, j);
                ingreso = entrada.nextDouble();
                
                datos[i][j] = ingreso;
                        
                if (ingreso < 1000 || ingreso > 1199) {
                    datos[i][j] = 10;
                    contador++;
                }
                

            }
        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%.2f\t", datos[i][j]);
            }
            System.out.println("");
        }
        System.out.println("el numero de valores ingresados fuera de rango es "+ 
                contador);
    }
}