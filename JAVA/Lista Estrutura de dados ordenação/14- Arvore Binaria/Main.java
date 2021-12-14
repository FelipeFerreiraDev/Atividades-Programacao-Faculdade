import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();

        No n1 = new No();
        n1.setObjKey("Ola",20);

        ab.insere(n1);


        No n2 = new No();
        n2.setObjKey("A",2);

        ab.insere(n2);

        No n3 = new No();
        n3.setObjKey("Z",3);

        ab.insere(n3);

        ab.insere(new No("Novo",15));


        No search_el = ab.search(20);
        if (search_el!=null)
            System.out.println(search_el.toString());
        else
            System.out.println("Elemento nao encontrado");

        System.out.println("Imprimindo em pre ordem");
        ab.preOrdem(ab.raiz);

        System.out.println("Imprimindo em pos ordem");
        ab.posOrdem(ab.raiz);

        System.out.println("Imprimindo em  ordem");
        ab.emOrdem(ab.raiz);

    }
}
