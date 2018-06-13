package com.nile.Nile_Product.repository;

import com.nile.Nile_Product.entity.MerchantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository extends MongoRepository<MerchantEntity, String> {
}
