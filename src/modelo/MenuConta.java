/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.io.*;
import modelo.Conta;
import controle.ControleConta;
        
/**
 *
 * @author User
 */
public class MenuConta {
    
    public static void main(String[] args) throws IOException{
        InputStream entradaSistema = System.in;
        InputStreamReader leitor = new InputStreamReader(entradaSistema);
        BufferedReader leitorEntrada = new BufferedReader(leitor);
        String entradaTeclado;
        char menuOpcao;
        char opcao='0';
        ControleConta umControle = new ControleConta();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();
        do{
            
        System.out.println("Bem vindo ao Conta Bancaria.\n");
        System.out.println(" - Menu - \n");
        System.out.println("1- Adicionar nova conta; \n");
        System.out.println("2- Acessar conta.\n");
        System.out.println("Opcao escolhida: \n");
        
        entradaTeclado = leitorEntrada.readLine();
        menuOpcao = entradaTeclado.charAt(0);
        
        switch(menuOpcao){
            case '1': 
                System.out.println("Digite o nome do titular: \n");
                entradaTeclado = leitorEntrada.readLine();
                String umTitular = entradaTeclado;
                
                System.out.println("Digite o numero da conta: \n");
                entradaTeclado = leitorEntrada.readLine();
                String umNumero = entradaTeclado;
                
                System.out.println("Digite a agencia da conta: \n");
                entradaTeclado = leitorEntrada.readLine();
                String umaAgencia = entradaTeclado;
                
                System.out.println("Digite o saldo inicial da conta: \n");
                entradaTeclado = leitorEntrada.readLine();
                double umSaldo = Double.parseDouble(entradaTeclado);
                
                System.out.println("Digite a senha da conta: \n");
                entradaTeclado = leitorEntrada.readLine();
                String umaSenha = entradaTeclado;
                
                System.out.println("Digite o tipo de conta: \n 1- Conta Corrente\n 2- Conta Poupanca\n ");
                entradaTeclado = leitorEntrada.readLine();
                double tipo = Double.parseDouble(entradaTeclado);
                
                if(tipo==1){
                    System.out.println("Digite o rendimento de Poupanca: \n ");
                    entradaTeclado = leitorEntrada.readLine();
                    double rendimento = Double.parseDouble(entradaTeclado);
                    
                    contaPoupanca.setTitular(umTitular);
                    contaPoupanca.setNumero(umNumero);
                    contaPoupanca.setAgencia(umaAgencia);
                    contaPoupanca.setSaldo(umSaldo);
                    contaPoupanca.setSenha(umaSenha);
                    contaPoupanca.setRendimento(rendimento);
                    
                    umControle.adicionar(contaPoupanca);
                    
                } else if(tipo==2){
                    System.out.println("Digite o limite do Cheque Especial: \n ");
                    entradaTeclado = leitorEntrada.readLine();
                    double limite = Double.parseDouble(entradaTeclado);
                    
                    contaCorrente.setTitular(umTitular);
                    contaCorrente.setNumero(umNumero);
                    contaCorrente.setAgencia(umaAgencia);
                    contaCorrente.setSaldo(umSaldo);
                    contaCorrente.setSenha(umaSenha);
                    contaCorrente.setLimiteChequeEspecial(limite);
                    
                    umControle.adicionar(contaCorrente);
                    
                } else{
                    System.out.println("Tipo inválido! \n ");
                }
                
                break;
            case'2':
                System.out.println("Digite o numero da sua conta: \n");
                entradaTeclado = leitorEntrada.readLine();
                umNumero = entradaTeclado;
                
                System.out.println("Digite sua senha: \n");
                entradaTeclado = leitorEntrada.readLine();
                umaSenha = entradaTeclado;
                
                Conta conta = umControle.validaConta(umNumero, umaSenha);
                
                if(umControle.validaConta(umNumero, umaSenha)==null){
                    System.out.println("Dados incorretos, tente novamente!");
                } else{
                    System.out.println("Bem vindo a sua conta, ");
                    System.out.println("\nSelecione uma opcao: \n");
                    System.out.println("1- Saque\n");
                    System.out.println("2- Depósito\n");
                    System.out.println("3- Saldo\n");
                
                     entradaTeclado = leitorEntrada.readLine();
                     opcao = entradaTeclado.charAt(0);
                }
                     switch(opcao){
                         case'1':
                             
                             System.out.println("Insira o valor a ser sacado: ");
                             entradaTeclado = leitorEntrada.readLine();
                             double valor = Double.parseDouble(entradaTeclado);
                             
                             String retorno = umControle.sacar(valor, conta);
                             System.out.println(retorno);
                         break;
                         case '2':
                             System.out.println("Insira o valor a ser depositado: ");
                             entradaTeclado = leitorEntrada.readLine();
                             valor = Double.parseDouble(entradaTeclado);
                             
                             retorno = umControle.depositar(valor, conta);
                             System.out.println(retorno);
                         break;
                         case '3':
                             System.out.println("Saldo disponível: R$ "+conta.getSaldo());
                         break;
                         default:
                     
                     }  
            break;
            default:
        }
        
    } while(menuOpcao != 0);
}
}
