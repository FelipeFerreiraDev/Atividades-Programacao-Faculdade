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
		
	    int vetorA[] = new int[5];
        
        int vetorB[] = new int[5];
        
        int valor;
        
	    Scanner ler = new Scanner(System.in);
	
	    for(int i = 0; i<5; i++) {
	        System.out.print("Digite o valor para a posição " + i + " do vetor: ");
            valor = ler.nextInt();
            vetorA[i] = valor;
	    }
	    
	    for(int i = 0; i<5; i++) {
	        vetorB[i] = vetorA[i];   
	    }
	    
	    for(int i = 0; i<5; i++) {
	       System.out.print("Vetor B: " + vetorB[i]);
	       System.out.print("-");
	    }
	}
}