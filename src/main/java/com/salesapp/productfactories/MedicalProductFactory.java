package com.salesapp.productfactories;

import com.salesapp.products.MedicalProduct;
import com.salesapp.products.Product;
import com.salesapp.products.ProductCategory;

/**
 * The MedicalProductFactory is a factory class to create a new MedicalProduct
 * object with specified properties.
 * 
 * @author diwakarc
 */
public class MedicalProductFactory extends ProductFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @return MedicalProduct
	 */
	@Override
	public Product createProduct(String name, double price, int quantity) {
		return new MedicalProduct(name, price, quantity, ProductCategory.MEDICAL);
	}

}
