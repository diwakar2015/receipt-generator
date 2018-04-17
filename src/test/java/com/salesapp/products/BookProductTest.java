/**
 * 
 */
package com.salesapp.products;

import static org.junit.Assert.*;

import org.junit.Test;

import com.salesapp.productfactories.ProductFactory;

/**
 * Test case for {@link com.salesapp.products.BookProduct)
 * 
 * @author diwakarc
 */
public class BookProductTest {

	Product p;

	/**
	 * Test method for {@link com.salesapp.products.BookProduct#BookProduct()}.
	 */
	@Test
	public void testBookProduct() {
		p = new BookProduct();
		assertEquals("", p.getName());
		assertEquals(0.0, p.getPrice(), 0.0009);
		assertEquals(0, p.getQuantity());
		assertEquals(ProductCategory.UNKNOWN, p.getProductCategory());
		assertEquals(0.0, p.getTaxedCost(), 0.0009);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.products.BookProduct#BookProduct(java.lang.String, double, ProductCategory)}.
	 */
	@Test
	public void testBookProductParaConst() {
		p = new BookProduct("book", 95.00, 1, ProductCategory.BOOK);
		assertEquals("book", p.getName());
		assertEquals(95.0, p.getPrice(), 0.0009);
		assertEquals(1, p.getQuantity());
		assertEquals(ProductCategory.BOOK, p.getProductCategory());
	}
	
	@Test
	public void testBookProductFactory() {
		p = new BookProduct("book", 95.00, 1, ProductCategory.BOOK);
		ProductFactory pf = p.getFactory();
		assertNotNull(pf);
	}
	
	@Test
	public void testBookProductGetterSetters() {
		p = new BookProduct();
		p.setName("book");
		p.setPrice(95.0);
		p.setProductCategory(ProductCategory.BOOK);
		p.setQuantity(1);
		assertEquals("book", p.getName());
		assertEquals(95.0, p.getPrice(), 0.0009);
		assertEquals(1, p.getQuantity());
		assertEquals(ProductCategory.BOOK, p.getProductCategory());
	}
}
