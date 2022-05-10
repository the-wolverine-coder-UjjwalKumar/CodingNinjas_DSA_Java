package course_2_DSA_Java.recursion_3;

public class PrintPermutationOfString {
	
	/*
	Given a string, find and print all the possible permutations of the input string.
	Note : The order of permutations are not important. Just print them in different lines.

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

	public static void permutations(String input) {
		// Write your code here
		permutationsHelper(input, "");

	}

	private static void permutationsHelper(String input, String output) {
		if (input.length() == 0)
			System.out.println(output);

		for (int i = 0; i < input.length(); i++)
			permutationsHelper(input.substring(0, i) + input.substring(i + 1), output + input.charAt(i));
	}

}
