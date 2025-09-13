package com.currency_conversion;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class display_servlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int l = (int)req.getAttribute("result");
		
		int z = Integer.parseInt(req.getParameter("inp"));
		
		PrintWriter obj = res.getWriter();	
		
		obj.println(z + "in usd is : " + l );
	}

}
