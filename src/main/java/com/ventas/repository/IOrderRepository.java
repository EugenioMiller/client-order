package com.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventas.model.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long>{

}
