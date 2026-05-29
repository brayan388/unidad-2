/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author bra
 */
abstract class Animal {
    public abstract void hacerSonido();
}

public class Main {

    public static void main(String[] args) {

        // ERROR: no se puede instanciar una clase abstracta
        Animal animal = new Animal();
    }
}
