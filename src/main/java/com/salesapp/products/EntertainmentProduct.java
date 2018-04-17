package com.salesapp.products;

import com.salesapp.productfactories.EntertainmentProductFactory;

/**
 * EntertainmentProduct is an item belonging to the category 'Entertainment'.
 *
 * @author diwakarc
 */

public class EntertainmentProduct extends Product {

	/**
	 * Default constructor to initialize a new entertainment product.
	 */
	public EntertainmentProduct() {
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the
	 * <code>EntertainmentProduct</code> attributes.
	 *
	 * @param name
	 *            - the name of the EntertainmentProduct
	 * @param price
	 *            - the price of the EntertainmentProduct
	 * @param quantity
	 *            - quantity of EntertainmentProduct product items
	 * @param productCategory
	 *            - category of the product
	 */
	public EntertainmentProduct(String name, double price, int quantity, ProductCategory productCategory) {
		super(name, price, quantity, productCategory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return EntertainmentProductFactory
	 */
	@Override
	public EntertainmentProductFactory getFactory() {
		return new EntertainmentProductFactory();

	}
}
