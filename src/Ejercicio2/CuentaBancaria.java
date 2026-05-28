/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author bra
 */
public class CuentaBancaria {
    // Atributos privados
    private String numeroCuenta;
    private double saldo;

    // Atributo público
    public String tipoCuenta;

    // Constructor
    public CuentaBancaria(
            String numeroCuenta,
            double saldo,
            String tipoCuenta
    ) {

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
