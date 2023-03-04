package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="TransferFinal", urlPatterns={"/transferFinal"})
public class TransferFinal extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session = request.getSession();
        if (session.getAttribute("account") != null) {
            request.getRequestDispatcher("transferFinal.jsp").forward(request, response);
        } else {
            response.sendRedirect("login");
        }

   
    } 



}
