package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class calculator_display_servlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int roll_no = (int)req.getAttribute("roll_no");
		int marks_1 = (int)req.getAttribute("marks_1");
		int marks_2 = (int)req.getAttribute("marks_2");
		int marks_3 = (int)req.getAttribute("marks_3");
		
		float percentage = (marks_1 + marks_2 + marks_3)/300 * 100;
		
		PrintWriter out = res.getWriter();
		out.println("hi there " + roll_no);
		out.println("your percentage is : " + percentage);
		
		
		

		
	}

}
