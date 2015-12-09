/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.chamado.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Eduardo de Godoy Ferrari
 */
@Entity
@Table(name="grupo",schema="public")
public class Grupo implements Serializable {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codgrupo", unique=true, nullable=false)
    private int codGrupo;
    @Column(name = "nomegrupo" , nullable = false, length = 30)
    private String nomeGrupo;
    public Grupo() {
	
    }

    public int getCodGrupo() {
	return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
	this.codGrupo = codGrupo;
    }

    public String getNomeGrupo() {
	return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
	this.nomeGrupo = nomeGrupo;
    }
    
    
}
