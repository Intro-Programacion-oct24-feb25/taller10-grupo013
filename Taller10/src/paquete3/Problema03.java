/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
         */
        for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                if (notasCuantitativas[i][j] >= 0 && notasCuantitativas[i][j] < 3) {
                    notasCualitativas[i][j] = "Insuficiente";
                } else {
                    if (notasCuantitativas[i][j] >= 3 && notasCuantitativas[i][j] < 5) {
                        notasCualitativas[i][j] = "Regular";
                    } else {
                        if (notasCuantitativas[i][j] >= 5 && notasCuantitativas[i][j] < 8) {
                            notasCualitativas[i][j] = "Buena";
                        } else {
                            if (notasCuantitativas[i][j] >= 8 && notasCuantitativas[i][j] <= 9.5) {
                                notasCualitativas[i][j] = "Muy buena";
                            } else {
                                if (notasCuantitativas[i][j] > 9.5 && notasCuantitativas[i][j] <= 10) {
                                    notasCualitativas[i][j] = "Sobresaliente";
                                }
                            }
                        }
                    }
                }

            }
        }
        for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                System.out.printf("%.2f es %s\n", notasCuantitativas[i][j], notasCualitativas[i][j]);
            }
        }
    }
}
