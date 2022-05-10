package course_2_DSA_Java.recursion_3;

public class FindMinElementInArray {

	public static int findMin(int arr[], int n) {
		
		if (n == 1)
			return arr[0];

		return Math.min(arr[n - 1], findMin(arr, n - 1));
	}

	public static void main(String args[]) {
		int A[] = { 1, 4, 45, 6, -50, 10, 2 };
		int n = A.length;

		System.out.println(findMin(A, n));
	}

}
