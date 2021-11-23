/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empilhadesempilha;

/**
 *
 * @author felipe
 */
public class ExcecaoPilhaVazia extends Exception {
    public ExcecaoPilhaVazia(){
        super("Pilha Vazia"); 
    }
    
    public ExcecaoPilhaVazia(String msg){
        super(msg); 
    }
}
