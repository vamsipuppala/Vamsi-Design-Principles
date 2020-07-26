package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import MathFunction.Multiply;


public class MultiplyTest {

	@Test
	public void testMultiply() {
		Assert.assertEquals(69,Multiply.compute(69,1));
		
	}

}
