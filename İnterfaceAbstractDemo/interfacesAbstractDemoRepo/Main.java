package interfacesAbstractDemoRepo;

import java.util.Date;

import Abstract.CustomerManager;
import Adaptors.MernisServiceAdaptor;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

public static void main(String[] args) {
		
		CustomerManager customerManager =  new StarbucksCustomerManager(new MernisServiceAdaptor());
		customerManager.Save(new Customer(1,"Zeynep","Demirel",new Date(2000/06/13),"123456") );

		
	}

}
