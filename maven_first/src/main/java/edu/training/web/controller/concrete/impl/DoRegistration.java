package edu.training.web.controller.concrete.impl;

import java.io.IOException;
import java.time.LocalDate;

import edu.training.web.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoRegistration implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("username " + request.getParameter("username"));
		System.out.println("password " + request.getParameter("password"));
		System.out.println("name " + request.getParameter("name"));
		System.out.println("dob " + request.getParameter("dob"));
		LocalDate date = LocalDate.parse(request.getParameter("dob"));
		System.out.println("country " + request.getParameter("country"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

}
