package br.com.chamado.util;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class EnviaEmail {

    // gmail 
    static final String host = "";
    static final String porta = "";
    static final String usuario = "";
    static final String senha = "";
    static final String emailDe = "eduardoferrari865@yahoo.com.br";
    static final String assunto = "Novo Chamado";
 
   
    private EnviaEmail() throws EmailException {

        SimpleEmail email = new SimpleEmail();  
        email.setHostName(host);
	email.addTo(emailDe,"Jose");
	email.setFrom(usuario,"Lucas");
	email.setSubject("Teste email simples");
	email.setMsg("Teste de Email utilizando commons-email"); //conteudo do e-mail  
        email.setAuthentication(usuario,senha);  
        email.setSmtpPort(465);  
        email.setSSLOnConnect(true);
	//email.setSSL(true);  
         email.setStartTLSRequired(true);
	//email.setTLS(true);  
         email.send();  
	

    }

    
}
