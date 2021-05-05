package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Interfaces.GameService;

public class GameSaleManager implements GameService{

	@Override
	public void saleGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " tarafýndan " +game.getName() +" alýndý");
		
	}
	
	@Override
	public void saleGameWithCampaign(Gamer gamer, Game game,Campaign campaign){
		
		 System.out.println(gamer.getFirstName() + 
				 " tarafýndan " + game.getName() +" kampanyalý " +
				 (game.getPrice() * campaign.getDiscount()) +
				 " ücretle alýndý.");
		
	}
	
	

}
