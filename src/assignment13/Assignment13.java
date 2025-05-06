package assignment13;

public class Assignment13 {

	public static void main(String[] args) {
		// prime number is divisible by 1 or by itself//
		int input = 1 ;
		boolean prime = true;
		if (input<=1) {
			System.out.println(input+"is not a prime number");
		}

		for( int i=2; i< input; i++) {
			if (input %i == 0) {
				prime = false;
				}
		}
		if(prime)
			System.out.println(input+ " is a prime number");
		else
			System.out.println(input+ " is not a prime number");
	}

}
