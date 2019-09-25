package destiny.leetcode.array;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 17:16
 * @Version 1.0
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 */
public class SingleNumber {
    /**
     * 每个相关的元素异或的化是0,0与任何元素异或,是元素本身
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int t =0;
        for(int i=0;i<nums.length;i++){
            t^=nums[i];
        }
        return t;
    }
}
