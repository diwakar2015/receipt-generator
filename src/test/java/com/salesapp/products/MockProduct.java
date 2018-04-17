/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.ProductFactory;

/**
 * MockProduct is a mock object used to test the abstract Product class.
 * 
 * @author diwakarc
 *
 */
public class MockProduct extends Product {

	/**
	 * Default constructor to initialize a new mock product.
	 */
	public MockProduct() {
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the
	 * <code>MockProduct</code> attributes.
	 *
	 * @param name
	 *            - the name of the mock product
	 * @param price
	 *            - the price of the mock product
	 * @param quantity
	 *            - quantity of mock product items
	 * @param ProductCategory
	 *            - ProductCategory
	 */
	public MockProduct(String name, double price, int quantity, ProductCategory productCategory) {
		super(name, price, quantity, productCategory);

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProductFactory getFactory() {
		return null;
	}

}
