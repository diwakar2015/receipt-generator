/**
 * 
 */
package main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
 * The MainTest contains test cases for all combinations of different user
 * inputs.
 * 
 * @author diwakarc
 */
public class MainTest {

	/** Test case for all types of products */
	@Test
	public void testSalesTaxForAllProducts() {

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

		// Test before computing the taxes
		assertEquals(4, prodList.size());

		// Test all the product details
		Product p = prodList.get(0);
		assertEquals(20.99, p.getPrice(), 0.0009);
		assertEquals("bottle of wine", p.getName());
		assertEquals(1, p.getQuantity());

		// populate all the taxed amounts
		b.computeTaxes(prodList);

		// compute total tax
		double totalTax = b.calcTotalTax(prodList);
		assertEquals(9.60, totalTax, 0.0009);

		// compute total amount
		double totalAmount = b.calcTotalAmount(prodList);
		assertEquals(60.98, totalAmount, 0.0009);

		// create receipt
		Receipt receipt = b.createNewReceipt(prodList, totalTax, totalAmount);

		// Test the Receipt details
		assertEquals(4, receipt.getTotalNumberOfItems());
		assertEquals(9.60, receipt.getTotalSalesTax(), 0.0009);
		assertEquals(60.98, receipt.getTotalAmount(), 0.0009);

		// Generate receipt
		b.generateReceipt(receipt);

	}

}
