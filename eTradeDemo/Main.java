package eTradeDemo;

import eTradeDemo.business.abstracts.UserService;
import eTradeDemo.business.concretes.UserManager;
import eTradeDemo.core.concretes.GoogleManagerAdapters;
import eTradeDemo.dataAccess.concretes.InMemoryUserDao;
import eTradeDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new InMemoryUserDao(),new GoogleManagerAdapters());
		User user = new User(1,"Zeynep","Demirel","zeynep@example.com","123456");
		userService.signUp(user);
		userService.signIn("zeynep@example.com","123456");

	}

}
