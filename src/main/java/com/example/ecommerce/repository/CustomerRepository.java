package ecommerce.src.main.java.com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findBycustomername(String customername);
}
