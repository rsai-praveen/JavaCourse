package encapsulation;

public class Bank {
	
	// data hiding using private keywor\
	private double balance=1000009;
	// to access private data public method need to declare in same class
	//getter are methods used to get data
	//setters are methods used to setdata
	public double getmethod(int pin) {
		if(pin==9865)
		{
			return balance;
		}
		else
		{
			System.out.println("invalid pin");
			return 0.0;
		}
	}
	
}
