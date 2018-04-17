/**
 * 
 */
package com.salesapp.products;

import static org.junit.Assert.*;

import org.junit.Test;

import com.salesapp.productfactories.ProductFactory;

/**
 * Test case for {@link com.salesapp.products.FoodProduct)
 * 
 * @author diwakarc
 */
public class FoodProductTest {

	Product p;

	/**
	 * Test method for {@link com.salesapp.products.FoodProduct#FoodProduct()}.
	 */
	@Test
	public void testFoodProduct() {
		p = new FoodProduct();
		assertEquals("", p.getName());
		assertEquals(0.0, p.getPrice(), 0.0009);
		assertEquals(0, p.getQuantity());
		assertEquals(0.0, p.getTaxedCost(), 0.0009);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.products.FoodProduct#FoodProduct(java.lang.String, double, ProductCategory )}.
	 */
	@Test
	public void testFoodProductParaConst() {
		p = new FoodProduct("a box of chocolates", 95.00, 3, ProductCategory.FOOD);
		assertEquals("a box of chocolates", p.getName());
		assertEquals(285.0, p.getPrice(), 0.0009);
		assertEquals(3, p.getQuantity());
	}
	
	@Test
	public void testFoodProductFactory() {
		p = new FoodProduct("food", 95.00, 1, ProductCategory.FOOD);
		ProductFactory pf = p.getFactory();
		assertNotNull(pf);
	}

	@Test
	public void testBookProductGetterSetters() {
		p = new FoodProduct();
		p.setName("food");
		p.setPrice(95.0);
		p.setProductCategory(ProductCategory.FOOD);
		p.setQuantity(1);
		assertEquals("food", p.getName());
		assertEquals(95.0, p.getPrice(), 0.0009);
		assertEquals(1, p.getQuantity());
		assertEquals(ProductCategory.FOOD, p.getProductCategory());
	}
}
