public class Main {
  public static void main(String[] args) {
    Lista lista = new Lista();

    Livro livro1 = new Livro();
    livro1.cadastraLivro(123546, "Felipe", "Prog1", 200, "Estudo", "João");
    lista.cadastra(new No(livro1));

    lista.imprime();

    System.out.print(lista.buscaTitulo("Prog1"));
  }
}