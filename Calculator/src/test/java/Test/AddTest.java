package Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import MathFunction.Add;

public class AddTest {

	@Test
	public void testAdd() {
		Assert.assertEquals(69,Add.compute(68,1));
		
	}

}
