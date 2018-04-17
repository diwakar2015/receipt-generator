package com.salesapp.taxcalculations;

import com.salesapp.products.ProductCategory;

public interface ITaxCalculator {

	/**
	 * Calculates the tax cost for a product where tax cost is the sum of sales tax.
	 *
	 * @param price
	 *            - the price of the product
	 * @param productCategory
	 *            - category of the product
	 * @return double
	 */
	public double calculateTax(double price, ProductCategory productCategory);

}
