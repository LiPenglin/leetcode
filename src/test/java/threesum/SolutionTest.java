package threesum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * TODO
 *
 * @author lipenglin
 * @since 2020/04/12 18:47
 */
public class SolutionTest {

  @Test
  public void testThreeSum() {
    Solution solution = new Solution();
    Assert.assertEquals(Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1)),
        solution.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
  }
}