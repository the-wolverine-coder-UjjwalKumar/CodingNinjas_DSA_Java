package course_2_DSA_Java.dynamicProgramming_DP2;

public class ZeroOneKnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Leetcode daily solution
	public static int knapsack(int[] wt, int[] val, int n, int W) {
		// Your code goes here
		int[][] dp = new int[n + 1][W + 1];

		for (int i = n - 1; i >= 0; i--) {
			for (int w = 0; w <= W; w++) {
				if (wt[i] <= w) {
					int ans1 = dp[i + 1][w];
					int ans2 = dp[i + 1][w - wt[i]] + val[i];
					dp[i][w] = Math.max(ans1, ans2);
				} else {
					dp[i][w] = dp[i + 1][w];
				}
			}
		}
		return dp[0][W];
	}

}
