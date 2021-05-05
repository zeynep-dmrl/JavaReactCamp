package Abstract;

import Entities.Gamer;
import Interfaces.GamerService;

public abstract class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" kaydedildi."); 
		
	}

	@Override
	public void updateInfo(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" bilgileri g�ncellendi"); 
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" silindi.");  
		
	}

}
