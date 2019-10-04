package destiny.leetcode.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: weiwanmin
 * @Date: 2019/10/4 21:12
 * @Version 1.0
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 *
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 *
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 */
public class Solution {
    /**
     * 先统计出现的次数
     * 然后构造一个优先级队列
     * 优先级队列的长度为k(因为要取前k个高频的元素)
     * @param nums
     * @param k
     * @return
     */
    public List<Integer> topKFrequent(int[] nums, int k){
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        //特别有意思的是在构造优先级队列时,使用的比较器
        PriorityQueue<Integer> result = new PriorityQueue<>((n1,n2)->count.get(n1).compareTo(count.get(n2)));
        for(int n:count.keySet()){
            result.add(n);
            if(result.size() > k){
                result.poll();
            }
        }
        List<Integer> t = new ArrayList<>();
        while (!result.isEmpty()){
            t.add(result.poll());
        }
        return t;
    }
}
