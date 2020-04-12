package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author lipenglin
 * @since 2020/03/30 15:01
 */
class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    if (Objects.isNull(nums) || nums.length < 3) {
      return Collections.emptyList();
    }

    if (Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet())
        .size() == 1 && nums[0] == 0) {
      return Collections.singletonList(Arrays.asList(0, 0, 0));
    }

    Set<List<Integer>> res = new HashSet<>();
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length - 2; i++) {
      set.add(nums[i + 1]);
      for (int j = i + 2; j < nums.length; j++) {
        int k = -(nums[i] + nums[j]);
        if (set.contains(k)) {
          List<Integer> resList = Arrays.asList(nums[i], nums[j], k);
          resList.sort(Comparator.naturalOrder());
          res.add(resList);
        } else {
          set.add(nums[j]);
        }
      }
      set.clear();
    }
    return new ArrayList<>(res);
  }
}