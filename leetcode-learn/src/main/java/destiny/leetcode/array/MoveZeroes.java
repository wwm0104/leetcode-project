package destiny.leetcode.array;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/26 10:18
 * @Version 1.0
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 */
public class MoveZeroes {
    /**
     * 思路
     * 移动0到数组末尾,那么就可以换个描述，把不等于0的元素前移,空余的全部为0
     * @param nums
     */
    public void moveZeroesMethodOne(int[] nums){
        int countNumber =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                nums[countNumber] = nums[i];
                countNumber++;
            }
        }
        for(int i=countNumber;i<nums.length;i++){
            nums[countNumber] =0;
        }
    }

}
