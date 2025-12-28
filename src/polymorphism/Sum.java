package polymorphism;

public class Sum {
	public void add(int x,int y) {
		System.out.println(" sum of 2 integers "+(x+y));
	}
	
	public void add(double x,double y) {
		System.out.println(" sum of 2 double "+(x+y));
	}
	public void add(long x,double y) {
		System.out.println(" sum of long & double"+(x+y));
	}
	public void add(long x,long y) {
		System.out.println(" sum of 2 longs"+(x+y));
	}
	public void add(int x,double y) {
		System.out.println(" sum of int & double "+(x+y));
	}

}
