package com.salesapp.productfactories;

import com.salesapp.products.EntertainmentProduct;
import com.salesapp.products.Product;
import com.salesapp.products.ProductCategory;

/**
 * The EntertainmentProductFactory is a factory class to create a new
 * EntertainmentProduct object with specified properties.
 * 
 * @author diwakarc
 */
public class EntertainmentProductFactory extends ProductFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @return FoodProduct
	 */
	@Override
	public Product createProduct(String name, double price, int quantity) {
		return new EntertainmentProduct(name, price, quantity, ProductCategory.ENTERTAINMENT);
	}

}
