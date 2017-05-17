package br.ufc.crateus.web.aula8.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.ufc.crateus.web.aula8.repository.DatabaseManager;

@WebListener
public class AppListener implements ServletContextListener {

    public AppListener() {
    }

    public void contextDestroyed(ServletContextEvent arg0)  {
    	DatabaseManager.close();
    }

    public void contextInitialized(ServletContextEvent arg0)  {
    	DatabaseManager.init();
    }
	
}
