package Concrete;

import Entities.Customer;
import Interfaces.CustomerCheckService;

public class CustomerCheckManager implements  CustomerCheckService{

	@Override
	public boolean   CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}

