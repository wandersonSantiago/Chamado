package br.com.chamado.util;

import br.com.chamado.model.EmailConfig;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class EnviaEmail {

    private static EmailConfig config;
    private static EnviaEmail instancia = null;
   
    private  String emailDe = "";
    private  String assunto = "";
    private  String msg = "";
   
    private EnviaEmail()
    {
    }
    public static EnviaEmail getInstancia() 
    {
      
       if(instancia == null)
       {
         instancia = new EnviaEmail();
 	 config = EmailConfig.getInstancia();
       }
       return instancia;
    }

   public void setEmailDe(String emailDe) {
	this.emailDe = emailDe;
    }  
    public void setAssunto(String assunto) {
	this.assunto = assunto;
    }

  
    public void setMsg(String msg) {
	this.msg = msg;
    }
    
    public  synchronized  void enviar()  throws EmailException
    {
        SimpleEmail email = new SimpleEmail(); 
	email.setHostName(config.getHost());
	email.setAuthentication(config.getUsuario(),config.getSenha());  
        email.setSmtpPort(config.getPorta());  
        email.setSSLOnConnect(config.isSsl());
	email.setStartTLSRequired(config.isTls());
	email.addTo(emailDe,"Teste");
	email.setFrom(config.getUsuario(),config.getMsgFrom());
	email.setSubject(assunto);
	email.setMsg(msg);
        email.send();
	}
}
