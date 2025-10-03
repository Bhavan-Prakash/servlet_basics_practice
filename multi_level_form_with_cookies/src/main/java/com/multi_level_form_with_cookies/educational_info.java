package com.multi_level_form_with_cookies;

import java.io.IOException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class educational_info extends HttpServlet{
	public void service(HttpServletResponse res , HttpServletRequest req) throws IOException {
		
		String quali = req.getParameter("qual");
		
		Cookie cookie_quali = new Cookie("quali" , quali);
		
		res.addCookie(cookie_quali);
		
		res.sendRedirect("disp");
		
	}

}
