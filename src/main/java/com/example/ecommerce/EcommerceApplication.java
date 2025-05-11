package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.ecommerce.model.Customer;
import com.example.ecommerce.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;
import java.util.*;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(CustomerRepository customerRepository) {
        return args -> {
            // Lưu user mẫu
            Customer customer = new Customer("nguyenvana");
            customerRepository.save(customer);

            // Tìm theo ID
            Optional<Customer> found = customerRepository.findById(customer.getCustomerID());

            // In ra terminal
            if (found.isPresent()) {
                System.out.println("Found user: " + found.get());
            } else {
                System.out.println("User not found.");
            }
        };
	}
}
