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

        Empleado empleado1 = new Empleado(
                "Brayan",
                2500
        );

        System.out.println("Nombre: " + empleado1.nombre);

        System.out.println("Salario: $" + empleado1.getSalario());

        empleado1.setSalario(3000);

        System.out.println("Nuevo salario: $" + empleado1.getSalario());
    }
}
