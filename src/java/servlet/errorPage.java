/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
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

/**
 *
 * @author CHINDAH
 */
@WebServlet(name = "errorPage", urlPatterns = {"/errorPage"})
public class errorPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("BankWebAppPU");
        EntityManager entityManager
                = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createNativeQuery(
                "SELECT * FROM adverts where id = 8", Advert.class);
        Advert errorGif = (Advert) query.getSingleResult();

        HttpSession session = request.getSession();
        session.setAttribute("errorGif", errorGif);
        request.getRequestDispatcher("errorPage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("errorPage");

    }

}
