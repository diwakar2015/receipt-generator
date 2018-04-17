package com.salesapp.products;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for {@link com.salesapp.products.ProductCategory)
 * 
 * @author diwakarc
 */
public class ProductCategoryTest {

	/**
	 * Test method for {@link com.salesapp.products.ProductCategory}.
	 */
	@Test
	public void testProductValue() {
		assertEquals("BOOK", ProductCategory.valueOf("BOOK").toString());
		assertEquals("ENTERTAINMENT", ProductCategory.valueOf("ENTERTAINMENT").toString());
		assertEquals("MISCELLANEOUS", ProductCategory.valueOf("MISCELLANEOUS").toString());
	}
	
	/**
	 * Test method for {@link com.salesapp.products.ProductCategory}.
	 */
	@Test
	public void testFoodProductValues() {
		ProductCategory[] cats = ProductCategory.values();
		Assert.assertNotNull(cats);
		Assert.assertEquals(6, cats.length);
	}


}
