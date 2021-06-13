package com.practice.stockMarket1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.stockMarket1.Entity.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer>{

}
