/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
* 
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int v1, v2, v3;
        float media;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor da nota 1: ");
        v1 = ler.nextInt();
        System.out.print("Digite o valor da nota 2: ");
        v2 = ler.nextInt();
        System.out.print("Digite o valor da nota 3: ");
        v3 = ler.nextInt();
        
        media = (v1 + v2 + v3) / 3;
        
        System.out.print("A média é de: "+ media);
    }
}