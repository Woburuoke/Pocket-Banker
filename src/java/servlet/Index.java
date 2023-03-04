package servlet;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Advert;
@WebServlet(name="Index", urlPatterns={"/index"})
public class Index extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
                EntityManagerFactory entityManagerFactory =
				 Persistence.createEntityManagerFactory("BankWebAppPU");
		EntityManager entityManager = 
				entityManagerFactory.createEntityManager();
                
                entityManager.getTransaction().begin();
		
		Query query = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 1", Advert.class);
                
                
                        
		Advert adverts = (Advert) query.getSingleResult();
                
		Query query2 = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 2", Advert.class);
		Advert advert2 = (Advert) query2.getSingleResult();
                
		Query query3 = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 3", Advert.class);
		Advert advert3 = (Advert) query3.getSingleResult();
                
		Query query4 = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 4", Advert.class);
		Advert advert4 = (Advert) query4.getSingleResult();
                
		Query query5 = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 5", Advert.class);
		Advert advert5 = (Advert) query5.getSingleResult();
                
		Query query6 = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 6", Advert.class);
		Advert advert6 = (Advert) query6.getSingleResult();
		
                Query query7 = entityManager.createNativeQuery(
				"SELECT * FROM adverts where id = 7", Advert.class);
		Advert advert7 = (Advert) query7.getSingleResult();
                
		HttpSession session = request.getSession();
		session.setAttribute("adverts", adverts);
		session.setAttribute("advert2", advert2);
		session.setAttribute("advert3", advert3);
		session.setAttribute("advert4", advert4);
		session.setAttribute("advert5", advert5);
		session.setAttribute("advert6", advert6);
                session.setAttribute("advert7", advert7);
                request.getRequestDispatcher("welcome.jsp").forward(request, response);

   
    } 

     


}
