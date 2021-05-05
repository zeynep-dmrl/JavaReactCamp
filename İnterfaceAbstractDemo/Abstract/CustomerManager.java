package Abstract;
import Entities.Customer;
import Interfaces.CustomerService;


public abstract class CustomerManager implements CustomerService{
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi: "+ customer.getFirstName()); 
		
	}
	
	
	

}