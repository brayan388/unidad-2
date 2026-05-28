/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Empleado {
     public String nombre;

    // Propiedad privada
    private double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {

        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }
}
