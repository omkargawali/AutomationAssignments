package assignment;

public class Assignment11 {

	public static void main(String[] args) {

		int[] array = { 12, 34, 11, 36, 87, 98, 93 };
		int first = array[0];

		int second = 0;
		int third = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] > first) {
				third = second;
				second = first;
				first = array[i];

			} else if (array[i] > second) {

				third = second;
				second = array[i];

			} else if (array[i] > third) {

				third = array[i];
			}

		}

		System.out.println("Second Largest Number is : " +second);
		System.out.println("Third Largest Number is : " +third);
	}

}
