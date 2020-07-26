package Test;

import org.junit.Assert;
import org.junit.Test;

import MathFunction.Subtract;


public class SubtractTest {

	@Test
	public void testSubtract() {
		Assert.assertEquals(69,Subtract.compute(70,1));
	}

}
