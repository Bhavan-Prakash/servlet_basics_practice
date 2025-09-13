package com.login_verification;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class unsucessful_servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		HttpSession ses = req.getSession();
		
		String name = (String)ses.getAttribute("name");
		
		PrintWriter out = res.getWriter();
		
		out.println("Sorry " + name + " you have entered wrong user-name or Password");
		
	}

}
