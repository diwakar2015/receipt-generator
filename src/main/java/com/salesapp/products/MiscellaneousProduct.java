/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.MiscellaneousProductFactory;

/**
 * MiscellaneousProduct is an item belonging to the category 'Miscellaneous' in
 * the shopping store.
 *
 * @author diwakarc
 */
public class MiscellaneousProduct extends Product {

	/**
	 * Default constructor to initialize a new miscellaneous product.
	 */
	public MiscellaneousProduct() {
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the
	 * <code>MiscellaneousProduct</code> attributes.
	 *
	 * @param name
	 *            - the name of the miscellaneous product
	 * @param price
	 *            - the price of the miscellaneous product
	 * @param imported
	 *            - boolean value of whether the miscellaneous product imported or
	 *            not
	 * @param quantity
	 *            - quantity of miscellaneous product items
	 */
	public MiscellaneousProduct(String name, double price, int quantity, ProductCategory productCategory) {
		super(name, price, quantity, productCategory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return MiscellaneousProductFactory
	 */
	@Override
	public MiscellaneousProductFactory getFactory() {

		return new MiscellaneousProductFactory();
	}
}
