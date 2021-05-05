package Interfaces;

import Entities.Gamer;

public interface GamerService {
	
	void register(Gamer gamer);
	void updateInfo(Gamer gamer);
	void delete(Gamer gamer);

}
