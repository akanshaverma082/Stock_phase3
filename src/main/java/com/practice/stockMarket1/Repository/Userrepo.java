package com.practice.stockMarket1.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.stockMarket1.Entity.Users;

public interface Userrepo extends JpaRepository<Users, Integer> {

}
