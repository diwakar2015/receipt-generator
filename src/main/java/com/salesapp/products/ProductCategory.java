package com.salesapp.products;

public enum ProductCategory {

	BOOK(0.0, false), ENTERTAINMENT(1.25, false), FOOD(0.0, false), UNKNOWN(0.0, false), MEDICAL(0.0,
			true), MISCELLANEOUS(0.0, false);
	
	private final double additionalTax;
	private final boolean isSaleTaxExempted;

	ProductCategory(double additionalTax, boolean isSaleTaxExempted) {
		this.additionalTax = additionalTax;
		this.isSaleTaxExempted = isSaleTaxExempted;
	}

	public double getAdditionalTax() {
		return additionalTax;
	}

	public boolean isSaleTaxExempted() {
		return isSaleTaxExempted;
	}

}
