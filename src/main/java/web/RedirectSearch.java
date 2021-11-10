package web;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = { "/searchEngine" })
public class RedirectSearch extends HttpServlet {
   
boolean switchEngine =true;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	
    	String search =req.getParameter("search");
    	switchEngine=!switchEngine;
       if(switchEngine) {
    	   resp.sendRedirect("https://www.google.com/search?q="+search);
       }else {
    	   resp.sendRedirect("https://search.yahoo.com/search?p="+search);
       }
       
           
       // HttpSession maSession = req.getSession();
        

    }
    
}