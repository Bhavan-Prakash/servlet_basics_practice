package com.multi_level_form_with_cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class display extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
        String name = "";
        String age = "";
        String sex = "";
        String quali = "";
		
		Cookie[] cookies = req.getCookies();
		
		for(Cookie c : cookies) {
			switch(c.getName()) {
			case "name":
				name = c.getValue();
				
			case "sex":
				sex = c.getValue();
				
			case "age":
				age = c.getValue();
				
			case "quali":
				quali = c.getValue();
			}
		}
		
		PrintWriter out = res.getWriter();
		
		out.println("name is : " + name);
		
		out.println("age is : " + age);
		
		out.println("sex is : " + sex);
		
		out.println("qualification is : " + quali);
		
	}

}
