/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Vendedor extends Empleado{
    private double salarioBase;
    private double comision;

    // Constructor
    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    // Implementación del método abstracto
    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
