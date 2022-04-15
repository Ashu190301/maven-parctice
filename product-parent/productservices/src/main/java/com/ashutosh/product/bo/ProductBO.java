package com.ashutosh.product.bo;

import com.ashutosh.product.dto.Product;

public interface ProductBO {
   void create(Product product);
   
   Product findProduct(int id);
}
