package App;

import MathFunction.Divide;
import MathFunction.Multiply;
import MathFunction.Subtract;
import MathFunction.Add;

public class Driver {
public static void main(String [] args) { 
	
System.out.println(Multiply.compute(3, 5));
System.out.println(Divide.compute(4.0, 2.0));
System.out.println(Add.compute(124,421));
System.out.println(Subtract.compute(70,1));

}

}
