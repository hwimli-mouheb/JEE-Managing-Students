package web.etudiant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = { "/supprimerServlet" })
public class supprimerServlet extends HttpServlet {
    private static final long serialVersionUID = 7577501469257262312L;
    private static final String Valid_email = "meriem.meriouma@gmail.com";
    private static final String Valid_password = "123456";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cin = req.getParameter("cin");
        ArrayList<Etudiant> list = (ArrayList<Etudiant>) req.getAttribute("data");
        list.remove(cin);
        req.setAttribute("data", Etudiant.etudiantList);
        RequestDispatcher rd = req.getRequestDispatcher("etudiant/affiche.jsp");
        rd.forward(req, resp);
       
           
       // HttpSession maSession = req.getSession();
        

    }
    
}