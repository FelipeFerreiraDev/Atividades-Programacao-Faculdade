class Main {

  static int fatorial(int x){
    if(x == 1 || x == 0){
      return 1;
    }else{
      return x*fatorial(x-1);
    }
  }

  public static void main(String[] args) {
    int x = 4;

    System.out.printf("%d\n", fatorial(x));
  }
}


/**
* SEM RECURSIVIDADE

class Main {
    public static void main(String[] args) {
        int fat = 1;
        int valor = 3; // Valor para calcular o fatorial

        for( int i = 2; i <= valor; i++ ) {
          fat *= i;
        }

        System.out.println( "O fatorial de " + valor + " é igual a " + fat );
    }
}
*/