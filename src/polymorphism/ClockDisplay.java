package polymorphism;

public class ClockDisplay {

	public static void main(String[] args) {
		Clock c=new Clock();
		c.setClock(8);
		c.getClock();
		c.setClock(8,5);
		c.getClock();
		c.setClock(8, 9,10);
		c.getClock();

	}

}
