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

        Persona persona = new Persona();

        Persona estudiante = new Estudiante();

        Persona profesor = new Profesor();

        persona.presentarse();

        estudiante.presentarse();

        profesor.presentarse();
    }
}
