import java.util.Scanner;

public class Main {
    public static int potencia(int n, int expoente){
        if(expoente==0){
            return 1;
        }
        return n * potencia(n,expoente-1);
    }

    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de n:");
        n = leitor.nextInt();
        System.out.println("Digite o valor da potencia");
        int pot = leitor.nextInt();
        System.out.println(potencia(n,pot));
    }
}
