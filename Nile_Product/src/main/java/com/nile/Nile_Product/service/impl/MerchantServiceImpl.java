package com.nile.Nile_Product.service.impl;

import com.nile.Nile_Product.entity.MerchantEntity;
import com.nile.Nile_Product.repository.MerchantRepository;
import com.nile.Nile_Product.service.MerchantService;
import com.nile.Nile_Product.utils.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public void addMerchant() {
        MerchantEntity merchantEntity = new MerchantEntity();
        merchantEntity.setId(RandomStringGenerator.generateRandomString());
        merchantEntity.setName("M01");
        merchantEntity.setRateing(2);
        merchantRepository.insert(merchantEntity);
    }

    @Override
    public List<MerchantEntity> getAll() {
        return merchantRepository.findAll();
    }
}
