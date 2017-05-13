package br.ufc.crateus.web.aula8.listener;

import javax.persistence.EntityManager;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import br.ufc.crateus.web.aula8.repository.DatabaseManager;

@WebListener
public class RequestListener implements ServletRequestListener {

    public RequestListener() {
    }

    public void requestInitialized(ServletRequestEvent reqEvent)  {
    	reqEvent.getServletRequest().setAttribute("em", DatabaseManager.getEmf().createEntityManager());
    	System.out.println("Inicializar EM");
    }
	
    public void requestDestroyed(ServletRequestEvent reqEvent)  {
    	EntityManager em = (EntityManager) reqEvent.getServletRequest().getAttribute("em");
    	em.close();
    	System.out.println("Fechar EM");
    }
    
}
