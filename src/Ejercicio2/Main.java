/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class Main {
     public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(
                "123456789",
                5000,
                "Ahorros"
        );

        cuenta1.mostrarDetalles();

        System.out.println("\nSaldo actual: $" + cuenta1.getSaldo());

        cuenta1.setSaldo(7000);

        System.out.println("Nuevo saldo: $" + cuenta1.getSaldo());

        // ERROR DE COMPILACIÓN INTENCIONAL
        System.out.println(cuenta1.numeroCuenta);
    }
}
