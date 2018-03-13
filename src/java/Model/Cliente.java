/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author polato3547
 */
@Entity
@Table(name="CLIENTI")

public class Cliente {
    @GeneratedValue 
    @Column(name="PIVA")
    @Id
    private String piva;
    
    @Column(name="EMAIL")
    private String email;
    
    @Column(name="NOME")
    private String nome;
    
    @Column(name="COGNOME")
    private String cognome;
    
    @Column(name="TELEFONO")
    private String tel;
    
    @Column(name="TELEFONO2")
    private String tel2;
    
    @Column(name="DENOM_AZIENDA")
    private String azienda;
    
    @OneToMany(mappedBy="pivaCliente")
    private Set<NonConformita> nc;
    
    public Cliente(){}

    public String getPiva() {
        return piva;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTel() {
        return tel;
    }

    public String getTel2() {
        return tel2;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setPiva(String piva) {
        this.piva = piva;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }
    
    
    
}
