package com.practice.stockMarket1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.stockMarket1.Entity.CompanyCode;

public interface CompanycodeRepo extends JpaRepository<CompanyCode, Integer> {

}
