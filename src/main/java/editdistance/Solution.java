package editdistance;

/**
 * @author lipenglin
 * @since 2020/03/27 12:01
 */
class Solution {
  public int minDistance(String word1,
      String word2) {
    char[] w1 = word1.toCharArray();
    char[] w2 = word2.toCharArray();
    int[][] dp = new int[w1.length + 1][w2.length + 1];

    for (int i = 0; i < dp.length; i++) {
      dp[i][0] = i;
    }
    for (int j = 0; j < dp[0].length; j++) {
      dp[0][j] = j;
    }

    for (int i = 1; i <= w1.length; i++) {
      for (int j = 1; j <= w2.length; j++) {
        dp[i][j] = w1[i - 1] == w2[j - 1] ? dp[i - 1][j - 1] :
            Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
      }
    }
    return dp[w1.length][w2.length];
  }
}