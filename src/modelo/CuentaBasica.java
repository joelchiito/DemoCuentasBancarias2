/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hp245
 */
public class CuentaBasica {
    private int numerodeCuenta;
    private String cliente;
    private double saldo;
    
    public CuentaBasica (int numerodeCuenta, String cliente){
        this.numerodeCuenta = numerodeCuenta;
        this.cliente = cliente;
    }
    
    public double getSaldo (){
        return this.saldo;
    }
    
    public boolean depositar (double cantidad){
        boolean SaldoMayoroIgual;
        if ( cantidad > 0){
            SaldoMayoroIgual = true;
            System.out.println("Querido usuario, su depositó se efectuo exitosamente"); 
        }
        else {
            SaldoMayoroIgual = false;
        }
        this.saldo = this.saldo + cantidad;
        return SaldoMayoroIgual;
    }
    
    public boolean retirar (double cantidad){
        boolean seQuiereRetirar;
        if ( cantidad > this.saldo){
            seQuiereRetirar = true;
            System.out.println("Querido usuario, le informamos que el saldo de la cuenta debe ser mayor al saldo a retirar");
        }
        else {
            seQuiereRetirar = false;
            this.saldo = this.saldo - cantidad;
            System.out.println("Querido usuario, su retiró se efectuo exitosamente"); 
        }
        return seQuiereRetirar;
    }
}
