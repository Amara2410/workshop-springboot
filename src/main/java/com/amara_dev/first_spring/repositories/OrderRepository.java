package com.amara_dev.first_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amara_dev.first_spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
