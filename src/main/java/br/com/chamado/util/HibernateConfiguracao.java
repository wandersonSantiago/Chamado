/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.chamado.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.Log;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 *
 * @author wandersonSantiago
 */

public class HibernateConfiguracao {
  
    private static SessionFactory sessionFactory;
    
    
    public Session openSession()
    {
         
	if(sessionFactory == null)
	 {
	   
	     criaSessionFactory();   
     	 }
       return sessionFactory.openSession();
    }
    public void criaSessionFactory()
    {
         Configuration configuracao = new Configuration();
	
	 
	 configuracao.addAnnotatedClass(Log.class);
	 ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
	 
	 sessionFactory = configuracao.buildSessionFactory(serviceRegistry);
	 
	
    }
}


