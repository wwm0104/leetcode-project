package destiny.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: weiwanmin
 * @Date: 2020/2/18 14:16
 * @Version 1.0
 */
public class TreeSearchTest {
    public static void main(String[] args) {
        Node root = new Node();
        root.setValue(10);

        Node left = new Node();
        left.setValue(6);

        Node right = new Node();
        right.setValue(14);

        root.setLeft(left);
        root.setRight(right);

        Node left2 = new Node();
        left2.setValue(4);

        Node right2 = new Node();
        right2.setValue(8);

        left.setRight(right2);
        left.setLeft(left2);

        Node left22 = new Node();
        left22.setValue(12);

        Node right22 = new Node();
        right22.setValue(16);

        right.setRight(right22);
        right.setLeft(left22);
        System.out.println("前序遍历------");
        printRootBefore(root);
        System.out.println("中序遍历------");
        printRootMid(root);
        System.out.println("后序遍历------");
        printRootEnd(root);
        System.out.println("广度优先遍历BFS");
        List<Integer> bfs = bfs(root);
        System.out.println(bfs.toString());
    }

    /**
     * 前序遍历
     * @param root
     */
    private static  void printRootBefore(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.getValue()); //打印root节点
        printRootBefore(root.getLeft()); //打印左节点
        printRootBefore(root.getRight());//打印右节点
    }

    /**
     * 中序遍历
     * @param root
     */
    private static  void printRootMid(Node root){
        if(root == null){
            return;
        }
        printRootMid(root.getLeft()); //打印左节点
        System.out.println(root.getValue()); //打印root节点
        printRootMid(root.getRight());//打印右节点
    }

    /**
     * 后序遍历
     * @param root
     */
    private static  void printRootEnd(Node root){
        if(root == null){
            return;
        }
        printRootEnd(root.getLeft()); //打印左节点
        printRootEnd(root.getRight());//打印右节点
        System.out.println(root.getValue()); //打印root节点
    }

    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    private static List<Integer> bfs(Node root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if(node.getLeft() !=null){
                queue.offer(node.getLeft());
            }
            if(node.getRight() != null){
                queue.offer(node.getRight());
            }
            result.add(node.getValue());
        }
        return result;
    }
    private static List<List<Integer>> print(Node root){
       List<List<Integer>> result = new ArrayList<>();
       if(root == null){
           return result;
       }
       Queue<Node> queue = new LinkedList<>();
       queue.offer(root);
       boolean flag = true;
       while (!queue.isEmpty()){
           List<Integer> temp = new ArrayList<>();
           int index = queue.size();
           Node node = queue.poll();

       }
       return result;
    }

}
