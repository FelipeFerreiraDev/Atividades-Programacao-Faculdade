/*
*
*   GitHub: https://github.com/FelipeFerreiraDev/Prog-Faculdade
*
*
*/


import java.util.Scanner;

class Aluno {
    String nome;
    int mediaNotas;
 
    void Exibe() {
        System.out.printf("O nome do aluno é: %s", nome);
        System.out.printf("\nA média do aluno é: %d\n", mediaNotas);
    }   
}

class Main {
    public static void main(String[] args) {
        String nome;
        int media;
        
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        Scanner ler3 = new Scanner(System.in);
        Scanner ler4 = new Scanner(System.in);
        Scanner ler5 = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
     
        System.out.print("Digite o nome para o Aluno 1: ");
        nome = ler.nextLine();
        System.out.print("Digite a média para o Aluno 1: ");
        media = ler.nextInt();

        aluno1.nome = nome;
        aluno1.mediaNotas = media;
        
        aluno1.Exibe();
        
        System.out.print("Digite o nome para o Aluno 2: ");
        nome = ler2.nextLine();
        System.out.print("Digite a média para o Aluno 2: ");
        media = ler2.nextInt();
        
        aluno2.nome = nome;
        aluno2.mediaNotas = media;

        aluno2.Exibe();

        System.out.print("Digite o nome para o Aluno 3: ");
        nome = ler3.nextLine();
        System.out.print("Digite a média para o Aluno 3: ");
        media = ler3.nextInt();
        
        aluno3.nome = nome;
        aluno3.mediaNotas = media;

        aluno3.Exibe();
        
        System.out.print("Digite o nome para o Aluno 4: ");
        nome = ler4.nextLine();
        System.out.print("Digite a média para o Aluno 4: ");
        media = ler4.nextInt();
        
        aluno4.nome = nome;
        aluno4.mediaNotas = media;

        aluno4.Exibe();
        
        System.out.print("Digite o nome para o Aluno 5: ");
        nome = ler5.nextLine();
        System.out.print("Digite a média para o Aluno 5: ");
        media = ler5.nextInt();
        
        aluno5.nome = nome;
        aluno5.mediaNotas = media;

        aluno5.Exibe();
    }
}