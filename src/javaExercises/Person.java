package javaExercises;

public class Person {

	private String name;
	private double heightM;
	private int shoeSize;
	private String title;
	private int age;

	
	public Person(String name, double heightM, int shoeSize, String title, int age) {
		super();
		this.name = name;
		this.heightM = heightM;
		this.shoeSize = shoeSize;
		this.title = title;
		this.age = age;
	}
	public Person(String name, double heightM) {
		super();
		this.name = name;
		this.heightM = heightM;
	}


	public void greet() {
		System.out.println("Hello, my name is "+name+" and I am a towering "+heightM+" metres tall! Behold me!");
	}
	
	public void icebreaker() {
		System.out.println("Hello, my name is "+name+" and I have a shoe size of "+shoeSize+ "! Behold me!");
	}
}