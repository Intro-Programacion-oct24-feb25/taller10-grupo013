/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        double suma = 0;
        double ingresoVentas;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese las ventas del dia de " + nombres[i]);
                ingresoVentas = entrada.nextDouble();
                ventas[i][j] = ingresoVentas;
                suma = suma + ingresoVentas;
            }
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Vendedor(a) %s\n", nombres[i]);

        }
        System.out.printf("han realizado un total de %.2f en ventas", suma);

    }
}
