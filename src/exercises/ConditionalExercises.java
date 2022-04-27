package exercises;

public class ConditionalExercises {

	public static void uniqueSum(int num1, int num2, int num3) {
		if (num1 == num2) {
			System.out.println(num1 + num3);
		} else if (num1 == num3) {
			System.out.println(num1 + num2);
		} else if (num2 == num3) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(num1 + num2 + num3);
		}
	}

	public static void fizzPop(int num1) {
		if (num1 % 3 <= 0 && num1 % 5 <= 0) {
			System.out.println("FizzPop");
		} else if (num1 % 3 <= 0) {
			System.out.println("Fizz");
		} else if (num1 % 5 <= 0) {
			System.out.println("Pop");
		} else {
			System.out.println(num1);
		}
	}

	public static void blackJack(int num1, int num2) {
		if (num1 <= 21 && num2 > 21) {
			System.out.println(num1);
		} else if (num2 <= 21 && num1 > 21) {
			System.out.println(num2);
		} else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
		uniqueSum(7, 5, 4);
		fizzPop(2);
		blackJack(21, 17);
	}

}
