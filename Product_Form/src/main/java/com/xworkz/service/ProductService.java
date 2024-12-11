package com.xworkz.service;

import com.xworkz.dto.ProductDTO;

public interface ProductService {
    boolean validAndSave(ProductDTO productDTO);
}