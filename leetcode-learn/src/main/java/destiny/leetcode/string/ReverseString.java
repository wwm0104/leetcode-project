package destiny.leetcode.string;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 15:44
 * @Version 1.0
 * 题目
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 * 链接：https://leetcode-cn.com/problems/reverse-string
 */
public class ReverseString {
    /**
     * 思路
     * 翻转字符数组
     *  下标为0的元素,一定和 下标为array.length-1-0的元素对换位置
     *  下标为1的元素,一定和下标为array.length-1-1的元素对换位置
     *  .....
     *  同理下标为i的元素,一定和下标为array.length-1-i的元素对换位置
     *  只要从下标0开始遍历，循环到中间数组中间即可
     * @param s
     */
    public void reverseString(char[] s) {
        for(int i=0;i<(s.length/2);i++){
            char temp = s[i];
            s[i]= s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
