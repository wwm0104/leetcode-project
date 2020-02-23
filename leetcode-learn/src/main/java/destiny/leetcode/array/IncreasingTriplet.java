package destiny.leetcode.array;

import java.awt.datatransfer.FlavorListener;
import java.beans.beancontext.BeanContext;
import java.util.Arrays;

/**
 * @Author: weiwanmin
 * @Date: 2019/10/8 19:38
 * @Version 1.0
 * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 *
 * 数学表达式如下:
 *
 * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1) 。
 */
public class IncreasingTriplet {
    /**
     * 先定义两个变量 ti,tj
     * 如果 array[i] < ti 则 ti = array[i]
     * 否则 与 tj比较  满足 array[i]< tj 时 tj = array[i]
     * 先保证找出递增的二元子串
     * @param nums
     * @return
     */
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        boolean flag = false;
        int ti = Integer.MAX_VALUE;
        int tj = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=ti){
                ti=nums[i];
            }else if(nums[i]<=tj){
                tj = nums[i];
            }else{
                flag =true;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        int [] temp ={5,1,5,4,2,1,1};
        increasingTriplet(temp);
    }
}
