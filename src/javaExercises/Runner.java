package javaExercises;

public class Runner {

	public static void main(String[] args) {
		Person Rowan = new Person("Rowan", 1.7, 7, "Trainee", 31);
		Person Jehad = new Person("Jehad", 5.6, 3, "Trainee", 19);
		Person Duckee= new Person("Duckee", 1.4, 14, "Trainee", 56);
		Person Alex = new Person("Alex", 1.2, 9, "Trainee", 12);
		Rowan.greet();
		Alex.greet();
		Jehad.icebreaker();
		Duckee.icebreaker();
	}
}
