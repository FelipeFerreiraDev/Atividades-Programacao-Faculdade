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
		
	    int vetor[] = new int[15];

      int multi = 1, valor = 0;
	
	    Scanner ler = new Scanner(System.in);
	
	    for(int i = 0; i<15; i++) {
        System.out.print("Digite o valor do indice "+i+": ");
            valor = ler.nextInt();
            vetor[i] = valor;
	    }

      System.out.print("\n");

      for(int i = 0; i<15; i++) {
        if(vetor[i]%2 == 0) {
          multi *= vetor[i];
        }
      }

      System.out.print("O valor da multiplicação dos números pares do vetor é: "+multi);
	}
}