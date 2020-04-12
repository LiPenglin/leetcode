package lis;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 *
 * @author lipenglin
 * @since 2020/04/12 18:45
 */
public class SolutionTest {

  @Test
  public void testLengthOfLIS() {
    Solution solution = new Solution();
    Assert.assertEquals(4, solution.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18}));
    Assert.assertEquals(6, solution.lengthOfLIS(new int[] {1, 3, 6, 7, 9, 4, 10, 5, 6}));
    Assert.assertEquals(0, solution.lengthOfLIS(new int[] {}));
  }
}