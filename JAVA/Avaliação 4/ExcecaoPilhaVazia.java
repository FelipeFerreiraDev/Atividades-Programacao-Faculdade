public class ExcecaoPilhaVazia extends Exception {
    public ExcecaoPilhaVazia(){
        super("Pilha Vazia"); 
    }
    
    public ExcecaoPilhaVazia(String msg){
        super(msg); 
    }
}

/* Outro método
*  public class ExcecaoPilhaVazia extends Exception {
    @Override
    public String getMessage() {
      return "Pilha Vazia";
    }
}
*/