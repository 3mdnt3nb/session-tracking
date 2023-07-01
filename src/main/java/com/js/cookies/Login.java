package com.js.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value ="/n1")
public class Login extends HttpServlet {
	
//login.jsp
//Login class
//if email && pass word are crt home .jsp
//else it will stys at login.jsp itself
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		String ob1 = req.getParameter("email");
		int ob2 = Integer.parseInt(req.getParameter("password"));

		Cookie c = new Cookie("key", "abc");      // to store to system
		resp.addCookie(c);

		if (ob1.equals("raj@gmail.com") && ob2 == 1234) {
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, resp);

		} else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body> <h3 style=\"color:red\">EMAIL OR PASSWORD IS WRONG </h3></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, resp);
		}
	}
}
