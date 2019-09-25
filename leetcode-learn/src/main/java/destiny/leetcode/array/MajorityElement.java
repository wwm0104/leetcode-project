package destiny.leetcode.array;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 16:53
 * @Version 1.0
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 链接：https://leetcode-cn.com/problems/majority-element
 */
public class MajorityElement {
    /**
     * 双层循环，计算每个元素出现的次数是否符合众数的要求
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums){
        int flag = nums.length / 2;
        Integer result = null;
        for(int i=0;i<nums.length;i++){
            int countNumber =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    countNumber+=1;
                }
            }
            if(countNumber > flag){
                result = nums[i];
                break;
            }
        }
        return result;
    }
}
