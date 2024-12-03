package com.amara_dev.first_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amara_dev.first_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
