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
@Table(name="pagina",schema="public")
public class Pagina implements  Serializable{
    
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codpagina", unique=true, nullable=false)
    private int codPagina;
    @Column(name = "nomepagina" , nullable = false, length = 30)
    private String nomePagina;

    public int getCodPagina() {
	return codPagina;
    }

    public void setCodPagina(int codPagina) {
	this.codPagina = codPagina;
    }

    public String getNomePagina() {
	return nomePagina;
    }

    public void setNomePagina(String nomePagina) {
	this.nomePagina = nomePagina;
    }
    
    
    
}
