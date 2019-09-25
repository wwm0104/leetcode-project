package destiny.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 17:40
 * @Version 1.0
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * 链接：https://leetcode-cn.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    /**
     * 统计每个元素出现的次数，然后判断是否符合要求
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums){
        boolean result = false;
        Map<Integer,Integer> data =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            data.put(nums[i],data.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(data.get(nums[i])>2){
                result = true;
                return result;
            }
        }
        return result;
    }
}
