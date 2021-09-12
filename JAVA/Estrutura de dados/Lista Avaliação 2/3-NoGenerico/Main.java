class Main {
  public static void main(String[] args) {
    Lista lista = new Lista();
    Produto p = new Produto();
    
    p.cadastraProd("prod1", 10.0, 5);

    Produto p2 = new Produto();
    p2.cadastraProd("prod2", 7.0, 5);

    lista.cadastra(new No(p));
    lista.cadastra(new No(p2));

    lista.imprimeLista();
  }
}