package Concrete;

import Abstract.CustomerManager;
import Entities.Customer;
import Interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends CustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Veritaban�na kaydedildi: "+ customer.getFirstName());
		}else {
			System.out.println("B�yle bir kay�t yoktur.");
		}
		
		 
		
	}


	

	
}