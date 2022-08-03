package ponte;

public class Onibus {
    
    Boolean poltronas[] = new Boolean[21];
    
    public synchronized void comprar(Pessoa p) throws InterruptedException{
        if(poltronas[p.assento] == false) {
            poltronas[p.assento] = true;
            System.out.println(p.getName()+ " está no assento: " + p.assento);
            Thread.sleep(1000);
            System.out.println("");
        }
        else {
            System.out.println(p.getName()+ " Tentou comprar o assento: " + p.assento);
            Thread.sleep(1000);
            System.out.println("Poltrona já comprada!\n");
        }
    }
    
    public Onibus() {
        for(int i = 0; i<=20; i++) {
            poltronas[i] = false;
        }
    }
}