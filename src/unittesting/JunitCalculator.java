package unittesting;

import junit.framework.Assert;

public class JunitCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int additionResult = cal.addition(20, 20);
		Assert.assertEquals(additionResult, 40);
		int subtractionResult = cal.subtraction(50, 30);
		Assert.assertEquals(subtractionResult, 20);

	}

}
