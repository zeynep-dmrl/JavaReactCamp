package Interfaces;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	
	void saleGame(Gamer gamer,Game game);
	void saleGameWithCampaign(Gamer gamer, Game game, Campaign campaign);

}
