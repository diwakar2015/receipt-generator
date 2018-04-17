/**
 * 
 */
package com.salesapp.taxcalculations;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test case for {@link com.salesapp.taxcalculations.MathHelper}
 * 
 * @author diwakarc
 */
public class MathHelperTest {

	/**
	 * Test method for
	 * {@link com.salesapp.taxcalculations.MathHelper#roundoff(double)}.
	 */
	@Test
	public void testRoundoff() {
		assertEquals(27.85, MathHelper.roundOff(27.82), 0.0009);
		assertEquals(27.85, MathHelper.roundOff(27.83), 0.0009);
		assertEquals(27.9, MathHelper.roundOff(27.875), 0.0009);
	}

	/**
	 * Test method for
	 * {@link com.salesapp.taxcalculations.MathHelper#truncate(double)}.
	 */
	@Test
	public void testTruncate() {
		assertEquals(27.86, MathHelper.truncate(27.8565), 0);
		assertEquals(27.80, MathHelper.truncate(27.800004), 0);
	}

	public void testCreateMathHelper() {
		MathHelper mathhelper = new MathHelper();
		assertNotNull(mathhelper);

	}
}
