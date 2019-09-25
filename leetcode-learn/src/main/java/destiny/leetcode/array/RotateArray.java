package destiny.leetcode.array;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 19:29
 * @Version 1.0
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 *
 * 链接：https://leetcode-cn.com/problems/rotate-array
 */
public class RotateArray {
    /**
     * 思路：
     * 先按照移动一步的考虑,最后一个元素肯定在第一个位置
     * 那么只要解决了移动一步的问题,那么也就解决了,移动k步的问题
     * 解决移动一步的方法
     * 先取出最后一个元素赋值给一个变量x,记录第一个元素给临时变量temp,然后把取出的最后一个元素给第一个,把临时变量temp给x
     * @param nums
     * @param k
     */
    public void rotateMethodOne(int[] nums, int k){
        for(int i=0;i<k;i++){
            int x = nums[nums.length-1];
            for(int j=0;j<nums.length;j++){
                int temp = nums[j];
                nums[j]=x;
                x = temp;
            }
        }
    }

    /**
     * 移动k,那么新的下标就是 (i+k)%array.length
     * @param nums
     * @param k
     */
    public void rotateMethodTwo(int[] nums, int k){
        int [] temp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length] = nums[i];
        }
    }
}
