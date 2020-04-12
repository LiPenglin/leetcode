package coinchange;

import java.util.Arrays;

/**
 * @author lipenglin
 * @since 2020/03/25 14:55
 */
public class Solution {
  public int coinChange(int[] coins,
      int amount) {
    int max = amount + 1;
    int[] dp = new int[max];
    Arrays.fill(dp,  max);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      int minValue = max;
      for (int coin : coins) {
        if (coin <= i) {
          minValue = Math.min(minValue, dp[i - coin]);
        }
      }
      dp[i] = minValue + 1;
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }
}