package destiny.leetcode.array;

/**
 * @Author: weiwanmin
 * @Date: 2019/9/25 16:27
 * @Version 1.0
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * 示例:
 *
 * 现有矩阵 matrix 如下：
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 *
 * 给定 target = 20，返回 false。
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix-ii
 */
public class SearchMatrix {
    /**
     * 思路
     * 因为二维数组是有序的
     * 每行的元素从左到右升序排列
     * 每列的元素从上到下升序排列
     * 那么就注定了从左下角开始遍历的话，比较快速
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrixMethodOne(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        boolean result = false;
        int rowNumber = matrix.length;
        int colNumber = matrix[0].length;
        for(int i=rowNumber-1;i>=0;i--){
            for(int j=0;j<colNumber;j++){
                if(matrix[i][j]>target){
                    break;
                }else{
                    if(matrix[i][j]==target){
                        result = true;
                        return result;
                    }
                }
            }
        }
        return result;
    }

    /**
     * 从头开始遍历二维数组，判断目标值是否在数组中
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrixMethodTwo(int[][] matrix, int target){
        boolean result =false;
        if(matrix== null||matrix.length==0||matrix[0].length==0) return result;
        int rowNumber = matrix.length;
        int colNumber = matrix[0].length;
        for(int i=0;i<rowNumber;i++){
            for(int j=0;j<colNumber;j++){
                if(matrix[i][j] == target){
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }

}
