public class Lista {
  static No lista[] = new No[2000];
  static int fimLista = -1;

  public void cadastra(No p) {
    if(fimLista == -1 || fimLista < (lista.length-1)) {
      fimLista++;
      lista[fimLista] = p;
    } else {
      System.out.print("\n Lista Lotada");
    }
  }

  public int busca(String nome) {
    for (int i = 0; i<=fimLista ; i++) {
      if(lista[i].toString().contains(nome)) {
        return 1;
      }
    }
    return -1;
  }

  public String buscaTitulo(String nome) {
    int n = busca(nome);
    return lista[n].toString();
  }

  public void imprime() {
    for(int i = 0; i <= fimLista; i++) {
      System.out.print("\n"+lista[i].toString());
    }
  }
}