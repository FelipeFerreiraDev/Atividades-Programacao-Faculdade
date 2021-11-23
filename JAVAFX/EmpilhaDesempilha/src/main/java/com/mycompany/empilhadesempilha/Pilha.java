package com.mycompany.empilhadesempilha;

public class Pilha {

    No pilha[];
    int TAM;
    //ponteiro de controle da pilha
    int topo = -1;

    public Pilha(int tam) {
        pilha = new No[tam];
        this.TAM = tam;
    }

    //push
    public String empilha(No n){
        if(topo == -1 || topo<(this.TAM-1)) {
            topo = topo +1;
            pilha[topo] = n;
            return n.tostring();
        }
        else {
            return "PILHA CHEIA...";
        }
    }

    //pop
    public No desempilha() throws ExcecaoPilhaVazia{
        if(topo !=-1) {
            No temp = pilha[topo];
            pilha[topo] = null;
            topo = topo-1;
            return temp;
        }
        else {
            throw new ExcecaoPilhaVazia();
        }
    }

    public String imprime(int i){
        if(pilha[i].tostring() != null) {
            return ""+i+"-"+pilha[i].tostring();
        };
        return null;
    }
    
    public int retornaTopo() {
        return topo;
    }
}
