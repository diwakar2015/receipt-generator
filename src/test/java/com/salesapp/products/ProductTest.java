/**
 * 
 */
package com.salesapp.products;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test case for {@link com.salesapp.products.Product)
 *
 * @author diwakarc
 */
public class ProductTest {

	/** Creates a test fixture. */
	Product product;

	/**
	 * Initialize the fixture by instantiating the mock object.
	 */
	@Before
	public void setUp() {
		product = new MockProduct("Mock", 50.00, 3, ProductCategory.BOOK);
	}

	/**
	 * Test method for {@link com.salesapp.products.Product#getName()}.
	 */
	@Test
	public void testGetName() {

		assertEquals("Mock", product.getName());
	}

	/**
	 * Test method for {@link com.salesapp.products.Product#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		assertEquals(150.00, product.getPrice(), 0.0009);
	}

	/**
	 * Test method for {@link com.salesapp.products.Product#getQuantity()}.
	 */
	@Test
	public void testGetQuantity() {
		assertEquals(3, product.getQuantity());
	}

	/**
	 * Test method for {@link com.salesapp.products.Product#getTaxedCost()}.
	 */
	@Test
	public void testGetTaxedCost() {
		assertEquals(0.0, product.getTaxedCost(), 0.0009);
	}

	/**
	 * Test method for {@link com.salesapp.products.Product#toString()}.
	 */
	@Test
	public void testToString() {
		System.out.println(product.toString());
		assertEquals("3 Mock: 150.0", product.toString());
	}

}
