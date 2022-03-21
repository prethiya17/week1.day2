package week1.day2;

public class Calculator {

	public int add(int num1,int num2)
	{
		int sum=num1+num2;
		System.out.println("Addition"+":"+sum);
		return sum;
	}

	public double sub(double num3,double num4)
	{
		double diff=num3-num4;
		System.out.println("Subtraction"+":"+diff);
		return diff;
	}

	public double multiply(double num5,double num6)
	{
		double mul=num5*num6;
		System.out.println("Multiplication"+":"+mul);
		return mul;
	}
// declaring everything within the same method,We can decrease the time by having only one 
//return 
	public double div(double num7,double num8)
	{
		double div=num7/num8;
		System.out.println("Division"+":"+div);
		return div;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c=new Calculator();
		c.add(56, 57);
		c.sub(5.6, 4.7);
		c.multiply(45, 78.9);
		c.div(56, 8);
	}

}
