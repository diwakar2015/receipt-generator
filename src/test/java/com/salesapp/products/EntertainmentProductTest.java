
/**
 * 
 */
package com.salesapp.products;

import static org.junit.Assert.*;

import org.junit.Test;

import com.salesapp.productfactories.ProductFactory;

/**
 * Test case for {@link com.salesapp.products.EntertainmentProductTest)
 * 
 * @author diwakarc
 */
public class EntertainmentProductTest {

	Product p;

	/**
	 * Test method for
	 * {@link com.salesapp.products.EntertainmentProduct#EntertainmentProduct()}.
	 */
	@Test
	public void testEntertainmentProduct() {
		p = new EntertainmentProduct();
		assertEquals("", p.getName());
		assertEquals(0.0, p.getPrice(), 0.0009);
		assertEquals(0, p.getQuantity());
		assertEquals(0.0, p.getTaxedCost(), 0.0009);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.products.EntertainmentProduct#EntertainmentProduct(java.lang.String, double, ProductCategory )}.
	 */
	@Test
	public void testFoodProductParaConst() {
		p = new EntertainmentProduct("dvd player", 95.00, 3, ProductCategory.ENTERTAINMENT);
		assertEquals("dvd player", p.getName());
		assertEquals(285.0, p.getPrice(), 0.0009);
		assertEquals(3, p.getQuantity());
	}
	
	@Test
	public void testEntertainmnetProductFactory() {
		p = new EntertainmentProduct("cd", 95.00, 1, ProductCategory.ENTERTAINMENT);
		ProductFactory pf = p.getFactory();
		assertNotNull(pf);
	}
	
	@Test
	public void testBookProductGetterSetters() {
		p = new EntertainmentProduct();
		p.setName("cd");
		p.setPrice(95.0);
		p.setProductCategory(ProductCategory.ENTERTAINMENT);
		p.setQuantity(1);
		assertEquals("cd", p.getName());
		assertEquals(95.0, p.getPrice(), 0.0009);
		assertEquals(1, p.getQuantity());
		assertEquals(ProductCategory.ENTERTAINMENT, p.getProductCategory());
	}

}
