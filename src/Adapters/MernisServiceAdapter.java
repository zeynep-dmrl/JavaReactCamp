package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Entities.Customer;
import Interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
	
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		Boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
												customer.getFirstName().toUpperCase(),
												customer.getLastName().toUpperCase(),
												customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		  return result;
		
		 
      } 
		  
		  
	

}
