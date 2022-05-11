package course_2_DSA_Java.dynamicProgramming_DP1;

import java.util.Arrays;

public class CountMinStepToReachOneDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMinStepsToOne(7));
	}

	public static int countMinStepsToOne(int n) {
		// Your code goes here
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return countMinStepHelper(n, dp);

	}

	public static int countMinStepHelper(int n, int[] dp) {

		if (n == 1) {
			return 0;
		}

		int ans1;

		if (dp[n - 1] == -1) {
			ans1 = countMinStepHelper(n - 1, dp);
			dp[n - 1] = ans1;
		} else {
			ans1 = dp[n - 1];
		}

		// int ans1 = countMinStepHelper(n-1, dp);
		int ans2 = Integer.MAX_VALUE;

		if (n % 2 == 0) {
			if (dp[n / 2] == -1) {
				ans2 = countMinStepHelper(n / 2, dp);
				dp[n / 2] = ans2;
			} else {
				ans2 = dp[n / 2];
			}
		}

		int ans3 = Integer.MAX_VALUE;
		if (n % 3 == 0) {
			if (dp[n / 3] == -1) {
				ans3 = countMinStepHelper(n / 3, dp);
				dp[n / 3] = ans3;
			} else {
				ans3 = dp[n / 3];
			}
		}

		return 1 + Math.min(ans1, Math.min(ans2, ans3));
	}

	public static int countMinStepsToOneDP(int n) {
		// Your code goes here
		if (n == 0 || n == 1)
			return 0;
		else if (n == 2 || n == 3)
			return 1;

		int[] dp = new int[n + 1];
		for (int i = 0; i < n + 1; i++)
			dp[i] = -1;

		// Setting base cases
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
		for (int i = 4; i <= n; i++) {
			// System.out.println("Current i: "+i);
			int ans1 = dp[i - 1];
			int ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
			if (i % 2 == 0) {
				ans2 = dp[i / 2];
			}
			if (i % 3 == 0) {
				ans3 = dp[i / 3];
			}
			// System.out.println("ans1: "+ans1+", ans2: "+ans2+", ans3: "+ans3);
			dp[i] = Math.min(ans1, Math.min(ans2, ans3)) + 1;
			// System.out.println(i+": "+dp[i]);
		}
		return dp[n];
	}

}
