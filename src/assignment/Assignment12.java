package assignment;

public class Assignment12 {
	
	public static void main(String [] args) {
		
		int n = 5;

		// Print upper part of diamond 

		for (int i = 1; i <= n; i++) {

			for (int j = n; j > i; j--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Print Lower part

		for (int i = n - 1; i >= 1; i--) {
			// Print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
