package web.etudiant;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "auth", urlPatterns = { "/authapi" })
public class EtudiantApi extends HttpServlet {
    private static final long serialVersionUID = 7577501469257262312L;
    private static final String Valid_email = "meriem.meriouma@gmail.com";
    private static final String Valid_password = "123456";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (email.equals(Valid_email) && password.equals(Valid_password))
            resp.sendRedirect("insert.html");
        else
            resp.sendRedirect("echec.html");
        HttpSession maSession = req.getSession(true);
        

    }
    
}