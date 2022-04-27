package exercises;

public class Exerciseclasses {
	
	public static void addition(double num1,double num2) {
		double finalSum = num1+num2;
		System.out.println(finalSum);
	}
	public static void subtraction(double num1,double num2) {
		double finalSum = num1-num2;
		System.out.println(finalSum);
	}
	public static void multiplication(double num1,double num2) {
		double finalSum = num1*num2;
		System.out.println(finalSum);
	}
	public static void division(double num1,double num2) {
		double finalSum = num2/num1;
		if(num1 < num2) {
		System.out.println(finalSum);
		}	else	{
		System.out.println("The division of "+num1+" and "+num2+" cannot be performed" );
		}

	}

	public static void main(String[] args) {
		addition(5,7);
		subtraction(4,12);
		multiplication(9,45);
		division(12,60);
		division(7,3);
	}

	}
