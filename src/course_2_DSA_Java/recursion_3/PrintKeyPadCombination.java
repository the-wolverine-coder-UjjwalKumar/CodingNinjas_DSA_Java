package course_2_DSA_Java.recursion_3;

public class PrintKeyPadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printKeyPadCombination(23, "");

	}

	public static void printKeyPadCombination(int num, String soFar) {

		if (num == 0) {
			System.out.println(soFar);
			return;
		}

		int smallInp = num / 10;
		String lastDigitOption = getDigitOptions(num % 10);

		for (char ch : lastDigitOption.toCharArray()) {
			printKeyPadCombination(smallInp, ch + soFar);
		}

		return;
	}

	public static String getDigitOptions(int n) {
		String ans = "";

		switch (n) {

		case 1:
			ans = "";
			break;

		case 2:
			ans = "abc";
			break;

		case 3:
			ans = "def";
			break;

		case 4:
			ans = "ghi";
			break;

		case 5:
			ans = "jkl";
			break;

		case 6:
			ans = "mno";
			break;

		case 7:
			ans = "pqrs";
			break;

		case 8:
			ans = "tuv";
			break;

		case 9:
			ans = "wxyz";
			break;

		}

		return ans;
	}

}
