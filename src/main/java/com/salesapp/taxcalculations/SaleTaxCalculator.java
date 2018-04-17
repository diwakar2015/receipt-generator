/**
 * 
 */
package com.salesapp.taxcalculations;

import java.util.Arrays;
import java.util.List;

import com.salesapp.products.ProductCategory;

/**
 * The concrete class TaxCalculator computes the total tax cost of a product.
 *
 * @author diwakarc
 */
public class SaleTaxCalculator implements ITaxCalculator {

	private static final double SALE_TAX_RATE = 17.5;
	private static final double DEFAULT_TAX = 0.0;

	private static final List<ProductCategory> additionalTaxableProductList = Arrays
			.asList(ProductCategory.ENTERTAINMENT);

	@Override
	public double calculateTax(double price, ProductCategory productCategory) {

		// No tax should be added for medical products
		if (productCategory.isSaleTaxExempted()) {
			return DEFAULT_TAX;
		}

		// Calculates tax cost
		double tax = (price * SALE_TAX_RATE) / 100;

		// rounds off to nearest 0.05 paise
		tax = MathHelper.roundOff(tax);

		// Add extra tax for CDs and other ENTERTAINMENT
		if (isAdditionalTaxRequired(productCategory)) {
			tax = tax + productCategory.getAdditionalTax();
		}
		
		return tax;
	}

	private boolean isAdditionalTaxRequired(ProductCategory productCategory) {
		return additionalTaxableProductList.contains(productCategory);
	}

}
