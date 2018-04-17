/**
 * 
 */
package com.salesapp.taxcalculations;

import java.text.DecimalFormat;

/**
 * The MathHelper class provides mathematical helper functions to use on double
 * values.
 * 
 * @author diwakarc
 */
public class MathHelper {

	/** Rounds off a double value to the nearest 0.05 */
	public static double roundOff(double value) {
		double roundedValue = Math.ceil(value * 20) / 20;
		return roundedValue;
	}

	/** Truncates a double value to two decimal places. */
	public static double truncate(double value) {
		String result = new DecimalFormat("0.00").format(value);
		return Double.parseDouble(result);
	}
}
