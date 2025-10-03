package com.multi_level_form_with_cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class personal_info extends HttpServlet {
	public void service(HttpServletResponse res, HttpServletRequest req) throws IOException {
		
		String name = req.getParameter("name");
		
		String age = req.getParameter("age");

		String sex = req.getParameter("sex");
		
		Cookie cookie_name = new Cookie("name",name);
		
		Cookie cookie_age = new Cookie("age",age);
		
		Cookie cookie_sex = new Cookie("sex",sex);
		
		res.addCookie(cookie_name);
		
		res.addCookie(cookie_age);

		res.addCookie(cookie_sex);

		
		res.sendRedirect("info");
		
		
	}

}
