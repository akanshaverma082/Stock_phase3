package com.practice.stockMarket1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.stockMarket1.Entity.IPODetails;

public interface Iporepo  extends JpaRepository<IPODetails, Integer> {

}
