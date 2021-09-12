public class Lista {

    static No lista[] = new No[5];
    static int fim = -1;

    public void cadastra(No posi){
        if (fim == -1 || fim < (lista.length-1)){
            fim++;
            lista[fim] = posi;
        }
    }

    public void imprimeLista(){
        System.out.println("Imprime Lista");
        for (int i = 0; i <= fim; i++) {
            System.out.println(" Posição: "+i+ " "+ lista[i].toString());
        }
    }

    public int busca(String nome){
        for (int i = 0; i <= fim ; i++) {
            if (lista[i].toString().contains(nome)){
                return i;
            }
        }
        return -1;
    }

    public void limpaLista(){
      for (int i = 0; i <= fim; i++) {
            lista[i] = null;
        }
        System.out.println("lista limpa!");
        fim = -1;
    }

    public No remove(String nome){
        int posi = busca(nome);
        No aux = lista[posi];
        for (int i = posi; i < fim ; i++) {
            lista[i] = lista[i+1];
        }
        lista[fim] = null;
        fim--;
        return aux;
    }
}