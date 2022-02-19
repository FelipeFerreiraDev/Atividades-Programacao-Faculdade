/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author prog2
 */
@Entity
@Table(name="motorista")
@DiscriminatorValue("Motorista")
public class Motorista extends Pessoa {
    
    @Column(length = 30)
    private String cnh;
    
    @Column(length = 30)
    private String secao;

    public Motorista(String cnh, String secao) {
        this.cnh = cnh;
        this.secao = secao;
    }
    
    public Motorista(String nome, Endereco endereco) {
        super(nome, endereco);
    }
    
     public String toString() {
        return cnh + " - " + secao;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

}
