import java.time.LocalDate;

public class Pessoa implements Comparable {
    private Integer codigo;
    private String nome;
    private LocalDate nascimento;
    
    public Pessoa(){
        this.codigo = 0;
        this.nome = "";
    }

    public Pessoa(Integer codigo, String nome, LocalDate nascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
    }
  
    
    // ordena por valores semelhantes a string
    @Override
    public int compareTo(Object o){
        Pessoa outra = (Pessoa) o; 
        return this.nascimento.compareTo(outra.getNascimento());         
    }
 
    
    /* ordena pelo codigo 
    @Override
    public int compareTo(Object o) {
        Pessoa outra = (Pessoa) o;
        if (this.codigo < outra.getCodigo()){
            return -1;
        }
        if (this.codigo == outra.getCodigo()){
            return 0;
        }
        return 1;
    }*/
    
  
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}