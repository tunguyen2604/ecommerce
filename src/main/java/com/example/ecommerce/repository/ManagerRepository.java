package ecommerce.src.main.java.com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    
}
