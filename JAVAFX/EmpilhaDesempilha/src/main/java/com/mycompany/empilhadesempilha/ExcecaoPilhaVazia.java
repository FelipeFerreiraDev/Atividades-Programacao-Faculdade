package com.mycompany.empilhadesempilha;

/**
 *
 * @author Felipe Ferreira
 */
public class ExcecaoPilhaVazia extends Exception {
    public ExcecaoPilhaVazia(){
        super("Pilha Vazia"); 
    }
    
    public ExcecaoPilhaVazia(String msg){
        super(msg); 
    }
}
