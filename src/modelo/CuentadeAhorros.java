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
public class CuentadeAhorros {
    private int numerodeCuenta;
    private String cliente;
    private double saldo;
    private double tasadeIntereses;
    private double comisionPorSaldo;
    
    private static final double SALDO_ACREEDOR = 50.0;
    
    public CuentadeAhorros (int numerodeCuenta, String cliente){
        this.numerodeCuenta = numerodeCuenta;
        this.cliente = cliente;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public boolean depositar (double cantidad){
        boolean SaldoMayoroIgual;
        if ( cantidad > 0){
            SaldoMayoroIgual = true;
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
    
    public double calcularIntereses (){
           tasadeIntereses = (((4.00/365.00)*30.00) * this.getSaldo()/100.00);
           return tasadeIntereses;
    }
    
    public double calcularComisión (){
        if ( this.getSaldo() < 1000.0){
            comisionPorSaldo = SALDO_ACREEDOR;
        }
        else{
            comisionPorSaldo = 0.0;
        }
        return comisionPorSaldo;
    }
    
    public void calcularCortedeMes (){
        double corte;
        saldo =((this.getSaldo() + tasadeIntereses )- comisionPorSaldo) ;
    }
    
}

