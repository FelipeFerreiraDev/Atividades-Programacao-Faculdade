public class Main {
    static int somatorio(int vetor[], int tam){
        if(tam == 0) {
            return 0;
        }
        if(vetor[tam-1] % 2 != 0){
            return somatorio(vetor,tam-1);
        }
        return vetor[tam-1] + somatorio(vetor,tam-1);
    }
    
    public static void main(String[] args) {
      int v [] = new int [100];
      for(int i=0; i<100; i++) {
        v[i] = i;
      }
      System.out.println(somatorio(v, 100));
    }
}
