package oops;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		Person obj1=new Person();
		obj.name="praveen";
		obj.age=28;
		obj.ph=9866399144L;
		obj1.name="babu";
		obj1.age=60;
		obj1.ph=1111111111111L;
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(obj.ph);
		obj.greet();
		
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		System.out.println(obj1.ph);
		obj1.greet();
		
		// calling method returns object
		System.out.println(obj.getPerson().name);

	}

}
