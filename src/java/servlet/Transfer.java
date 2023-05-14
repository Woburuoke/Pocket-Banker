package servlet;

import java.io.IOException;
import static java.lang.System.console;
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

@WebServlet(name = "Transfer", urlPatterns = {"/transfer"})
public class Transfer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("account") != null) {
            request.getRequestDispatcher("transfer.jsp").forward(request, response);
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

            String destinationBank = request.getParameter("destinationBank");
            String accountNumber = request.getParameter("accountNumber");
            int amount = Integer.parseInt(request.getParameter("amount"));
            String narration = request.getParameter("narration");
            String password = request.getParameter("password");

            EntityManager entityManager
                    = Persistence.createEntityManagerFactory("BankWebAppPU").createEntityManager();

            entityManager.getTransaction().begin();

            Query query = entityManager.createNativeQuery("SELECT * FROM accounts WHERE Bankname = ? and accountnumber = ?", Account.class);

            query.setParameter(1, destinationBank);
            query.setParameter(2, accountNumber);
            try {
                Account account2 = (Account) query.getSingleResult();

                if (password.equals(account.getPassword())) {
                    if (account.getAccountbalance() > amount) {

                        if (account.getBankName().equals(destinationBank) && account.getAccountNumber().equals(accountNumber)) {

                            session.setAttribute("feedback", "Cannot Transfer to Self");
                            response.sendRedirect("transfer");

                        } else {

                            session.setAttribute("amount", amount);
                            session.setAttribute("account2", account2);
                            request.getRequestDispatcher("transferConfirmation").forward(request, response);

                        }

                    } else {
                        session.setAttribute("feedback", "Insufficient Funds");
                        response.sendRedirect("transfer");

                    }

                } else {
                    session.setAttribute("feedback", "Your Password is Incorrect");
                    response.sendRedirect("transfer");

                }

            } catch (NoResultException e) {
                session.setAttribute("feedback", "User account does not exist");
                response.sendRedirect("transfer");

            }

        } else {
            response.sendRedirect("index");
        }

    }

}
