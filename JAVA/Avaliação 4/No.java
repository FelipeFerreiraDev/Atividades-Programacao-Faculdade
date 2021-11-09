public class No<T> {
    T nome;

    public No(T n){
        this.nome = n;
    }

    public String tostring(){
        return  "T: "+nome;
    }
}