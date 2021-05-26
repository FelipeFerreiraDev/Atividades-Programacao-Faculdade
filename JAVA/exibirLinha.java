import java.util.Scanner;

class Linha {
    int comprimento; // atributo ou campo
   
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
        
        Linha linha = new Linha(); // cria objeto
        linha.comprimento = i;
        linha.desenhar();
    }
}
