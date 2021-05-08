package eTradeDemo.business.abstracts;

import eTradeDemo.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(String eposta, String password);
		

}
