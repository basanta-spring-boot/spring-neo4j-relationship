package com.basant.spring.boot.neo4j.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.spring.boot.neo4j.api.dao.CustomerRepository;
import com.basant.spring.boot.neo4j.api.node.Customer;
import com.basant.spring.boot.neo4j.api.node.Product;

@SpringBootApplication
@RestController
public class SpringNeo4jRelationshipApplication {

	@Autowired
	private CustomerRepository repository;

	@PostConstruct
	public void purchase() {
		List<Customer> customers = new ArrayList<>();

		List<Product> products1 = new ArrayList<>();
		products1.add(new Product(123, "mobile", 1, 8000));
		products1.add(new Product(456, "TV", 1, 120000));
		Customer customer1 = new Customer(28753, "Basant", new String[] { "Bangalore", "BTM" }, products1);

		List<Product> products2 = new ArrayList<>();
		products2.add(new Product(789, "Watch", 2, 2500));
		products2.add(new Product(901, "Glass", 1, 1000));
		Customer customer2 = new Customer(37538, "Santosh", new String[] { "Hydrabad", "Hitech-city" }, products2);

		customers.add(customer1);
		customers.add(customer2);

		repository.saveAll(customers);
	}

	@GetMapping("/getReports")
	public List<Customer> getReport() {
		return (List<Customer>) repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringNeo4jRelationshipApplication.class, args);
	}
}
