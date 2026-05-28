/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author bra
 */
public class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {

        // ERROR: marca es private
        System.out.println(marca);
    }
}
