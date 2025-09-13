package com.login_verification;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class check_servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("user_name");
		
		int password = Integer.parseInt(req.getParameter("pass"));
		
		//below code is using the session maintaining method
		
		HttpSession ses = req.getSession();
		
	
 		
		if(name.equals("bhav") && password == 123) {
			ses.setAttribute("name", name);
			
			res.sendRedirect("successful");
		}else {
			ses.setAttribute("name", name);
			
			res.sendRedirect("unsucessful");
		}
		
	}

}
