package com.salesapp.productfactories;

import com.salesapp.products.FoodProduct;
import com.salesapp.products.Product;
import com.salesapp.products.ProductCategory;

/**
 * The FoodProductFactory is a factory class to create a new FoodProduct object
 * with specified properties.
 * 
 * @author diwakarc
 */
public class FoodProductFactory extends ProductFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @return FoodProduct
	 */
	@Override
	public Product createProduct(String name, double price, int quantity) {
		return new FoodProduct(name, price, quantity, ProductCategory.FOOD);
	}

}
