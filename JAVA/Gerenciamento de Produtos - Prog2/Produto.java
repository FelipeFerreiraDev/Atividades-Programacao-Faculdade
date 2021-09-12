public abstract class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public int getCodigo() {
      return codigo;
    }

    public void setCodigo(int codigo) {
      this.codigo = codigo;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public double getPreco() {
      return preco;
    }

    public void setPreco(double preco) {
      this.preco = preco;
    }

    public Produto(int codigo, String nome, double preco) {
      setCodigo(codigo);
      setNome(nome);
      setPreco(preco);
    }

    @Override
      public String toString() {
        return codigo + "-" + nome + "\n";
      }
}