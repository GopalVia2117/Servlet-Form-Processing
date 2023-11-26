package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		System.out.println("handled success");
		PrintWriter writer = resp.getWriter();
		writer.println("<h2>Welcome to router</h2>");
		
		String name = req.getParameter("name");
		
		String password = req.getParameter("password");
		
		String email = req.getParameter("email");
		
		String gender = req.getParameter("gender");
		
		String course = req.getParameter("course");
		
		String consent = req.getParameter("consent");
		
		System.out.println(name + " " +  password + " " +  email + " " + gender + " " + course + " " + consent);
		
		
		StringBuilder response = new StringBuilder();
		if(consent != null) {
			response.append("<h2>" + "Name" + "&nbsp;" + name + "</h2>");
			response.append("<h2>" + "Password" + "&nbsp;" + password + "</h2>");
			response.append("<h2>" + "Email" + "&nbsp;" + email + "</h2>");
			response.append("<h2>" + "Gender" + "&nbsp;" + gender + "</h2>");
			response.append("<h2>" + "Course" + "&nbsp;" + course + "</h2>");
		}
		else {
			response.append("<h2>" + "Please check the consent field first" + "</h2>");
		}
		
		writer.println(response);
		
	}
	
}
