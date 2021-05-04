
import java.util.GregorianCalendar;

import adapters.MernisServiceAdapter;
import entities.Customer;
import interfaces.CustomerCheckService;
import interfaces.CustomerService;
import services.StarbucksCustomerCheckManager;
import services.StarbucksCustomerManager;


import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
	
		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setIdentityNumber("00000000000");
		enginCustomer.setFirstName("BERKCAN");
		enginCustomer.setLastName("DEMÝR");
		enginCustomer.setBirthDate(new GregorianCalendar(1998, 10 , 21).getTime());
		
		CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());
		
		CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
		customerService.add(enginCustomer);

	}

}
