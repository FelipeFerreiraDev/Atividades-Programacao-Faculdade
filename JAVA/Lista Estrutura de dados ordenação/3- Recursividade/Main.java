import java.util.Scanner;

public class Main {
    public static int soma(int n){
        if(n==1){
            return 1;
        }
        return n + soma(n-1);
    }
    
    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        n = leitor.nextInt();
        System.out.println(soma(n));
    }
}
