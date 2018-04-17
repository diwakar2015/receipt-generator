/**
 * 
 */
package com.salesapp.products;

import com.salesapp.productfactories.ProductFactory;

/**
 * The Product is the item which is purchased in the shopping store and for
 * which a receipt is generated.
 *
 * @author diwakarc
 * 
 */
public abstract class Product {

	/** name - name of the Product. */
	protected String name;

	/**
	 * price - original price of the product excluding tax for the number of items
	 * specified in the quantity.
	 */
	protected double price;

	/** quantity - the quantity of the product to be purchased. */
	protected int quantity;

	/** ProductCategory - Category which product belongs to */
	protected ProductCategory productCategory;
	
	/** taxedCost - the net price of the product including tax. */
	protected double taxedCost;

	/**
	 * Default constructor to instantiate Product.
	 */
	public Product() {
		this.name = "";
		this.price = 0.0;
		this.quantity = 0;
		this.productCategory = ProductCategory.UNKNOWN;
	}

	/**
	 * Parameterized constructor to initialize the values of the product attributes.
	 *
	 * @param name
	 *            - the name of the product
	 * @param price
	 *            - the price of the product
	 * @param imported
	 *            - boolean value of whether product imported or not
	 * @param quantity
	 *            - quantity of product item
	 */
	public Product(String name, double price, int quantity, ProductCategory productCategory) {
		this.name = name;
		this.price = price * quantity;
		this.quantity = quantity;
		this.productCategory = productCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	
	public double getTaxedCost() {
		return taxedCost;
	}

	public void setTaxedCost(double taxedCost) {
		this.taxedCost = taxedCost;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(this.quantity);
		builder.append(" ");
		builder.append(this.name + ": ");
		builder.append(this.price);
		
		return builder.toString();
	}
	
	public String displayProdutInfo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(this.quantity);
		builder.append(" ");
		builder.append(this.name + ": ");
		builder.append(this.taxedCost);
		
		return builder.toString();
	}

	/**
	 * Gets the factory object to create a product.
	 *
	 * @return ProductFactory
	 */
	public abstract ProductFactory getFactory();
}
