public class Livro {
  long isbnLivro;
  String autor;
  String nomeLivro;
  int numPaginas;
  String categoria;
  String emprestado;

  public void cadastraLivro(long isbnLivro, String autor, String nomeLivro, int numPaginas, String categoria, String emprestado) {
    this.isbnLivro = isbnLivro;
    this.autor = autor;
    this.nomeLivro = nomeLivro;
    this.numPaginas = numPaginas;
    this.categoria = categoria;
    this.emprestado = emprestado;
  }

  @Override
  public String toString() {
    return "\n Livro: " 
    + "\nisbn do livro = " + isbnLivro
    + "\nAutor = " + autor 
    + "\nNome do livro = " + nomeLivro 
    + "\nNúmero de páginas = " + numPaginas 
    + "\nCategoria = " + categoria 
    + "\nEmprestado = " + emprestado;
  };
}