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
		
	    int vetorA[] = new int[20];
        
        int valor;
        int aux;
        int tamanho = 20;
	
	    Scanner ler = new Scanner(System.in);
	
	    for(int i = 0; i<20; i++) {
	        System.out.print("Digite o valor para a posição " + i + " do vetor: ");
            valor = ler.nextInt();
            vetorA[i] = valor;
	    }
	    
	    for(int i = 0; i<10; i++) {
	        aux = vetorA[i];
	        vetorA[i] = vetorA[tamanho-1];
	        vetorA[tamanho-1] = aux;
	        tamanho--;
	    }
	    
	    for(int i = 0; i<20; i++) {
	        System.out.print(vetorA[i] + "\n");
	    }
	}
}
