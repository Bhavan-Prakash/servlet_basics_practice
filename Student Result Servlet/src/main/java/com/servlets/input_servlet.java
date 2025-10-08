package com.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class input_servlet extends HttpServlet {
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		int roll_no = Integer.parseInt(req.getParameter("roll_no"));
		int marks_1 = Integer.parseInt(req.getParameter("marks_1"));
		int marks_2 = Integer.parseInt(req.getParameter("marks_2"));
		int marks_3 = Integer.parseInt(req.getParameter("marks_3"));
		
		req.setAttribute("roll_no", roll_no);
		req.setAttribute("marks_1", marks_1);
		req.setAttribute("marks_2", marks_2);
		req.setAttribute("marks_3", marks_3);
		
		RequestDispatcher rd = req.getRequestDispatcher("calc");
		
		rd.forward(req, res);

			
		
		
 	}

}
