package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customers;

	public CustomerService() {
		customers = new HashMap<String, Customer>();
		addCustomer(new Customer("id001", "kimhansol","ah405khs@naver.com"));
		addCustomer(new Customer("id002", "kim","ah405khs@naver.com"));
		addCustomer(new Customer("id003", "bob","ah405khs@naver.com"));
		addCustomer(new Customer("id004", "mak","ah405khs@naver.com"));
		addCustomer(new Customer("id005", "aaaa","ah405khs@naver.com"));
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id){
		if(id != null)
			return customers.get(id.toLowerCase());
		else
			return null;
	}
}
