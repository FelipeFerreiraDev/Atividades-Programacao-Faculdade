/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    int G[] = new int[13];
      int R[] = new int[13];

      int acertos = 0;
      int valor = 0;
	
	    Scanner ler = new Scanner(System.in);
	
	    for(int i = 0; i<13; i++) {
        System.out.print("Digite o valor do gabarito "+i+": ");
            valor = ler.nextInt();
            G[i] = valor;
	    }

      System.out.print("\n")

      for(int i = 0; i<13; i++) {
        System.out.print("Digite o valor da resposta do usuário "+i+": ");
            valor = ler.nextInt();
            R[i] = valor;
	    }

      for(int i = 0; i<13; i++) {
        if(G[i]==R[i]) {
          acertos++;
        }
	    }

      if(acertos==13) {
        System.out.print("GANHADOR, PARABÉNS");
      }
	}
}