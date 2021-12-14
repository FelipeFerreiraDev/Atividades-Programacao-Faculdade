public class No {
    int key;
    Object o;

    No filhoDireita;
    No filhoEsquerda;


    No pai;

    public No(Object ob, int k){
        this.o = ob;
        this.key = k;
    }
    public No(){}

    public void setObjKey(Object ob, int k){
        this.o = ob;
        this.key = k;
    }

    public int getKey(){
        return this.key;
    }

    public No getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(No filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public void setKey(int k){
        this.key = k;
    }

    public No getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(No filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public No getPai() {
        return pai;
    }

    public void setPai(No pai) {
        this.pai = pai;
    }

    public String toString(){
        return key+ " - "+o.toString();
    }
}
