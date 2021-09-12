public class ProdutoUnitario extends Produto implements IProduto {
    private int quantidadeEstoque;

    public int getQuantidadeEstoque() {
      return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int qtd) {
      quantidadeEstoque = qtd;
    }

    public void adicionarEstoque(int add) {
      quantidadeEstoque += add;
    }

    public ProdutoUnitario(int codigo, String nome, double preco) {
      super(codigo, nome, preco);
    }

    public void vender(int add) {
      quantidadeEstoque -= add;
    }

    @Override
    public double calcularValorEmEstoque() {
      return getQuantidadeEstoque() * (super.getPreco());
    }
}