/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.MedicalProductFactory;

/**
 * MedicalProduct is an item belonging to the category 'Medical' in the shopping
 * store.
 *
 * @author diwakarc
 */
public class MedicalProduct extends Product {

	/**
	 * Default constructor to initialize a new medical product.
	 */
	public MedicalProduct() {
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the
	 * <code>MedicalProduct</code> attributes.
	 *
	 * @param name
	 *            - the name of the medical product
	 * @param price
	 *            - the price of the medical product
	 * @param quantity
	 *            - quantity of food medical items
	 * @param productCategory
	 *            - category of the product
	 */
	public MedicalProduct(String name, double price, int quantity, ProductCategory productCategory) {
		super(name, price, quantity, productCategory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return MedicalProductFactory
	 */
	@Override
	public MedicalProductFactory getFactory() {
		return new MedicalProductFactory();

	}

}
