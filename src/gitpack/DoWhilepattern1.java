package gitpack;
public class DoWhilepattern1 {
	public static void main(String args[]) {
		int i = 0;
		do {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
		} while (i <= 5);
	}
}