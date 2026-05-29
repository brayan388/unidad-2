/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Circulo extends Figura{
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
