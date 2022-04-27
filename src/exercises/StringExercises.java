package exercises;

public class StringExercises {
	
	public static void inHere() {
	String yesterday = "Yesterday it was raining";
	String today = "Today it is sunny";
	String together = yesterday+ ", "+today;
	System.out.println(together.toUpperCase());
	String raintoday = today.substring(0,12)+yesterday.substring(17,24);
	System.out.println(raintoday.toUpperCase());
	}
	
	public static void method1() {
		
	}
	
	public static void method2() {
		
	}
	
	public static void method3() {
		
	}

	public static void method4() {
		
	}

	public static void main(String[] args) {
		inHere();
		method1();
		method2();
		method3();
		method4();
	}

}
