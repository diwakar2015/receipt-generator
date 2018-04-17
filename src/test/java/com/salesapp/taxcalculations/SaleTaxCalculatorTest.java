/**
 * 
 */
package com.salesapp.taxcalculations;

import static org.junit.Assert.*;

import org.junit.Test;

import com.salesapp.products.ProductCategory;

/**
 * Test case for {@link com.salesapp.taxcalculations.SaleTaxCalculator}
 * 
 * @author diwakarc
 */
public class SaleTaxCalculatorTest {

	/** Creates a test fixture */
	ITaxCalculator taxcalc = new SaleTaxCalculator();

	/**
	 * Test method for
	 * {@link com.salesapp.taxcalculations.AdditionalTaxCalculator#calculateTax(double, double, boolean)}.
	 */
	@Test
	public void testCalculateTax() {
		assertEquals(3.7, taxcalc.calculateTax(20.99, ProductCategory.BOOK), 0.0009);
		assertEquals(2.0, taxcalc.calculateTax(4.15, ProductCategory.ENTERTAINMENT), 0.0009);
		assertEquals(2.0, taxcalc.calculateTax(11.25, ProductCategory.FOOD), 0.0009);
		assertEquals(0.0, taxcalc.calculateTax(14.99, ProductCategory.MEDICAL), 0.0009);
	}

}
