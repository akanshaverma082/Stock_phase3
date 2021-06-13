package com.practice.stockMarket1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.stockMarket1.Entity.Sectors;

public interface Sectorrepo extends JpaRepository<Sectors, Integer> {

}
