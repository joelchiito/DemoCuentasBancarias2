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
public class CuentadeCheques extends CuentaBasica {
    private int chequesEmitidos;
    private int chequesRebotados;
    
    public CuentadeCheques (int numerodeCuenta, String cliente){
    super (numerodeCuenta, cliente);
    this.chequesEmitidos = 0;
    this.chequesRebotados = 0;
}
    
    public boolean retirar (int cantidad){
        boolean seQuiereRetirar = super.retirar (cantidad);
        if (seQuiereRetirar){
            this.chequesEmitidos++;
        }
        else{
            this.chequesRebotados++;
        }
        return seQuiereRetirar;
    }
    
    public double calcularComisiónChequesEmitidos(){
        double comision = (this.chequesEmitidos )*10.0;
        return comision;
    }
    
    public double calcularComisiónChequesRebotados(){
        double comision = this.chequesRebotados * 200.0;
        return comision;
    }
    
    public void realizarCorteMensual(){
        if (this.chequesEmitidos > 5){
            double comisionchequesEmitidos = this.chequesEmitidos;
            super.retirar(comisionchequesEmitidos);
            double comisionchequesRebotados = this.chequesRebotados;
            super.retirar(comisionchequesRebotados);
        }
        else{
            double comisionchequesEmitidos = 0;
            super.retirar(comisionchequesEmitidos);
            double comisionchequesRebotados = this.chequesRebotados;
            super.retirar(comisionchequesRebotados);
        }
    } 
}
