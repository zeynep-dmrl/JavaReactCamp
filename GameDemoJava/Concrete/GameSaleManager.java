package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Interfaces.GameService;

public class GameSaleManager implements GameService{

	@Override
	public void saleGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " taraf�ndan " +game.getName() +" al�nd�");
		
	}
	
	@Override
	public void saleGameWithCampaign(Gamer gamer, Game game,Campaign campaign){
		
		 System.out.println(gamer.getFirstName() + 
				 " taraf�ndan " + game.getName() +" kampanyal� " +
				 (game.getPrice() * campaign.getDiscount()) +
				 " �cretle al�nd�.");
		
	}
	
	

}
