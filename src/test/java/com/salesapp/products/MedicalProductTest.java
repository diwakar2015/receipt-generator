/**
 * 
 */
package com.salesapp.products;

import static org.junit.Assert.*;

import org.junit.Test;

import com.salesapp.productfactories.ProductFactory;

/**
 * Test case for {@link com.salesapp.products.MedicalProduct)
 * 
 * @author diwakarc
 */
public class MedicalProductTest {

	Product p;

	/**
	 * Test method for
	 * {@link com.salesapp.products.MedicalProduct#MedicalProduct()}.
	 */
	@Test
	public void testMedicalProduct() {
		p = new MedicalProduct();
		assertEquals("", p.getName());
		assertEquals(0.0, p.getPrice(), 0.0009);
		assertEquals(0, p.getQuantity());
		assertEquals(0.0, p.getTaxedCost(), 0.0009);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.products.MedicalProduct#MedicalProduct(java.lang.String, double, ProductCategory)}.
	 */
	@Test
	public void testMedicalProductParaConst() {
		p = new MedicalProduct("a packet of headache pills", 95.00, 3, ProductCategory.MEDICAL);
		assertEquals("a packet of headache pills", p.getName());
		assertEquals(285.0, p.getPrice(), 0.0009);
		assertEquals(3, p.getQuantity());
		assertEquals(ProductCategory.MEDICAL, p.getProductCategory());
	}
	
	@Test
	public void testMedicalProductFactory() {
		p = new MedicalProduct("tablets", 95.00, 1, ProductCategory.MEDICAL);
		ProductFactory pf = p.getFactory();
		assertNotNull(pf);
	}
	
	@Test
	public void testBookProductGetterSetters() {
		p = new MedicalProduct();
		p.setName("medical");
		p.setPrice(95.0);
		p.setProductCategory(ProductCategory.MEDICAL);
		p.setQuantity(1);
		assertEquals("medical", p.getName());
		assertEquals(95.0, p.getPrice(), 0.0009);
		assertEquals(1, p.getQuantity());
		assertEquals(ProductCategory.MEDICAL, p.getProductCategory());
	}
	
}
