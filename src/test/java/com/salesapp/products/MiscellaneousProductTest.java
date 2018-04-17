/**
 * 
 */
package com.salesapp.products;

import static org.junit.Assert.*;

import org.junit.Test;

import com.salesapp.productfactories.ProductFactory;

/**
 * Test case for {@link com.salesapp.products.MiscellaneousProduct)
 * 
 * @author diwakarc
 */
public class MiscellaneousProductTest {

	Product p;

	/**
	 * Test method for
	 * {@link com.salesapp.products.MiscellaneousProduct#MiscellaneousProduct()}.
	 */
	@Test
	public void testMiscellaneousProduct() {
		p = new MiscellaneousProduct();
		assertEquals("", p.getName());
		assertEquals(0.0, p.getPrice(), 0.0009);
		assertEquals(0, p.getQuantity());
		assertEquals(0.0, p.getTaxedCost(), 0.0009);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.products.MiscellaneousProduct#MiscellaneousProduct(java.lang.String, double, ProductCategory)}.
	 */
	@Test
	public void testMiscellaneousProductStringDoubleBooleanInt() {
		p = new MiscellaneousProduct("a bottle of perfume", 95.00, 3, ProductCategory.MISCELLANEOUS);
		assertEquals("a bottle of perfume", p.getName());
		assertEquals(285.0, p.getPrice(), 0.0009);
		assertEquals(3, p.getQuantity());
	}
	
	@Test
	public void testMiscProductFactory() {
		p = new MiscellaneousProduct("misc", 95.00, 1, ProductCategory.MISCELLANEOUS);
		ProductFactory pf = p.getFactory();
		assertNotNull(pf);
	}
	
	@Test
	public void testBookProductGetterSetters() {
		p = new MiscellaneousProduct();
		p.setName("misc");
		p.setPrice(95.0);
		p.setProductCategory(ProductCategory.MISCELLANEOUS);
		p.setQuantity(1);
		assertEquals("misc", p.getName());
		assertEquals(95.0, p.getPrice(), 0.0009);
		assertEquals(1, p.getQuantity());
		assertEquals(ProductCategory.MISCELLANEOUS, p.getProductCategory());
	}
	
	
}
