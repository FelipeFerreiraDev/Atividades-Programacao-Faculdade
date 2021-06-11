/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

public class Main
{
	public static void main(String[] args) {
		
	    int vetorA[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int vetorB[] = new int[10];
	
	    for(int i = 0; i<10; i++) {
	        vetorB[i] = vetorA[i];
	    }
	    
	    for(int i = 0; i<10; i++) {
	        System.out.print(vetorB[i] + "\n");
	    }
	}
}
