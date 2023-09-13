package gitpack;

//Java code to demonstrate star pattern
public class pyramid {
	// Driver Function
	public static void main(String args[]) {

		// Function to demonstrate printing pattern
		int n = 5;

		// outer loop to handle number of rows
		// n in this case
		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = 2 * (n - i); j >= 0; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}
}
