/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/


import java.util.Scanner;

class Linha {
    int comprimento;
   
    void desenhar(){
        for (int i=0; i<comprimento; i++){
            System.out.print('_');
        }
        
        System.out.print("\n\n");
    }
}

class Main {
    public static void main(String[] args) {
        int i;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe um comprimento: ");
        i = ler.nextInt();
        
        Linha linha = new Linha();
        linha.comprimento = i;
        linha.desenhar();
    }
}
