/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author bra
 */
public class Empleado extends Persona{
    private String departamento;

    // Constructor
    public Empleado(String nombre, int edad, String departamento) {

        // Llamada al constructor de Persona
        super(nombre, edad);

        this.departamento = departamento;
    }

    // Sobrescribir método
    @Override
    public void mostrarDetalles() {

        // Llama al método de la clase padre
        super.mostrarDetalles();

        System.out.println("Departamento: " + departamento);
    }
}
