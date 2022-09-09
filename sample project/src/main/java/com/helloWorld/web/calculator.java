package com.helloWorld.web;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class calculator extends HttpServlet {

	public void service(ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		res.getWriter().print("number add:" + (num1 + num2));
	}

}
