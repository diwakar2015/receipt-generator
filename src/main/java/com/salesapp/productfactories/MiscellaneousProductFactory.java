package com.salesapp.productfactories;

import com.salesapp.products.MiscellaneousProduct;
import com.salesapp.products.ProductCategory;

/**
 * The MiscellaneousProductFactory is a factory class to create a new
 * MiscellaneousProduct object with specified properties.
 * 
 * @author diwakarc
 */
public class MiscellaneousProductFactory extends ProductFactory {

	/**
	 * {@inheritDoc}
	 * 
	 * @return MiscellaneousProduct
	 */
	@Override
	public MiscellaneousProduct createProduct(String name, double price, int quantity) {
		return new MiscellaneousProduct(name, price, quantity, ProductCategory.MISCELLANEOUS);
	}

}
