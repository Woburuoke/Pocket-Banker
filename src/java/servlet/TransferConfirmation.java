package servlet;

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

@WebServlet(name = "TransferConfirmation", urlPatterns = {"/transferConfirmation"})
public class TransferConfirmation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("account") != null) {
            request.getRequestDispatcher("transferConfirmation.jsp").forward(request, response);
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
            Account account2 = (Account) session.getAttribute("account2");
            int amount = (int) session.getAttribute("amount");

            int recieverNewBalance = (account2.getAccountbalance() + amount);
            int senderNewBalance = (account.getAccountbalance() - amount);

            EntityManager entityManager = Persistence.
                    createEntityManagerFactory("BankWebAppPU").createEntityManager();

            entityManager.getTransaction().begin();

            int accountId = account.getId();
            int account2Id = account2.getId();

            Account account3 = entityManager.find(Account.class, accountId);
            Account account4 = entityManager.find(Account.class, account2Id);

            account3.setAccountbalance(senderNewBalance);
            account4.setAccountbalance(recieverNewBalance);

            entityManager.persist(account3);
            entityManager.persist(account4);

            entityManager.getTransaction().commit();

//        session.setAttribute("feedback", "Transfer Successful");
            response.sendRedirect("transferConfirmation");

        } else {
            response.sendRedirect("index");
        }

    }

}
