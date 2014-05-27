/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author User
 */
public class ContaCorrente extends Conta{
    
     private double limiteChequeEspecial;

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    public ContaCorrente(){
        super();
        this.limiteChequeEspecial=0.0;
}

   
}

