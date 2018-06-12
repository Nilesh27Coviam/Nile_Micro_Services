package com.nile.Nile_Product.service.impl;

import com.nile.Nile_Product.entity.CategoryEntity;
import com.nile.Nile_Product.repository.CategoryRepository;
import com.nile.Nile_Product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity insertOrUpdate(CategoryEntity categoryEntity) {

        if(categoryEntity.getCategoryId() == null){
            categoryEntity.setCategoryId("C05");
            return categoryRepository.insert(categoryEntity);
        }
        else {
            return categoryRepository.save(categoryEntity);
        }
    }
}