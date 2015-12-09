package br.com.chamado.util;

import br.com.chamado.model.Usuario;
//import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.Email;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.SimpleEmail;

public class EnviaEmail {

  //  private Email email;
    static final String host = "smtp.mail.yahoo.com.br";
    static final String porta = "465";
    static final String usuario = "eduardoferrari865@yahoo.com.br";
    static final String senha = "senha123";
    static final String emailDe = "eduardoferrari865@yahoo.com.br";
    static final String assunto = "Recuperação de Senha";
    private static EnviaEmail instance;

    private EnviaEmail() {

/*	email = new SimpleEmail();
	email.setHostName(host);
	email.setSslSmtpPort(porta);
	email.setAuthenticator(new DefaultAuthenticator(usuario, senha));
	email.setStartTLSEnabled(true);
	try {
	    email.setFrom(emailDe);
	    email.setSubject(assunto);
	} catch (EmailException e) {
	    System.out.println(e.getLocalizedMessage());
	} */
    }

    public static EnviaEmail getInstance() {
	if (instance == null) {
	    instance = new EnviaEmail();
	}
	return instance;
    }

    public void enviar(Usuario usuario) {

	/*
	try {

	    this.email.setMsg("Olá " + usuario.getEmail() + " a sua nova senha é:" + usuario.getSenha());
	    this.email.addTo(usuario.getEmail());
	    this.email.send();

	} catch (EmailException e) {
	    e.printStackTrace();
	}*/
	
    }
}
