/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.chamado.control;

import br.com.chamado.dao.DaoMensagem;
import br.com.chamado.model.Mensagem;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.HibernateException;

/**
 *
 * @author Eduardo de Godoy Ferrari
 */
@ManagedBean(name = "CtrMensagem")
@SessionScoped
public class CtrMensagem {

    private final DaoMensagem acessoHibernate;
    private Mensagem mensagem;
    public CtrMensagem() {
	acessoHibernate = new DaoMensagem();
    }

    public String gravarMensagem() {
	try {
            acessoHibernate.salvar(mensagem);
	    return "";
	} catch (HibernateException e) {
	    return "falha";
	}
    }

    public String alterarMensagem(Mensagem mensagem) {
	try {
            acessoHibernate.alterar(mensagem);
	    return "";
	} catch (HibernateException e) {
	    return "falha";
	}

    }
  public List carregarMensagem() {
	try {

	    return acessoHibernate.carregaTudoOrdernado(Mensagem.class, "nummensagem");
	} catch (HibernateException e) {
	    return null;
	}
    }
}
