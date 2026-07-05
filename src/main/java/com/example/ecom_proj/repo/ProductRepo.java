package com.example.ecom_proj.repo;

import com.example.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    //instead of using table name we have to use class name.
    @Query("""       
    SELECT p FROM Product p
    WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%'))
       OR LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%'))
       OR LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%'))
       OR LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))
""")
    //we are converting every character into lower and compare with keyword.

    List<Product> searchProducts(@Param("keyword") String keyword);
}
