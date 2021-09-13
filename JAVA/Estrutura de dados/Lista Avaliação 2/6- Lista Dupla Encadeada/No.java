public class No {

    //Objeto generico - pode ser de qqr tipo
    Object obj;
    //ponteiro para o proximo elemento
    No proximo;

    public No(Object o){
        obj = o;
    }

    public Object getObj(){
        return obj;
    }

    public String toString(){
        return obj.toString();
    }

    public void setProximo(No n){
        proximo = n;
    }
    public No getProximo(){
        return proximo;
    }

}