package eTradeDemo;

import eTradeDemo.business.abstracts.UserService;
import eTradeDemo.business.concretes.UserManager;
import eTradeDemo.core.concretes.GoogleManagerAdapters;
import eTradeDemo.dataAccess.concretes.GoogleUserDao;
import eTradeDemo.dataAccess.concretes.InMemoryUserDao;
import eTradeDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new InMemoryUserDao());
		User user = new User(1,"Zeynep","Demirel","zeynep@example.com","123456");
		userService.signUp(user);
		userService.signIn("zeynep@example.com","123456");
		
		System.out.println("---------------------");
		
		UserService userService2 = new UserManager(new GoogleUserDao(),new GoogleManagerAdapters());
		User user2 = new User(1,"Zeynep","Demirel","deneme@example.com","987654");
		userService2.signUp(user2);
		userService2.signIn("deneme@example.com", "987654");
	

	}

}
