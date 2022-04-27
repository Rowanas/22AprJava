package exercises;

public class Results {

	public static double num1 = 5;
	public static double num2 = 7;
	
	public static double addition() {
		double finalSum = num1+num2;
		return finalSum;
	}
	public static double subtraction() {
		double finalSum = num1-num2;
		return finalSum;
	}
	public static double multiplication() {
		double finalSum = num1*num2;
		return finalSum;
	}
	public static double division() {
		double finalSum = num1/num2;
		return finalSum;
	}
	
	static double chemistry = 34;
	static double physics = 95;
	static double biology = 143;
	static double total = 150;
	static double percentage = 100; 	
	
	public static void method1() {
		System.out.println("You scored "+chemistry+" out of "+total+" on your chemistry test.");
		System.out.println("You scored "+physics+" out of "+total+" on your physics test.");
		System.out.println("You scored "+biology+" out of "+total+" on your biology test.");
	}
		
	public static String method2() {
		double score = ((chemistry+physics+biology)/450)*100;
		return ("You scored"+score+" percent!" );
		
	}

	public static void main(String[] args) {
		method1();
		System.out.println(method2());
		
	}
}
