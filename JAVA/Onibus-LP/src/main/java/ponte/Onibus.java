package ponte;

public class Onibus {
    
    Boolean poltronas[] = new Boolean[1000];
    
    public void comprar(Pessoa p) throws InterruptedException{ 
        int i = poltronasLivres();
      //  long start = System.nanoTime();
        if(poltronas[i] == false) {
            poltronas[i] = true;
            System.out.println(p.getName()+ " está no assento: " + i);
        }
        else {
            System.out.println(p.getName()+ " Tentou comprar o assento: " + i + " Poltrona já comprada");
        }
        //long tempofinal = System.nanoTime();
        //System.out.println("Seg: "+ (tempofinal - start)+ "\n");
    }
    
    public Onibus() {
        for(int i = 0; i<=999; i++) {
            poltronas[i] = false;
        }
    }
    
    public Integer poltronasLivres() {
        for(int i = 0; i<=999; i++) {
            if(poltronas[i] == false) {
                return i;
            }
        }
        return null;
    }
}