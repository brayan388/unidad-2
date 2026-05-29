/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Animal implements Volador, Nadador{
    @Override
    public void volar() {
        System.out.println("El animal está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal está nadando.");
    }
}
