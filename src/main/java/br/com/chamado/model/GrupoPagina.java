package br.com.chamado.model;
// Generated 09/12/2015 11:21:41 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Grupopagina generated by hbm2java
 */
@Entity
@Table(name = "grupopagina", schema = "public"
)
public class GrupoPagina implements java.io.Serializable {

    private int codgrupopagina;
    private Grupo grupo;
    private Pagina pagina;

    public GrupoPagina() {
    }

    public GrupoPagina(int codgrupopagina, Grupo grupo, Pagina pagina) {
	this.codgrupopagina = codgrupopagina;
	this.grupo = grupo;
	this.pagina = pagina;
    }

    @Id

    @Column(name = "codgrupopagina", unique = true, nullable = false)
    public int getCodgrupopagina() {
	return this.codgrupopagina;
    }

    public void setCodgrupopagina(int codgrupopagina) {
	this.codgrupopagina = codgrupopagina;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codgrupo", nullable = false)
    public Grupo getGrupo() {
	return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
	this.grupo = grupo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codpaigna", nullable = false)
    public Pagina getPagina() {
	return this.pagina;
    }

    public void setPagina(Pagina pagina) {
	this.pagina = pagina;
    }

}