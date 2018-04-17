package com.salesapp.application;

import java.util.ArrayList;
import java.util.List;

import com.salesapp.billingdomain.Biller;
import com.salesapp.billingdomain.Receipt;
import com.salesapp.products.EntertainmentProduct;
import com.salesapp.products.FoodProduct;
import com.salesapp.products.MedicalProduct;
import com.salesapp.products.MiscellaneousProduct;
import com.salesapp.products.Product;
import com.salesapp.products.ProductCategory;
import com.salesapp.taxcalculations.SaleTaxCalculator;

/**
 * The MainApp class.
 * 
 * 
 * @author diwakarc
 */
public class MainApp {

	public static void main(String[] args) {

		Biller b = new Biller(new SaleTaxCalculator());

		FoodProduct food = new FoodProduct("bottle of wine", 20.99, 1, ProductCategory.FOOD);
		MedicalProduct medical = new MedicalProduct("box of tooth ache pills", 4.15, 1, ProductCategory.MEDICAL);
		MiscellaneousProduct misc = new MiscellaneousProduct("box of pins", 11.25, 1, ProductCategory.MISCELLANEOUS);
		EntertainmentProduct cd = new EntertainmentProduct("music CD", 14.99, 1, ProductCategory.ENTERTAINMENT);

		List<Product> prodList = new ArrayList<Product>();
		prodList.add(food);
		prodList.add(medical);
		prodList.add(misc);
		prodList.add(cd);

		System.out.println("Before computing the taxes....\n");
		prodList.forEach(p -> System.out.println(p.toString()));

		// populate all the taxed amounts
		b.computeTaxes(prodList);

		// compute total tax
		double totalTax = b.calcTotalTax(prodList);

		// compute total amount
		double totalAmount = b.calcTotalAmount(prodList);

		// create receipt
		Receipt receipt = b.createNewReceipt(prodList, totalTax, totalAmount);

		System.out.println("\nAfter generating the receipt....");
		// Generate receipt
		b.generateReceipt(receipt);

	}

}
