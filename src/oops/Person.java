package oops;

public class Person {
	public  String name;
	public int age;
	public long ph;
	public void greet() {
		System.out.println("good morning "+name);
	}
	public Person getPerson() {
		return new Person();
	}
}
