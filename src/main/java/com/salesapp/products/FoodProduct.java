/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.FoodProductFactory;

/**
 * FoodProduct is an item belonging to the category 'Food' in the shopping
 * store.
 *
 * @author diwakarc
 */
public class FoodProduct extends Product {

	/**
	 * Default constructor to initialize a new food product.
	 */
	public FoodProduct() {
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the
	 * <code>FoodProduct</code> attributes.
	 *
	 * @param name
	 *            - the name of the food product
	 * @param price
	 *            - the price of the food product
	 * @param quantity
	 *            - quantity of food product items
	 * @param productCategory
	 *            - category of the product
	 */
	public FoodProduct(String name, double price, int quantity, ProductCategory productCategory) {
		super(name, price, quantity, productCategory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return FoodProductFactory
	 */
	@Override
	public FoodProductFactory getFactory() {
		return new FoodProductFactory();

	}
}
