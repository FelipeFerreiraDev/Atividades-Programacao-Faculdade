public void empilha(No n){
        if(topo == -1 || topo<(this.TAM-1)){
            topo = topo +1;
            pilha[topo] = n;
            System.out.println("Inserido na pilha "+n.tostring());
        }
        else{
            System.out.println("PILHA CHEIA...");
        }
    }

    public No desempilha(){
        if(topo !=-1){
            No temp = pilha[topo];
            pilha[topo] = null;
            topo = topo-1;
            System.out.println("desempilha: "+temp.tostring());
            return temp;
        }
        else{
            System.out.println("Pilha vazia");
            return null;
        }
    }