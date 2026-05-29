/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Main {
     public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 3000, 1200);
        Vendedor vendedor = new Vendedor("Ana", 1800, 500);

        System.out.println("GERENTE");
        gerente.mostrarDetalles();

        System.out.println("\nVENDEDOR");
        vendedor.mostrarDetalles();
    }
}
