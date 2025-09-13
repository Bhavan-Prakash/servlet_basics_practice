package com.even_odd;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class check extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int ch = Integer.parseInt(req.getParameter("number"));
		
		PrintWriter obj = res.getWriter();
		
		if(ch%2 == 0) {
			obj.println(ch + " is even");
		}
		else {
			obj.println(ch + " is odd" );
		}
	}

}
