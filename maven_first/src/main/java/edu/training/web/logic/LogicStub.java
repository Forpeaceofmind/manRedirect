package edu.training.web.logic;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;

public class LogicStub {

	public User checkAuth(AuthInfo authInfo) {

		if ("user@mail.ru".equals(authInfo.getLogin())) {
			return new User("Alina", "student");
		}
		return new User("Alina", "student");
	}

}
