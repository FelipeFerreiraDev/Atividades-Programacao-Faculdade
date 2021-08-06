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
		
	    int M[][] = new int[5][5];

      int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
	
	    Scanner ler = new Scanner(System.in);
	
	    for(int i = 0; i<5; i++) {
        for(int j = 0; j<5; j++) {
          System.out.print("Digite o valor para a linha " + (i+1) + " e coluna " + (j+1) + ": ");
          M[i][j] = ler.nextInt();;
        }
        System.out.print("\n");
	    }

      // A)
      System.out.print("A) SOMA DA LINHA 4 DE M É: ");

      for(int i = 0; i<5; i++) {
        a+=M[3][i];
      }
      System.out.print(a);
	    


      // B)
      System.out.print("\nB) SOMA DA COLUNA 2 DE M É: ");

      for(int i = 0; i<5; i++) {
        b+=M[i][1];
      }
      System.out.print(b);



      // C)
      System.out.print("\nC) SOMA DA DIAGONAL PRINCIPAL DE M É: ");

      for(int i = 0; i<5; i++) {
        c+=M[i][i];
      }
      System.out.print(c);



      // D)
      System.out.print("\nD) SOMA DA DIAGONAL SECUNDARIA DE M É: ");

      for(int i = 0; i<5; i++) {
        d+=M[4-i][i];
      }
      System.out.print(d);



      // E)
      System.out.print("\nE) SOMA DE TODOS OS ELEMENTOS DE M É: ");

      for(int i = 0; i<5; i++) {
        for(int j = 0; j<5; j++) {
          e+=M[i][j];
        }
      }
      System.out.print(e);


      // F)
      System.out.print("\nF) Exibir a matriz M: \n");

      for(int i = 0; i<5; i++) {
        for(int j = 0; j<5; j++) {
          System.out.print(M[i][j] + " | ");
        }
        System.out.print("\n");
      }
	}
}