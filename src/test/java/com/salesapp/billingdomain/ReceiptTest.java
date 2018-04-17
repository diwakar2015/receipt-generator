/**
 * 
 */
package com.salesapp.billingdomain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.salesapp.products.BookProduct;
import com.salesapp.products.EntertainmentProduct;
import com.salesapp.products.FoodProduct;
import com.salesapp.products.MedicalProduct;
import com.salesapp.products.Product;
import com.salesapp.products.ProductCategory;
import com.salesapp.taxcalculations.SaleTaxCalculator;

/**
 * Test case for {@link com.salesapp.billingdomain.Receipt}
 *
 * @author diwakarc
 */
public class ReceiptTest {
	
	
	/** Creates a test fixture */
	Biller b;
	List<Product> prodList;
	Receipt receipt;
	
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
		
		receipt = new Receipt(prodList, 9.60, 60.98);
	}
	
	/**
	 * Test method for {@link com.salesapp.billingdomain.Receipt#Receipt(java.util.List, double, double)}.
	 */
	@Test
	public void testReceipt()
	{
		assertEquals(4, receipt.getTotalNumberOfItems());
		assertEquals(9.60, receipt.getTotalSalesTax(), 0.0009);
		assertEquals(60.98, receipt.getTotalAmount(), 0.0009);
	}
	
	@Test
	public void testReceiptGetterSetters()
	{
		Receipt rec = new Receipt();
		rec.setProductList(prodList);
		rec.setTotalAmount(60.98);
		rec.setTotalSalesTax(9.60);
		
		assertEquals(4, rec.getTotalNumberOfItems());
		assertEquals(9.60, rec.getTotalSalesTax(), 0.0009);
		assertEquals(60.98, rec.getTotalAmount(), 0.0009);
		assertEquals(4, rec.getProductList().size());
	}

}
