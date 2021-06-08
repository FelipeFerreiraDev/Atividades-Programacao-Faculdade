/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
*
*/

import java.util.Scanner;


class Cartao {
    int saldo = -1; 

    void AdicionaSaldo(int saldo) {
        if(saldo<0) {
            System.out.print("A quantidade de saldo adicionado é invalida\n");
        } else {
            this.saldo += saldo;
            System.out.print("Seu saldo atual é de: " + this.saldo);
        }
    }
    
    void ComprarCafe(int comprados) {
        if(comprados>saldo) {
            System.out.print("Não foi possível realizar a compra\n");
            System.out.print("Saldo abaixo do número de cafés pedidos\n");
            System.out.print("Saldo atual de: " + saldo);
        } else {
            saldo -= comprados;
            System.out.print("Café(s) comprado(s) " + comprados + " unidades\n");
            System.out.print("Seu saldo restante é de: " + saldo);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    int saldo, opc, comprados;
	    
	    Scanner ler = new Scanner(System.in);
	    Cartao cartao = new Cartao();
	    
	    System.out.print("Selecione uma opção para prosseguir\n");
	    System.out.print("***** Opção 1 - Adicionar saldo ao cartão *****\n");
	    System.out.print("***** Opção 2 - Comprar café com o saldo disponível *****\n");
	    opc = ler.nextInt();
	    
	    if(opc == 1) {
	        System.out.print("Quanto de saldo deseja adicionar?: ");
	        saldo = ler.nextInt();
	        cartao.AdicionaSaldo(saldo);
	    } else {
	        if(cartao.saldo >= 0) {
	            System.out.print("Quantos cafés deseja comprar?: ");
	            comprados = ler.nextInt();
	            cartao.ComprarCafe(comprados);
	        } else {
	            System.out.print("Seu saldo atual é invalido \nRecarregue o cartão para continuar");
	        }
	    }
	}
}
