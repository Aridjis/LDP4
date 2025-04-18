/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria() {
        saldo = 0.0;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
        }else {
            System.out.println("Cantidad invalida. Intenta nuevamente.");
        }
    }
    
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
         saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            return true;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
            return false;
        }
    }

    
    public double getSaldo() {
        return saldo;
    }
}
