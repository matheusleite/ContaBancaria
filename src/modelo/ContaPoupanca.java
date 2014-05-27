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
public class ContaPoupanca extends Conta{
    
    private double rendimento;
    
    public ContaPoupanca(){
        super();
        this.rendimento=0.0;
}

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    
}
