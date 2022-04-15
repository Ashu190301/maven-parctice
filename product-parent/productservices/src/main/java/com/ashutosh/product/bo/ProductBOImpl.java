package com.ashutosh.product.bo;

import com.ashutosh.product.dao.ProductDAO;
import com.ashutosh.product.dao.ProductDAOImpl;
import com.ashutosh.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);

	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
