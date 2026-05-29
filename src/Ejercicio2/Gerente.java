/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Gerente extends Empleado{
     private double salarioBase;
    private double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    // Implementación del método abstracto
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
