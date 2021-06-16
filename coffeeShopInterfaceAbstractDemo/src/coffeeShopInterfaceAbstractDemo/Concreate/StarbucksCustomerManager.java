package coffeeShopInterfaceAbstractDemo.Concreate;


import coffeeShopInterfaceAbstractDemo.Abstract.BaseCustomerManager;
import coffeeShopInterfaceAbstractDemo.Abstract.ICustomerCheckService;
import coffeeShopInterfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {

		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (_customerCheckService.checkIfRealPerson(customer) == true) {
			super.save(customer);
		} else {
			System.out.println(
					customer.getFirstName() + " " + customer.getLastName() + " kayýt basarisiz. Dogrulama gecersiz.");
		}
	}

}
