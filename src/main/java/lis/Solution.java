package lis;

/**
 * @author lipenglin
 * @since 2020/03/27 13:21
 */
public class Solution {
  public int lengthOfLIS(int[] nums) {
    if (nums.length < 2) {
      return nums.length;
    }

    int[] dp = new int[nums.length];
    dp[0] = 1;
    int res = Integer.MIN_VALUE;

    for (int i = 1; i < nums.length; i++) {
      int jMax = 0;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          jMax = Math.max(jMax, dp[j]);
        }
      }
      dp[i] = jMax + 1;
      res = Math.max(res, dp[i]);
    }

    return res;
  }
}