package servlet;

import java.beans.Customizer;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
@WebServlet(name="Home", urlPatterns={"/home"})
public class Home extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
       
        
        if(session.getAttribute("account") != null)
        { 
            Account account = (Account)session.getAttribute("account");
            session.setAttribute("account", account);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        else 
        {
            response.sendRedirect("login");
        }
        
        
        
        		
		
   
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
       
       
    }


}
