package coffeeShopInterfaceAbstractDemo;

import java.time.LocalDate;

import coffeeShopInterfaceAbstractDemo.Abstract.BaseCustomerManager;
import coffeeShopInterfaceAbstractDemo.Concreate.CustomerCheckManager;
import coffeeShopInterfaceAbstractDemo.Concreate.NeroCustomerManager;
import coffeeShopInterfaceAbstractDemo.Concreate.StarbucksCustomerManager;
import coffeeShopInterfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setNationalityId("1324568911");
		customer1.setFirstName("Serter");
		customer1.setLastName("Özbek");
		customer1.setDateOfBirth(LocalDate.of(2001, 5, 4));

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setNationalityId("14567891154");
		customer2.setFirstName("Su");
		customer2.setLastName("Toprak");
		customer2.setDateOfBirth(LocalDate.of(2001, 6, 4));

		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer1);
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager2.save(customer2);
		

	}

}
