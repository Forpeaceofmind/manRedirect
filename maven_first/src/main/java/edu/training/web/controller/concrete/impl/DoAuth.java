package edu.training.web.controller.concrete.impl;

import java.io.IOException;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.controller.concrete.Command;
import edu.training.web.logic.LogicStub;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DoAuth implements Command {
	private final LogicStub logic = new LogicStub();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		System.out.println("Perform user authentication and authorization. Login: " + login);
		User user = logic.checkAuth(new AuthInfo(login, password));

		if (user != null) {
			HttpSession session = (HttpSession) request.getSession(true);
			session.setAttribute("user", user);

			request.setAttribute("invitationMessage", "Hello, user!");

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("MyController?command=go_to_index_page&authError=Wrong login or password!");

			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}

	}

}
