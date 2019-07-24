package m.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRespository;


public class CustomerServiceImpl implements CustomerService {

	private CustomerRespository customerRepository;
	
	

	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}




	public void setCustomerRepository(CustomerRespository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	
}
