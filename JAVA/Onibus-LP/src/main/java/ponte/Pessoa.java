package ponte;


public class Pessoa extends Thread {
    Onibus onibus;
    
    public Pessoa(String nome, Onibus p){
        this.setName(nome);
        this.onibus = p;
    }
    
    @Override
    public void run(){
        try {
            onibus.comprar(this);
        } catch (InterruptedException ex) {
            
        }
    }
}