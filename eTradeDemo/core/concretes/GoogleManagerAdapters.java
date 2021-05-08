package eTradeDemo.core.concretes;

import eTradeDemo.core.abstracts.GoogleService;
import eTradeDemo.entities.concretes.User;
import eTradeDemo.externalServices.GoogleManager;

public class GoogleManagerAdapters implements GoogleService{

	@Override
	public void addToGoogle(User user) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.add();
		
		
	}

	

}
