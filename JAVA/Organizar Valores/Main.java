import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList();
        lista.add(new Pessoa(30, "John Backus", 
            LocalDate.of(1917, Month.APRIL, 12)));

        lista.add(new Pessoa(20, "Charles Babage",  
            LocalDate.of(1917, Month.APRIL, 01)));

        lista.add(new Pessoa(10, "Donald Knuth",  
            LocalDate.of(1917, Month.APRIL, 2)));

        lista.add(new Pessoa(40, "Ada Lovelace",  
            LocalDate.of(1917, Month.APRIL, 30)));
  
        for (Pessoa p : lista){
            System.out.println(p.getCodigo() + " - " + p.getNome());
        }
        
        Collections.sort(lista);
        
        for (int i=0; i < lista.size(); i++){
            Pessoa aux = lista.get(i);  
            System.out.println(aux.getNome());
        }

    }

}
