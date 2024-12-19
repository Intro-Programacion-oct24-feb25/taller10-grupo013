/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedios = new double[3];
        double suma;

        for (int i = 0; i < notas.length; i++) {
            suma = 0; // 0
            for (int j = 0; j < notas[i].length; j++) {
                suma = suma + notas[i][j];
            }
            promedios[i] = suma / notas[i].length;

           

                
            }
         for (int i = 0; i < notas.length; i++) {
               
                    System.out.printf("Estudiante: %s tiene un promedio de %.2f\n", nombresEstudiante[i], promedios[i]);
        }
    
    }
}
