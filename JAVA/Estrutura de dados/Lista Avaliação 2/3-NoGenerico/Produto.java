public class Produto{

  String nomeProduto;
  double valorProduto;
  int quantidadeProduto;

  public void cadastraProd(String nome, double valor, int qtd){
    nomeProduto = nome;
    valorProduto = valor;
    quantidadeProduto = qtd;
  }

  public String toString(){
    return "Produto: "+nomeProduto+" Valor: "+valorProduto+" Qtd: "+quantidadeProduto;
  }
}