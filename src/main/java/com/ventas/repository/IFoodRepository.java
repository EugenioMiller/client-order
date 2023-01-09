package com.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ventas.model.Food;

@Repository
public interface IFoodRepository extends JpaRepository<Food, Long>{

}
