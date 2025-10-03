package com.e_commerce_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {
	public void main(HttpServletResponse res , HttpServletRequest req) throws IOException {
		
		String []product_name = {"shirt" , "t-shirt" , "trouser" , "pant" , "jacket"};
		
		PrintWriter out = res.getWriter();
		
		for(int i = 0 ; i<product_name.length ; i++) {
			
			out.println(product_name[i]);
			
		}
		
		
		
	}

}
