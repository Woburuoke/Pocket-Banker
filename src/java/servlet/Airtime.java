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

@WebServlet(name = "Airtime", urlPatterns = {"/airtime"})
public class Airtime extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("account") != null) {
            request.getRequestDispatcher("airtime.jsp").forward(request, response);
        } else {
            response.sendRedirect("login");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("account") != null) {

            Account account = (Account) session.getAttribute("account");

            String phoneNumber = request.getParameter("phoneNumber");
            String serviceProvider = request.getParameter("serviceProvider");
            int amount = Integer.parseInt(request.getParameter("amount"));

            String password = request.getParameter("password");

            String r8 = "0([789][01][0-9]{8})";

            if (phoneNumber.isEmpty() || serviceProvider.isEmpty() || request.getParameter("amount").isEmpty() || password.isEmpty()) {

                session.setAttribute("feedback", "One or more Fields are empty");
                response.sendRedirect("airtime");
            } else {
                if (phoneNumber.matches(r8)) {
                    if (account.getAccountbalance() > amount) {
                        if (account.getPassword().equals(password)) {
                            int senderNewBalance = (account.getAccountbalance() - amount);
                            EntityManager entityManager = Persistence.
                                    createEntityManagerFactory("BankWebAppPU").createEntityManager();

                            entityManager.getTransaction().begin();

                            int accountId = account.getId();

                            Account account3 = entityManager.find(Account.class, accountId);

                            account3.setAccountbalance(senderNewBalance);

                            entityManager.persist(account3);

                            entityManager.getTransaction().commit();

                            response.sendRedirect("airtimeFinal");

                        } else {
                            session.setAttribute("feedback", "Your Password is Incorrect");
                            response.sendRedirect("airtime");

                        }

                    } else {
                        session.setAttribute("feedback", "Insufficient Funds");
                        response.sendRedirect("airtime");

                    }

                } else {
                    session.setAttribute("feedback", "Invalid Phone Number");
                    response.sendRedirect("airtime");

                }

            }

        } else {
            response.sendRedirect("index");
        }

    }

}
