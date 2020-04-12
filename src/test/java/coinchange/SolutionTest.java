package coinchange;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 *
 * @author lipenglin
 * @since 2020/04/12 18:40
 */
public class SolutionTest {

  @Test
  public void testCoinChange() {
    Assert.assertEquals(3, new Solution().coinChange(new int[] {1, 2, 5}, 11));
  }
}