package Concrete;

import Abstract.GamerManager;
import Entities.Gamer;
import Interfaces.GamerCheckService;

public class GamerCheckManager extends GamerManager{
	
	private GamerCheckService gamerCheckService;

	public GamerCheckManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void register(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Kayýt gerceklestirldi: " + gamer.getFirstName());
			
		}else {
			System.out.println("Kayýt gerceklestirilemedi");
		}
		
		
	}

}
