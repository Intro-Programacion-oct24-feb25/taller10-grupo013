/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author Luis
 */
public class Problema07 {
    public static void main(String[] args) {
        double[][] dato1 = {{0, 2, 0}, {1, 0, 0}};
        // double[][] dato1 = {{0, 0, 0}, {0, 0, 0}}; 

        double suma = 0;

        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                suma = suma + dato1[i][j];
            }
        }

        if (suma == 0) {
            System.out.println("El arreglo es NULO (la suma de sus valores es 0)");
        } else {
            System.out.printf("El arreglo NO es NULO (la suma de sus valores es"
                    + " %.2f )", suma);
        }
    }

}
