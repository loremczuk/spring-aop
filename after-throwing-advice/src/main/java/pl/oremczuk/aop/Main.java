package pl.oremczuk.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
		
//		Customer customer = new Customer("D¿ord¿");
//		Customer customer2 = new Customer(null);
		
		Customer customer = context.getBean("customer", Customer.class);
		customerRepository.addCustomer(customer);
		Customer customer2 = context.getBean("customer2", Customer.class);
		customerRepository.addCustomer(customer2);
		
	}

}
