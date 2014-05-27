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
    public String sacar(double valor){
        for (Conta umaConta: listaContas) {
        double umSaldo = umaConta.getSaldo();
        umSaldo = umSaldo - valor;
        umaConta.setSaldo(umSaldo);
        if(umSaldo>=valor){
                umSaldo-=valor;
                System.out.println("Seu novo saldo é de R$"+umSaldo);
            }else{
                System.out.println("Saldo insuficiente! \n");
            }
    }
        String message = ("Saque efetuado com sucesso.");
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
    
    public boolean validaConta(String numero, String senha){
        for (Conta umaConta : listaContas) {
            if (umaConta.getNumero().equals(numero)){
                if(umaConta.getSenha().equals(senha)){
                    return true;
                }
            } 
            } 
        return false;
    }
        
    
    /*public void sacar(String senha, double valor){
        double saldo = conta.getSaldo();
        if(conta.getSenha().equals(senha)){
            if(saldo>=valor){
                saldo-=valor;
                System.out.println("Seu novo saldo é de R$"+saldo);
            }else{
                System.out.println("Saldo insuficiente! \n");
            }
            }else{
            System.out.println("Senha inválida! \n");
        }
    }
    */
    
}
