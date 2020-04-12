package numislands;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 *
 * @author lipenglin
 * @since 2020/04/12 18:46
 */
public class SolutionTest {

  @Test
  public void testNumIslands() {
    Solution solution = new Solution();
    Assert.assertEquals(1, solution.numIslands(new char[][] {
            new char[] {'1', '1', '1', '1', '0'},
            new char[] {'1', '1', '0', '1', '0'},
            new char[] {'1', '1', '0', '0', '0'},
            new char[] {'0', '0', '0', '0', '0'}
        })
    );
    Assert.assertEquals(3, solution.numIslands(new char[][] {
            new char[] {'1', '1', '0', '0', '0'},
            new char[] {'1', '1', '0', '0', '0'},
            new char[] {'0', '0', '1', '0', '0'},
            new char[] {'0', '0', '0', '1', '1'}
        })
    );
    Assert.assertEquals(58, solution.numIslands(new char[][] {
            new char[] {'1','0','0','1','1','1','0','1','1','0','0','0','0','0','0','0','0','0','0','0'},
            new char[] {'1','0','0','1','1','0','0','1','0','0','0','1','0','1','0','1','0','0','1','0'},
            new char[] {'0','0','0','1','1','1','1','0','1','0','1','1','0','0','0','0','1','0','1','0'},
            new char[] {'0','0','0','1','1','0','0','1','0','0','0','1','1','1','0','0','1','0','0','1'},
            new char[] {'0','0','0','0','0','0','0','1','1','1','0','0','0','0','0','0','0','0','0','0'},
            new char[] {'1','0','0','0','0','1','0','1','0','1','1','0','0','0','0','0','0','1','0','1'},
            new char[] {'0','0','0','1','0','0','0','1','0','1','0','1','0','1','0','1','0','1','0','1'},
            new char[] {'0','0','0','1','0','1','0','0','1','1','0','1','0','1','1','0','1','1','1','0'},
            new char[] {'0','0','0','0','1','0','0','1','1','0','0','0','0','1','0','0','0','1','0','1'},
            new char[] {'0','0','1','0','0','1','0','0','0','0','0','1','0','0','1','0','0','0','1','0'},
            new char[] {'1','0','0','1','0','0','0','0','0','0','0','1','0','0','1','0','1','0','1','0'},
            new char[] {'0','1','0','0','0','1','0','1','0','1','1','0','1','1','1','0','1','1','0','0'},
            new char[] {'1','1','0','1','0','0','0','0','1','0','0','0','0','0','0','1','0','0','0','1'},
            new char[] {'0','1','0','0','1','1','1','0','0','0','1','1','1','1','1','0','1','0','0','0'},
            new char[] {'0','0','1','1','1','0','0','0','1','1','0','0','0','1','0','1','0','0','0','0'},
            new char[] {'1','0','0','1','0','1','0','0','0','0','1','0','0','0','1','0','1','0','1','1'},
            new char[] {'1','0','1','0','0','0','0','0','0','1','0','0','0','1','0','1','0','0','0','0'},
            new char[] {'0','1','1','0','0','0','1','1','1','0','1','0','1','0','1','1','1','1','0','0'},
            new char[] {'0','1','0','0','0','0','1','1','0','0','1','0','1','0','0','1','0','0','1','1'},
            new char[] {'0','0','0','0','0','0','1','1','1','1','0','1','0','0','0','1','1','0','0','0'}
        })
    );
  }
}