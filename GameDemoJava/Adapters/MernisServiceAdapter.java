package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Entities.Gamer;
import Interfaces.GamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		Boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationaltyId()),
												gamer.getFirstName().toUpperCase(),
												gamer.getLastName().toUpperCase(),
												gamer.getBirthOfDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		  return result;
		
	}

}
