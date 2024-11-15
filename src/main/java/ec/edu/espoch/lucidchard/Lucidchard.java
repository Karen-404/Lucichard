/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.lucidchard;

import ec.edu.espoch.lucidchard.Enumeraciones.TipoPlaneta;
import ec.edu.espoch.lucidchard.clase.Planetas;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Lucidchard {

    public static void main(String[] args) {
        Planetas objPlanetas = new Planetas ("venus", (int) 23.4, 342.4, 23423, 3434, 2355.5, 634.5, TipoPlaneta.Terrestre);


        objPlanetas.imprimir();
        double densidad = objPlanetas.calcularDensidadPlanetas();
        System.out.println("La densidad es: " + densidad);

    }
}
