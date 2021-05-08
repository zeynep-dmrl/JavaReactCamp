package eTradeDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTradeDemo.dataAccess.abstracts.UserDao;
import eTradeDemo.entities.concretes.User;

public class GoogleUserDao implements UserDao{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý " + user.getFirstName() + " " + user.getLastName() + " silindi" ); 
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName( )+ " " + user.getLastName() + " kullanýcý bilgileri güncellendi.");
		
	}

	@Override
	public User get(String eposta) {
		User getUser = users.stream().filter(u -> u.getEposta() == eposta).findFirst().orElse(null);
		return getUser;
	}

	@Override
	public List<User> getAll() {
		for(User user : users) {
			System.out.println(user.getFirstName()+user.getLastName()+user.getEposta()); 
		}
		
		return this.users;
	}

}
