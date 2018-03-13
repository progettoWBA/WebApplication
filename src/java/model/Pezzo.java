/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author FSEVERI\sinigaglia3584
 */
 
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
 
 
@Entity
@Table(name="PEZZO")
public class Pezzo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "CODICEPEZZO")
    private String codicePezzo;
 
    @Column(name = "NOME", nullable = false)
    private String nome;
 
 
    @Column(name = "DESCRIZIONE", nullable = false)
    private String descrizione;
    
    public Pezzo(){}
    
    public Pezzo(String nome, String descrizione){
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
    @ManyToMany
    @JoinTable(
        name = "Employee_Project", 
        joinColumns = { @JoinColumn(name = "CODICEPEZZO") }, 
        inverseJoinColumns = { @JoinColumn(name = "CODICEARTICOLO") }
    )
    private Set<Articolo> articoli = new HashSet<>();

    public Set<Articolo> getArticoli() {
        return articoli;
    }

    public void setArticoli(Set <Articolo> articoli) {
        this.articoli = articoli;
    }
    @OneToMany(mappedBy="pezzo")
    private Set<NonConformita> nonConf= new HashSet<>();

    public Set<NonConformita> getNonConf() {
        return nonConf;
    }

    public void setNonConf(Set<NonConformita> nonConf) {
        this.nonConf = nonConf;
    }
    
}
