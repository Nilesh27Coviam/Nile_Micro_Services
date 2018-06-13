package com.nile.Nile_Product.controller;

import com.nile.Nile_Product.dto.MerchantDTO;
import com.nile.Nile_Product.dto.ProductDTO;
import com.nile.Nile_Product.entity.MerchantEntity;
import com.nile.Nile_Product.entity.ProductEntity;
import com.nile.Nile_Product.service.MerchantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping(method = RequestMethod.POST, value = "/insert")
    public void insert(){
        merchantService.addMerchant();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public ResponseEntity<List<MerchantDTO>> getAll(){

        List<MerchantEntity> merchantEntityList = merchantService.getAll();
        List<MerchantDTO> merchantDTOS = new ArrayList<>();
        for (MerchantEntity merchantEntity : merchantEntityList) {
            MerchantDTO merchantDTO = new MerchantDTO();
            BeanUtils.copyProperties(merchantEntity, merchantDTO);
            merchantDTOS.add(merchantDTO);
        }
        return new ResponseEntity<List<MerchantDTO>>(merchantDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteAll")
    public void deleteAll(){

        merchantService.deleteAll();
    }

}
