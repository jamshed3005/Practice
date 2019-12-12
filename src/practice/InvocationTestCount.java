package practice;

import org.testng.annotations.Test;

public class InvocationTestCount {
	
	@Test(invocationCount =10, timeOut=2,expectedExceptions=ArithmeticException.class)
	public void test1()
	{
		int c=10;
		int d=20;
		int f= c+d;
		int i=1/0;
		
	}

}
