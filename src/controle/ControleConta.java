/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.ArrayList;
import modelo.Conta;

/**
 *
 * @author User
 */
public class ControleConta {
    
    private ArrayList<Conta> listaContas;
    
    //construtor
    public ControleConta(){
        listaContas = new ArrayList<>();
    }
    
    Conta conta = new Conta();
    
    public String depositar(double deposito){
        double umSaldo = conta.getSaldo();
        umSaldo = (umSaldo + deposito);
        conta.setSaldo(umSaldo);
        String message = ("Depósito efetuado com sucesso.");
        return message;
    }
    public String debitar(double debito){
        double umSaldo = conta.getSaldo();
        umSaldo = (umSaldo - debito);
        conta.setSaldo(umSaldo);
        String message = ("Depósito efetuado com sucesso.");
        return message;
    }
    public String adicionar(Conta umaConta){
        String message = ("Conta adicionada com sucesso.");
        listaContas.add(umaConta);
        return message;
    }
    public String remover(Conta umaConta){
        String message = ("Conta removida com sucesso.");
        listaContas.remove(umaConta);
        return message;
    }
    
}
