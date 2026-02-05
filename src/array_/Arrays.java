package array_;

import polymorphism.Clock;

public class Arrays {

	public static void main(String[] args) {
		//method 1
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		//method 2: using new operator
		float[] array2=new float[10];

		for (int i : array1) {
			//System.out.println(i);
		}

		for (int i = 0; i < array1.length; i++) {
			//System.out.println("value of array[" + i + "] is " + array1[i]);
		}
		
		
		
		for(int i=0;i<array2.length;i++) {
			 System.out.println("Hi "+array2[i]);
		}
		Clock C[]=new Clock[5];
	}

}
