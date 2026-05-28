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

        Empleado empleado1 = new Empleado(
                "Carlos",
                2500
        );

        Gerente gerente1 = new Gerente(
                "Ana",
                5000,
                "Recursos Humanos"
        );

        System.out.println("=== EMPLEADO ===");
        empleado1.mostrarDetalles();

        System.out.println("\n=== GERENTE ===");
        gerente1.mostrarDetalles();
    }
}
