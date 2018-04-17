/**
 * 
 */
package com.salesapp.productfactories;

import org.junit.Test;

import com.salesapp.products.ProductCategory;

/**
 * The ProductFactoriesTest tests the product factory classes.
 * 
 * @author diwakarc
 */
public class ProductFactoriesTest {

	/** Creates a test fixture */
	ProductFactory factory;
	String name = "mock";
	double price = 45.00;
	int quantity = 2;
	ProductCategory productCategory;

	/**
	 * Test method for
	 * {@link com.salesapp.productfactories.BookProductFactory#createProduct(java.util.List)}.
	 */
	@Test
	public void testCreateBookProduct() {
		factory = new BookProductFactory();
		factory.createProduct(name, price, quantity);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.productfactories.FoodProductFactory#createProduct(java.util.List)}.
	 */
	@Test
	public void testCreateFoodProduct() {
		factory = new FoodProductFactory();
		factory.createProduct(name, price, quantity);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.productfactories.MedicalProductFactory#createProduct(java.util.List)}.
	 */
	@Test
	public void testCreateMedicalProduct() {
		factory = new MedicalProductFactory();
		factory.createProduct(name, price, quantity);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.productfactories.MiscellaneousProductFactory#createProduct(java.util.List)}.
	 */
	@Test
	public void testCreateMiscellaneousProduct() {
		factory = new MiscellaneousProductFactory();
		factory.createProduct(name, price, quantity);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.productfactories.MiscellaneousProductFactory#createProduct(java.util.List)}.
	 */
	@Test
	public void testCreateEntertainmentProduct() {
		factory = new EntertainmentProductFactory();
		factory.createProduct(name, price, quantity);
	}

}
