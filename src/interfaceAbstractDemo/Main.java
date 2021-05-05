package interfaceAbstractDemo;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager =  new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Zeynep","Demirel",new Date(200/06/13),"123456") );

		
	}

}
