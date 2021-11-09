/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws ExcecaoPilhaVazia{
  
    Pilha pi = new Pilha(6);

      for (int i=0; i<7; i++){
            No n = new No("pilha:"+i);
            pi.empilha(n);
        }
        System.out.println("Imprime pilha...");

        pi.desempilha();
        pi.desempilha();
        pi.desempilha();
        pi.desempilha();
        pi.desempilha();
        pi.desempilha();
        pi.desempilha();
        pi.imprime();
  }    
}
