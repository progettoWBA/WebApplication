/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author FSEVERI\sinigaglia3584
 */
public class Articolo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "CODICEARTICOLO")
    private String codicePezzo;
 
    @Column(name = "NOME", nullable = false)
    private String nome;
 
 
    @Column(name = "DESCRIZIONE", nullable = false)
    private String descrizione;
    
    public Articolo(){}
    public Articolo(String nome, String descrizione){
        this.nome=nome;
        this.descrizione=descrizione;
    }

    public String getCodicePezzo() {
        return codicePezzo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setCodicePezzo(String codicePezzo) {
        this.codicePezzo = codicePezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
}
