package com.nile.Nile_Product.service.impl;


import com.nile.Nile_Product.entity.CategoryEntity;
import com.nile.Nile_Product.repository.CategoryRepository;
import com.nile.Nile_Product.service.CategoryService;
import com.nile.Nile_Product.utils.RandomStringGenerator;
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
        return categoryRepository.insert(categoryEntity);
    }

    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }
}