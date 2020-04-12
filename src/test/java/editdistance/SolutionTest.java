package editdistance;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 *
 * @author lipenglin
 * @since 2020/04/12 18:44
 */
public class SolutionTest {

  @Test
  public void testMinDistance() {
    Solution solution = new Solution();
    Assert.assertEquals(3, solution.minDistance("horse", "ros"));
  }
}