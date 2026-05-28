/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author bra
 */
public class Main {
    public static void main(String[] args) {

        double suma = Utilidades.sumar(10, 5);
        double resta = Utilidades.restar(10, 5);
        double multiplicacion = Utilidades.multiplicar(10, 5);
        double division = Utilidades.dividir(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
