package com.palindrome;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class palindrome extends HttpServlet {
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String inp = req.getParameter("word");
        String reversed = "";
        

        for (int i = inp.length() - 1; i >= 0; i--) {
            reversed += inp.charAt(i);
        }
        
      
        if (inp.equalsIgnoreCase(reversed)) {
            out.println("<h2>" + inp + " is a Palindrome</h2>");
        } else {
            out.println("<h2>" + inp + " is NOT a Palindrome</h2>");
        }
        
        out.close();
    }
}
