package exercises;

public class Arrayexercises {

	
	static int num[] = {1,2,3,4,5,6,7,8,9,0};
	static int[] emptyNum = new int[10];
			
	public static void integerOutput() {
		for(int i : num) {
			System.out.println(i);
		}
	}
	
	public static void integerIteration() {
			for (int i = 0; i< emptyNum.length; i++) {
			System.out.println(i);
		}
	}
	
	public static void integerIterationTen() {
		for (int i = 0; i< emptyNum.length; i++) {
		int j= i*10;
		System.out.println(j);
	}
}
	
	public static void main(String[] args) {
		//integerOutput();
		//integerIteration();
		integerIterationTen();
	}

}
