package com.login_verification;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class sucessful_servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession ses = req.getSession();
		
		String name = (String)ses.getAttribute("name");
		
		PrintWriter out = res.getWriter();
		
		out.println("Welcome " + name + " You have successfully logged in !!!");
		
	}

}
