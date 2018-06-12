package com.nile.Nile_Product.repository;

import com.nile.Nile_Product.dto.CategoryDTO;
import com.nile.Nile_Product.entity.CategoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryEntity, String> {
}