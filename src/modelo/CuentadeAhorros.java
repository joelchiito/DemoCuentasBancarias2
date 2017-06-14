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
public class CuentadeAhorros extends CuentaBasica {
    protected double saldo;
    protected double tasadeIntereses;
    protected double comisionPorSaldo;
    
    private static final double SALDO_ACREEDOR = 50.0;
    
    public CuentadeAhorros (int numerodeCuenta, String cliente){
        super (numerodeCuenta, cliente);
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

