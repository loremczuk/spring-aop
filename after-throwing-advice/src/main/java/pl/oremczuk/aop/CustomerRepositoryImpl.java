package pl.oremczuk.aop;

public class CustomerRepositoryImpl implements CustomerRepository {

	public Customer getCustomer(long customerId) {
		return null;
	}

	public String getCustomerName(long Id) {

		return "Rudolf";
	}

	public void addCustomer(Customer customer) {
		if (customer.getName() == null) {
			throw new RuntimeException("Customer cannot be null");
		}
		System.out.println("Customer saved");
		
	}

}
