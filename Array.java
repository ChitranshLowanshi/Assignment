package operators;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = { 99, 85, 9, 55, 78 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; i <= arr1.length; j++) {
				if (arr1[j] > arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr1.length - 1; i++) {
			System.out.println(arr1[i] + " ");
		}
	}
}
