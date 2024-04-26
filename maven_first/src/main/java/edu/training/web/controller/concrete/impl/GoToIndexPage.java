package edu.training.web.controller.concrete.impl;

import java.io.IOException;

import edu.training.web.bean.News;
import edu.training.web.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToIndexPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		News news = new News("Where Java Is Heading In 2024!!!",
				"CEO of BellSoft. Accomplished expert in Java technology and IT leadership with over 10 years of experience."
						+ "​​The central tendencies we currently see in the tech industry are related to the continuous expansion of cloud computing and the rapid adoption of AI.\n"
						+ "\n"
						+ "For Java development, these trends are also relevant. Java apps are shifting to cloud-native environments, and we are implementing more ML and AI technologies to advance automation and ease development processes.");
		request.setAttribute("mainNews", news);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
		dispatcher.forward(request, response);

	}

}
