package exercises;

public class ResultsExercise {

	static double chemistry;
	static double physics;
	static double biology;
	static double total;
	static double percentage; 	
	
	public static void method1(double chemistryResults, double physicsResults, double biologyResults) {
		chemistry = chemistryResults;
		physics = physicsResults;
		biology = biologyResults;
		total = physics+chemistry+biology;
		System.out.println("You scored "+chemistry+" out of 150 on your chemistry test.");
		System.out.println("You scored "+physics+ " out of 150 on your chemistry test.");
		System.out.println("You scored "+biology+ " out of 150 on your chemistry test.");
		System.out.println("Your total is "+total+ " out of 450 on your chemistry test.");
	}
		
	public static void method2() {
		percentage = total*100/450;
		System.out.println("Your total percentage is "+percentage+ " out of 100% on all of your tests combined.");
	}

	public static void main(String[] args) {
		method1(34,67,98);
		method2();	
	}
}

