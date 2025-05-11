package ecommerce.src.main.java.com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.StoreStaff;

public interface StaffRepository extends JpaRepository<StoreStaff, Integer> {
}
