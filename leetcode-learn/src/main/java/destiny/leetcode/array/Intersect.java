package destiny.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/28 22:01
 * @Version 1.0
 * 定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Intersect {
    /**
     *
     * 两个数组排序
     * 设定两个为0的指针，比较两个指针的元素是否相等
     * 如果相等，元素添加到到临时集合里面，两个指针同时往前
     * 如果不相等，元素小的指针往前
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2){
        List<Integer> array = new ArrayList<>();
        int p1 =0;
        int p2 =0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (p1 <nums1.length && p2 <nums2.length){
            if(nums1[p1] == nums2[p2]){
               array.add(nums1[p1]);
               p1++;
               p2++;
            }else if(nums1[p1]<nums2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        Integer[] integers = array.toArray(new Integer[array.size()]);
        int [] temp = new int[array.size()];
        for(int i=0;i<integers.length;i++){
            temp[i]=integers[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] t1 = new int[]{1,2,2,1};
        int [] t2 = new int[]{2,2};
        intersect(t1,t2);
    }
}
