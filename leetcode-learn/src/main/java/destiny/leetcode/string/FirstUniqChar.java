package destiny.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 15:55
 * @Version 1.0
 * firstUniqChar
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *  
 *
 * 注意事项：您可以假定该字符串只包含小写字母
 *
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 */
public class FirstUniqChar {
    /**
     * 思路
     * 因为要查找第一个不重复的元素
     * 所以使用map记录对应的字符的次数
     * 然后判断是否条件满足，有条件满足就返回，没有就返回-1
     * @param s
     * @return
     */
    public int firstUniqCharMethodOne(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> dataResult = new HashMap<Character, Integer>();
        for(int i=0;i<chars.length;i++){
            dataResult.put(chars[i],dataResult.getOrDefault(chars[i], 0) + 1);
        }
        int result =-1;
        for(int i=0;i<chars.length;i++){
            if(dataResult.get(chars[i])==1){
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * 双层循环，统计每个字符串出现的次数，满足就返回，
     * @param s
     * @return
     */
    public int firstUniqCharMethodTwo(String s) {
        char[] chars = s.toCharArray();
        int result =-1;
        for(int i=0;i<chars.length;i++){
            int countNumber =0;//记录出现的次数
            for(int j=0;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    countNumber +=1;
                }
            }
            if(countNumber == 1){
                result = i;
                return result;
            }
        }
        return result;
    }
}
