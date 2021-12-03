package com.fmchan.opensearch.repositories;

import java.util.List;

import com.fmchan.opensearch.models.Product;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findByName(String name);
    
    List<Product> findByNameContaining(String name);
 
    List<Product> findByManufacturerAndCategory(String manufacturer,String category);
}