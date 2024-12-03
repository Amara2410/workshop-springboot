package com.amara_dev.first_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amara_dev.first_spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
