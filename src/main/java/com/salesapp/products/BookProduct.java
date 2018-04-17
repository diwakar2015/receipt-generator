/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.BookProductFactory;

/**
 * BookProduct is an item belonging to the category 'Book' in the shopping
 * store.
 *
 * @author diwakarc
 */
public class BookProduct extends Product {

	/**
	 * Default constructor to initialize a new book product.
	 */
	public BookProduct() {
		super();
	}

	/**
	 * Parameterized constructor to initialize the values of the
	 * <code>BookProduct</code> attributes.
	 *
	 * @param name
	 *            - the name of the book product
	 * @param price
	 *            - the price of the book product
	 * @param quantity
	 *            - quantity of book product items
	 * @param productCategory
	 *            - category of the product
	 */
	public BookProduct(String name, double price, int quantity, ProductCategory productCategory) {
		super(name, price, quantity, productCategory);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @return BookProductFactory
	 */
	@Override
	public BookProductFactory getFactory() {
		return new BookProductFactory();

	}
}
