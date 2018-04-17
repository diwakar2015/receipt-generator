/*
 * 
 */
package com.salesapp.productfactories;

import com.salesapp.products.BookProduct;
import com.salesapp.products.Product;
import com.salesapp.products.ProductCategory;

/**
 * The BookProductFactory is a factory class to create a new BookProduct object
 * with specified properties.
 * 
 * @author diwakarc
 */
public class BookProductFactory extends ProductFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @return BookProduct
	 */
	@Override
	public Product createProduct(String name, double price, int quantity) {
		return new BookProduct(name, price, quantity, ProductCategory.BOOK);
	}

}
