package ponte;

public class Main {
    public static void main(String[] args) {
        Onibus o = new Onibus();
        
        Pessoa[] p = new Pessoa[1000];
        for(int i=0; i<=999; i++) {
           p[i] = new Pessoa("Pessoa "+i, o);
        }
        
        for(int i=0; i<=999; i++) {
           p[i].start();
        }
    }
}