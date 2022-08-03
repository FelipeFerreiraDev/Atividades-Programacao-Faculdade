package ponte;


public class Pessoa extends Thread {
    Onibus onibus;
    Integer assento;
    
    public Pessoa(String nome, Onibus p, Integer assento){
        this.setName(nome);
        this.onibus = p;
        this.assento = assento;
    }
    
    @Override
    public void run(){
        try {
            onibus.comprar(this);
        } catch (InterruptedException ex) {
            
        }
    }
}