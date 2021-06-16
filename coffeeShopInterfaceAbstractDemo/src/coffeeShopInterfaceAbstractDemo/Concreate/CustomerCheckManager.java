package coffeeShopInterfaceAbstractDemo.Concreate;

import coffeeShopInterfaceAbstractDemo.Abstract.ICustomerCheckService;
import coffeeShopInterfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return false;
	}

}
