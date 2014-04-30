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
        ControleConta umControle = new ControleConta();
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
                
                Conta conta = new Conta();
                conta.setTitular(umTitular);
                conta.setNumero(umNumero);
                conta.setAgencia(umaAgencia);
                conta.setSaldo(umSaldo);
                
                String mensagem = umControle.adicionar(conta);
                System.out.println(mensagem);
                break;
            default:
                
        }
        
    } while(menuOpcao != 0);
}
}
