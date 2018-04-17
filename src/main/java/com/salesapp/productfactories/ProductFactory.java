package com.salesapp.productfactories;

import com.salesapp.products.Product;

/**
 * The ProductFactory is an abstract factory class.
 * 
 * @author diwakarc
 */
public abstract class ProductFactory {

	/**
	 * Creates a new Product object.
	 *
	 * @param name
	 *            - name of the product
	 * @param price
	 *            - price of product
	 * @param quantity
	 *            - quantity of product
	 * @return Product
	 * 
	 */
	public abstract Product createProduct(String name, double price, int quantity);
}
