package coffeeShopInterfaceAbstractDemo.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import coffeeShopInterfaceAbstractDemo.Abstract.ICustomerService;
import coffeeShopInterfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity {
	int id;
	String firstName;
	String lastName;
	LocalDate dateOfBirth;
	String nationalityId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
