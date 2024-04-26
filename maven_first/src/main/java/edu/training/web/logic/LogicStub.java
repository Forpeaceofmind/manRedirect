package edu.training.web.logic;

public class LogicStub {

	public boolean checkAuth(String login, String password) {

		if ("user@mail.ru".equals(login)) {
			return true;
		}
		return false;
	}

}
