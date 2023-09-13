package gitpack;

public class PyramidExample {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* "); // print same line

			}
			System.out.println();// new line
		}
	}
}