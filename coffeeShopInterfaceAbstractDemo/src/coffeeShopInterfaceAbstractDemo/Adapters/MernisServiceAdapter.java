package coffeeShopInterfaceAbstractDemo.Adapters;

import coffeeShopInterfaceAbstractDemo.Abstract.ICustomerCheckService;
import coffeeShopInterfaceAbstractDemo.Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getFirstName() == "Serter" && customer.getLastName() == "Özbek") {
			return true;
		} else {
			return false;
		}

	}

}
