package numislands;

import java.util.Objects;

/**
 * @author lipenglin
 * @since 2020/03/31 15:40
 */
class Solution {
  private static final int VERTICAL = 0;
  private static final int LEVEL = 1;
  private static final int[][] DIRECTION = new int[][] {
      new int[] {-1, 0},
      new int[] {1, 0},
      new int[] {0, -1},
      new int[] {0, 1}
  };

  private int y;

  public int numIslands(char[][] grid) {
    if (Objects.isNull(grid) || grid.length == 0) {
      return 0;
    }

    int x = grid.length;
    y = grid[0].length;

    UF uf = UF.of(x, y);

    for (int i = 0; i < grid.length; i++) {
      char[] row = grid[i];
      for (int j = 0; j < row.length; j++) {
        char column = row[j];
        if (column == '0') {
          uf.dummyArea(index(i, j));
        }
      }
    }

    for (int i = 0; i < grid.length; i++) {
      char[] row = grid[i];
      for (int j = 0; j < row.length; j++) {
        char column = row[j];
        if (column == '0') {
          continue;
        }
        int ufA = index(i, j);
        for (int[] move : DIRECTION) {
          int nextX = i + move[VERTICAL];
          int nextY = j + move[LEVEL];
          if (nextX < 0 || nextX >= x || nextY < 0 || nextY >= y) {
            continue;
          }
          int ufB = index(nextX, nextY);
          if (!uf.connected(ufA, ufB)) {
            uf.union(ufA, ufB);
          }
        }
      }
    }

    return uf.getCount();
  }

  private int index(int i, int j) {
    return i * y + j;
  }

  static class UF {
    private final int dummy;

    private int count;
    private int[] parents;

    public UF(int x, int y) {
      dummy = x * y;
      count = dummy;
      parents = new int[dummy + 1];
      for (int i = 0; i < parents.length; i++) {
        parents[i] = i;
      }
    }

    private int find(int a) {
      int aParent = a;
      while (aParent != parents[aParent]) {
        aParent = parents[aParent];
      }
      int tmpParent = a;
      while (tmpParent != aParent) {
        int next = parents[tmpParent];
        parents[tmpParent] = aParent;
        tmpParent = next;
      }
      return aParent;
    }

    public void union(int a, int b) {
      int aParent = find(a);
      int bParent = find(b);
      if (aParent == dummy || bParent == dummy) {
        return;
      }
      if (aParent != bParent) {
        parents[aParent] = bParent;
        this.count--;
      }
    }

    public boolean connected(int a, int b) {
      return find(a) == find(b);
    }

    public int getCount() {
      return this.count;
    }

    public void dummyArea(int a) {
      parents[a] = dummy;
      count--;
    }

    public static UF of(int x, int y) {
      return new UF(x, y);
    }
  }
}