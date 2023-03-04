package servlet;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
@WebServlet(name="Login", urlPatterns={"/login","/logout"})
public class Login extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String servletPath = request.getServletPath();
        HttpSession session = request.getSession();
        
        if(servletPath.equals("/logout"))
        {
            session.removeAttribute("account");
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
   
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
        String servletPath = request.getServletPath();
        HttpSession session = request.getSession();
        
        
        if(servletPath.equals("/login"))
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            EntityManager entityManager = 
                    Persistence.createEntityManagerFactory("BankWebAppPU").createEntityManager();
            
            entityManager.getTransaction().begin();
            
            Query query = entityManager.createNativeQuery("SELECT * FROM accounts WHERE Username = ? and Password= ?", Account.class);
            
            query.setParameter(1, username);
            query.setParameter(2, password);
            
            try 
            {
                Account account = (Account) query.getSingleResult();
                session.setAttribute("account", account);
                response.sendRedirect("home");
                
            }
            catch (NoResultException e) 
            {
                session.setAttribute("feedback", "Email and/or password is incorrect");
                response.sendRedirect("login");
                
            }
            
        }
       
    }


}
