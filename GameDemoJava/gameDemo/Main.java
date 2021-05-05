package gameDemo;


import java.util.Date;

import Abstract.CampaignManager;
import Abstract.GamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.GameSaleManager;
import Concrete.GamerCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerCheckManager(new MernisServiceAdapter());
		gamerManager.register(new Gamer("Zeynep","Demirel","18272041218",new Date(2000/06/13)));
		gamerManager.delete(new Gamer());
		gamerManager.updateInfo(new Gamer());
		
		Game game = new Game(1,"WarFrame",42.00);
		GameSaleManager manager = new GameSaleManager();
		manager.saleGame(new Gamer("Zeynep","Demirel","18272041218",new Date(2000/06/13)),game);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(new Campaign("kampanya1",0.5));
		campaignManager.deleteCampaign(new Campaign("kampanya1",0.5));
		campaignManager.updateCampaign(new Campaign("kampanya1",0.5));
		
		manager.saleGameWithCampaign(new Gamer("Zeynep","Demirel","18272041218",new Date(2000/06/13)),
				game,new Campaign("kampanya1",0.5));
		
		
		
		
		
	}

}
