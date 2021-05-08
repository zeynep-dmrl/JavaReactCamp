package eTradeDemo.core.concretes;

import eTradeDemo.business.concretes.EmailValidation;
import eTradeDemo.core.abstracts.GoogleService;
import eTradeDemo.entities.concretes.User;
import eTradeDemo.externalServices.GoogleManager;

public class GoogleManagerAdapters extends EmailValidation implements GoogleService{
	

	@Override
	public void addToGoogle(String message,User user) {
		GoogleManager googleManager = new GoogleManager();
		System.out.println(message);
		googleManager.add(user);
		
		
	}



	

}
