package controlflowstatements;

public class Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i==6) {
				continue; // skip the iteration if i=6
			}
			System.out.println("hi "+i);
			
		}

	}

}
