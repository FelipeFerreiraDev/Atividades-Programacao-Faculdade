import java.sql.SQLOutput;

public class Lista {

    No inicio;
    No fim;

    public void insereFim(No n){
        //verificar se lista vazia?
        if (inicio == null){
            //lista vazia
            inicio = n;
            fim = n;
        }
        else{
            //ultimo elemento q esta na lista
            //apontara para o novo elemento
            fim.setProximo(n);
            //atualiza o ponteiro fim para o novo elemento
            fim = n;
        }
        System.out.println("Elemento inserido com sucesso: "+n.toString());
    }

    //percorrer a lista e imprimir os elementos
    public void imprimeLista(){
        No aux = inicio;
        System.out.println(" === IMPRIMINDO LISTA ===");
        // inicio -> 1 -> 2 -> 4 -> 9 -> 7 <- fim
        while (aux!=null){
            System.out.println(aux.toString());
            //move o ponteiro aux para a proxima posicao
            aux = aux.getProximo();
        }
    }

    public No remove(String texto){
        No ant = null;
        No rem = inicio;

        while (rem!=null){
            if (rem.toString().contains(texto)){
                // encontramos o elemento a ser removido
                if (ant!=null){
                    ant.setProximo(rem.getProximo());
                    if (rem == fim){
                        fim = ant;
                    }
                    rem.setProximo(null);
                    System.out.println("Elemento removido. "+rem.toString());
                    return rem;
                }
                else{
                    //inicio da lista
                    inicio = rem.getProximo();
                    rem.setProximo(null);
                    if (fim == rem){
                        fim = rem.getProximo();
                    }
                    System.out.println("Elemento removido. "+rem.toString());
                    return rem;
                }
            }
            ant = rem;
            rem = rem.getProximo();
        }
        System.out.println("Elemento nao encontrado para remocao ");
        return null;
    }

    public No busca(String buscar){
        No aux = inicio;
        while(aux!=null){
            if (aux.toString().contains(buscar)){
                return aux;
            }
            aux = aux.getProximo();
        }
        return null;
    }

}