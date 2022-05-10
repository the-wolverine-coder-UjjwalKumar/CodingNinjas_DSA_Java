package course_2_DSA_Java.recursion_3;

public class ReturnPermutationOFString {
	
	/*
	Given a string, find and return all the possible permutations of the input string.
	Note : The order of permutations are not important.

	Sample Input :
	abc
	Sample Output :
	abc
	acb
	bac
	bca
	cab
	cba
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String[] permutationOfString(String input) {
		// Write your code here
		if (input.length() == 0)
			return new String[1];

		if (input.length() == 1) {
			String[] arr = new String[1];
			arr[0] = input;
			return arr;
		}

		char c = input.charAt(0);
		String[] temp = permutationOfString(input.substring(1));
		String[] output = new String[temp.length * input.length()];
		// System.out.println("Total number of permutations till now: "+output.length);
		int k = 0;
		for (int i = 0; i < temp.length; i++) {
			String newstr = temp[i];
			for (int j = 0; j < newstr.length(); j++) {
				output[k] = newstr.substring(0, j) + c + newstr.substring(j);
				k = k + 1;
			}
			output[k] = newstr + c;
			k = k + 1;
			// System.out.println(output[i]);
		}

		return output;

	}

}
