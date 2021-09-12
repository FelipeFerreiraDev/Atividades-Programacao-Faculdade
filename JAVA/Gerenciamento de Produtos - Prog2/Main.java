import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      double valorEstoqueTotal = 0;

       ProdutoUnitario produto1 = new ProdutoUnitario(1, "Açucar União 5Kg", 8.95);

       ProdutoUnitario produto2 = new ProdutoUnitario(3, "Arroz Safra 5Kg", 15.65);

       ProdutoFracionado produto3 = new ProdutoFracionado(2, "Muçarela Marbarata", 33.95);

       ProdutoFracionado produto4 = new ProdutoFracionado(4, "Linguiceta Defante", 15.95);

       produto1.adicionarEstoque(15);
       produto2.adicionarEstoque(3);
       produto3.adicionarEstoque(0.500);
       produto4.adicionarEstoque(1.00);

       valorEstoqueTotal += produto1.calcularValorEmEstoque();
       valorEstoqueTotal += produto2.calcularValorEmEstoque();
       valorEstoqueTotal += produto3.calcularValorEmEstoque();
       valorEstoqueTotal += produto4.calcularValorEmEstoque();

       System.out.print("O valor total do estoque é de: R$" + Math.round(valorEstoqueTotal) +"\n");

       ArrayList<Produto> list = new ArrayList<Produto>();
       list.add(produto1);
       list.add(produto2);
       list.add(produto3);
       list.add(produto4);

       Collections.sort(list, new Comparador());
       System.out.print("\n");
       for(Produto prod : list) {
         System.out.print(prod.toString());
       }

       produto1.vender(3);
       System.out.print("\n"+produto1.getQuantidadeEstoque()+"\n");
       System.out.print("\n"+produto1.calcularValorEmEstoque()+"\n");
    }
}