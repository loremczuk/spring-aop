package pl.oremczuk.aop;

public interface CustomerRepository {

	Customer getCustomer (long customerId);
	String getCustomerName (long Id);
	
}
