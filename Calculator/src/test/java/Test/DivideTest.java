package Test;



import org.junit.Assert;

import MathFunction.Divide;
import org.junit.Test;

public class DivideTest {

	@Test
	public void testDivide() {
		Assert.assertEquals(69,Divide.compute(69,1));
	}

}
