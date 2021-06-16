package coffeeShopInterfaceAbstractDemo.Abstract;

import coffeeShopInterfaceAbstractDemo.Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
