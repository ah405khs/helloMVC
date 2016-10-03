package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customers;
	private static final CustomerService instance = new CustomerService();

	public CustomerService() {
		customers = new HashMap<String, Customer>();
		
	}
	
	public static CustomerService getInstance(){
		return instance;
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
	
	public Customer loginUser(String id, String password){
		Customer customer;
		customer = customers.get(id);
		if(customer == null){
			System.out.println("customer 값 없음.");
			return null;
		}
		else{
			if(customer.getPassword().equals(password) == true){
				System.out.println("password 잎치 함");
				return customer;
				}
			else{
				
				System.out.println("일치 안함");
				return null;
			}
		//	return customer;
		}
	}
}
