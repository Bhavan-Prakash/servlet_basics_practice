package com.simple_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class add extends HttpServlet {

		public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
			
			int a = Integer.parseInt(req.getParameter("num1"));
			
			int b = Integer.parseInt(req.getParameter("num2"));
			
			int result = a+b;
			
			PrintWriter out = res.getWriter();
			
			out.println("the result is : " + result);
		}
}
