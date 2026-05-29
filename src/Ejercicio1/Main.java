/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Main {
     public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("CÍRCULO");
        circulo.mostrarArea();

        System.out.println("\nRECTÁNGULO");
        rectangulo.mostrarArea();
    }
}
