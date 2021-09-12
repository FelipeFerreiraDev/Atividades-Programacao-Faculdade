public class ProdutoFracionado extends Produto implements IProduto {
    private double quantidadeEstoque;

    public double getQuantidadeEstoque() {
      return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(double qtd) {
      quantidadeEstoque = qtd;
    }

    public ProdutoFracionado(int codigo, String nome, double preco) {
      super(codigo, nome, preco);
    }

    public void adicionarEstoque(double qtd) {
      quantidadeEstoque += qtd;
    }

    public void vender(double qtd) {
      quantidadeEstoque -= qtd;
    }

    @Override
    public double calcularValorEmEstoque() {
      return getQuantidadeEstoque() * (super.getPreco());
    }
}