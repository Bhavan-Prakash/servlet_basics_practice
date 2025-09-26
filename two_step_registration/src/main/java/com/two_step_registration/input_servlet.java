package com.two_step_registration;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class input_servlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		Cookie cookie1 = new Cookie("name1", name);
		Cookie cookie2 = new Cookie("email1", email);
		
		res.addCookie(cookie1);
		res.addCookie(cookie2);
		
		res.sendRedirect("inp");
		
	}

}
