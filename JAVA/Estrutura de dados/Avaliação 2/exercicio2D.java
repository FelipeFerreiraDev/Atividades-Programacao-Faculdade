/* INSERE */
public void insere(No n){
        if(inicio == null){
            inicio = n;
            fim  = n;
        }
        else{
            fim.setProx(n);
            n.setAnt(fim);
            fim = n;
        }        
    }

/* REMOVE */
public void remove(String r){
        System.out.println("Removendo..."+r);
        No rem = busca(r);
        if(rem!=null){
            //verificar se nao é o inicio ou o fim da lista
            if(rem.equals(inicio)){
                No proximo = rem.getProx();
                proximo.setAnt(null);
                rem.setProx(null);
                inicio = proximo;
            }
            else if(rem.equals(fim)){
                No anterior = rem.getAnt();
                anterior.setProx(null);
                rem.setAnt(null);
                fim = anterior;
            }
            else{
                No anterior = rem.getAnt();
                No proximo = rem.getProx();
                anterior.setProx(rem.getProx());
                rem.setProx(null);
                proximo.setAnt(rem.getAnt());
                rem.setAnt(null);
            }
        }
}