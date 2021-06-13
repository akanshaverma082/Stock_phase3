package com.practice.stockMarket1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.stockMarket1.Entity.StockPrice;

public interface StockpriceRepo  extends JpaRepository<StockPrice, Integer>
{

}
