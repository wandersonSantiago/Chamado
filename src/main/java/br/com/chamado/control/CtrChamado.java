
package br.com.chamado.control;

import br.com.chamado.dao.DaoChamadoc;
import br.com.chamado.model.Chamadoc;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.HibernateException;

/**
 *
 * @author Eduardo de Godoy Ferrari
 */
@ManagedBean(name = "ctrChamado")
@SessionScoped
public class CtrChamado {
    
    private final  DaoChamadoc acessoHibernate;
    private Chamadoc chamadoc;
    public CtrChamado()
    {
	
     acessoHibernate = new DaoChamadoc();
    }
    
    public String gravarChamado() {
	try {
	    acessoHibernate.salvar(chamadoc);
	    return "";
	} catch (HibernateException e) {
	    return "falha";
	}
    }
 
    public String  alterarChamado(Chamadoc chamdo)
    {
       try
       {
	    acessoHibernate.alterar(chamdo);
	   return "";
       }catch(HibernateException e)
       {
         return "falha";
       }
	    
    }
    public List carregarChamado()
    {
      try
      {
	  
	 return acessoHibernate.carregaTudoOrdernado(Chamadoc.class, "nome");
      }catch(HibernateException e)
      {
        return null;
      }
    }
}
