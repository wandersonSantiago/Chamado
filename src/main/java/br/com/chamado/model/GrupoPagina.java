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
@Table(name="grupopagina",schema="public")
public class GrupoPagina implements  Serializable{
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codgrupopagina", unique=true, nullable=false)
    private int codGrupopagina;
    @Column(name = "codgrupo" , nullable = false, length = 30)
    private int codgrupo;
     @Column(name = "codpagina" , nullable = false, length = 30)
    private int codpaigna;
     
     
     
     
}
