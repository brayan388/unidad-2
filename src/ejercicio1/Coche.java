/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author bra
 */
public class Coche extends Vehiculo{
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInformacionCoche() {
        mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}

