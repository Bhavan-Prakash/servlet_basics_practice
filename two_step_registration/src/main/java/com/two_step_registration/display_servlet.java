package com.two_step_registration;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class display_servlet extends HttpServlet {
	
    public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
        String name = "";
        String email = "";
        
        Cookie cookies[] = req.getCookies(); 
        
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("name1")) {
                    name = c.getValue();
                }
                if (c.getName().equals("email1")) {
                    email = c.getValue();
                }
            }
        }
        

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Name: " + name + "</h1>");
        out.println("<h1>Email: " + email + "</h1>");
    }
}
