/**
 * 
 */
package com.salesapp.billingdomain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.salesapp.products.*;
import com.salesapp.taxcalculations.SaleTaxCalculator;

/**
 * Test case for {@link com.salesapp.billingdomain.Biller}
 * 
 * @author diwakarc
 */
public class BillerTest {

	/** Creates a test fixture */
	Biller b;
	List<Product> prodList;
	
	BookProduct book;
	FoodProduct food;
	MedicalProduct medical;
	EntertainmentProduct entertainmnet;
	
	/** Initializes the test fixture */
	@Before
	public void setUp()
	{
		b = new Biller(new SaleTaxCalculator());
		
		food = new FoodProduct("bottle of wine", 20.99, 1, ProductCategory.FOOD);
		book = new BookProduct("box of pins", 11.25, 1, ProductCategory.BOOK);
		medical = new MedicalProduct("box of tooth ache pills", 4.15, 1, ProductCategory.MEDICAL);
		entertainmnet = new EntertainmentProduct("music CD", 14.99, 1, ProductCategory.ENTERTAINMENT);
		
		prodList = new ArrayList<Product>();
		prodList.add(book);
		prodList.add(food);
		prodList.add(medical);
		prodList.add(entertainmnet);
		
	}
	
	/**
	 * Test method for {@link com.salesapp.billingdomain.Biller#calculateTax(double, ProductCategory)}.
	 */
	@Test
	public void testCalculateTax() 
	{
		assertEquals(3.7, b.calculateTax(20.99, ProductCategory.BOOK), 0.0009);
	}

	/**
	 * Test method for {@link com.salesapp.billingdomain.Biller#calcTotalProductCost(double, double)}.
	 */
	@Test
	public void testCalcTotalProductCost() 
	{
		assertEquals(24.69, b.calcTotalProductCost(20.99, 3.7), 0);
	}

	/**
	 * Test method for {@link com.salesapp.billingdomain.Biller#calcTotalTax(java.util.List)}.
	 */
	@Test
	public void testCalcTotalTax()
	{
		b.computeTaxes(prodList);
		assertEquals(9.60, b.calcTotalTax(prodList), 0);
	}

	/**
	 * Test method for {@link com.salesapp.billingdomain.Biller#calcTotalAmount(java.util.List)}.
	 */
	@Test
	public void testCalcTotalAmount() 
	{
		b.computeTaxes(prodList);
		assertEquals(60.98, b.calcTotalAmount(prodList), 0);
	}

	/**
	 * Test method for {@link com.salesapp.billingdomain.Biller#createNewReceipt(java.util.List, double, double)}.
	 */
	@Test
	public void testCreateNewReceipt()
	{
		Receipt r = b.createNewReceipt(prodList, 9.60, 60.98);
		assertEquals(4, r.getTotalNumberOfItems());
		assertEquals(9.60, r.getTotalSalesTax(), 0.0009);
		assertEquals(60.98, r.getTotalAmount(), 0.0009);
	}
	
	/**
	 * Test method for {@link com.salesapp.billingdomain.Biller#generateReceipt(Receipt))}.
	 */
	@Test
	public void testGenerateReceipt()
	{
		Receipt r = b.createNewReceipt(prodList, 9.60, 60.98);
		b.generateReceipt(r);
	}
}