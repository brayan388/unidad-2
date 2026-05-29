/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public abstract class Empleado {
     protected String nombre;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método concreto
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}
