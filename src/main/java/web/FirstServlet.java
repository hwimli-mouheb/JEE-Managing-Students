package web;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "cs", urlPatterns = { "/" })
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1825023232864573043L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nom + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
